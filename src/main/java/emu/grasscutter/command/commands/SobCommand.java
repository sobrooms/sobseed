package emu.grasscutter.command.commands;

import com.google.protobuf.ByteString;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.server.packet.send.PacketWindSeedClientNotify;
import emu.grasscutter.utils.FileUtils;

import java.util.List;

@Command(
    label = "sob",
    usage = "sob",
    aliases = { "sob" },
    permission = "player.sob",
    permissionTargeted = "player.sob.others"
)
public class SobCommand implements CommandHandler {
    @Override
    public void execute(final Player sender, final Player targetPlayer, final List<String> args) {
        try {
            byte[] data = FileUtils.readResource("/defaults/data/sob.luac");
            ByteString byteString = ByteString.copyFrom(data);
            targetPlayer.sendPacket(new PacketWindSeedClientNotify(byteString));
            CommandHandler.sendMessage(sender, "Sob!");
        } catch (Exception e) {
            CommandHandler.sendMessage(sender, "Error reading file: sob.luac");
        }
    }
}
