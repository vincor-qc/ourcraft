package commands;

import main.Ourcraft;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class DebugCommand implements CommandExecutor {
    private final Ourcraft plugin;

    public DebugCommand(Ourcraft plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        Bukkit.broadcastMessage("DEBUG");

        // Code for debugging in certain scenarios

        return false;
    }
}
