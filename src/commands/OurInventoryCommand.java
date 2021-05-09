package commands;

import main.Ourcraft;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OurInventoryCommand implements CommandExecutor {
    private final Ourcraft plugin;

    public OurInventoryCommand(Ourcraft plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender instanceof Player) {
            Ourcraft.inv.openInventory(((Player) sender).getPlayer());
        } else {
            Bukkit.broadcastMessage("SENDER NOT INSTANCE OF PLAYER");
        }

        return false;
    }
}
