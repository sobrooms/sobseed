package emu.grasscutter.command.commands;

import static emu.grasscutter.config.Configuration.*;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.server.packet.send.PacketWindSeedClientNotify;
import java.io.FileNotFoundException;
import java.io.IOException;
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
        var config = Grasscutter.getConfig();
        String windydir = config.folderStructure.windy;
        String path = windydir + args.get(0) + ".luac";
        targetPlayer.sendPacket(new PacketWindSeedClientNotify(path));
        CommandHandler.sendMessage(sender, "Sobdy!");
    }
}
