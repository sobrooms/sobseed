package emu.grasscutter.command.commands;

import com.google.protobuf.ByteString;
import emu.grasscutter.Grasscutter;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.server.packet.send.PacketWindSeedClientNotify;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@Command(
    label = "windy",
    usage = "",
    aliases = { "w" },
    permission = "player.windy",
    permissionTargeted = "player.windy.others"
)
public class WindyCommand implements CommandHandler {

    @Override
    public void execute(final Player sender, final Player targetPlayer, final List<String> args) {
        // no try{} catch{} cuz i have skill issue and it doesnt work :sob:
        // I made try{} and catch{} now leak beta
        var config = Grasscutter.getConfig();
        String windydir = config.folderStructure.windy;
        String path = windydir + "/" + args.get(0) + ".luac";
        byte[] data;
        ByteString byteString;
        try {
            data = Files.readAllBytes(new File(path).toPath());
            byteString = ByteString.copyFrom(data);
        } catch (FileNotFoundException e) {
            sender.sendMessage(targetPlayer, "Missing file: " + path);
            return;
        } catch (IOException e) {
            sender.sendMessage(targetPlayer, "Error reading file: " + path);
            return;
        }
        targetPlayer.sendPacket(new PacketWindSeedClientNotify(byteString));
        CommandHandler.sendMessage(sender, "Sob!");
    }
}
