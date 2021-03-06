package joshie.progression.commands;

import joshie.progression.network.PacketHandler;
import joshie.progression.network.PacketReload;
import net.minecraft.command.ICommandSender;

public class CommandReload extends AbstractCommand {
    @Override
    public String getCommandName() {
        return "reload";
    }

    @Override
    public boolean processCommand(ICommandSender sender, String[] parameters) {
        if (sender.getEntityWorld().isRemote) {
            PacketHandler.sendToServer(new PacketReload());
        } else PacketReload.handle();

        return true;
    }
}
