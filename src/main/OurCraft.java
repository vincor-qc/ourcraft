package main;

import commands.DebugCommand;
import commands.OurInventoryCommand;
import eventlisteners.PlayerListener;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import util.OurInventory;

import java.util.ArrayList;

public class Ourcraft extends JavaPlugin {
    public static ArrayList<Player> players = new ArrayList<>();
    public static int ourExp = 0;

    public static final OurInventory inv = new OurInventory();

    @Override
    public void onEnable() {
        // Commands
        this.getCommand("debug").setExecutor(new DebugCommand(this));
        this.getCommand("ourinventory").setExecutor(new OurInventoryCommand(this));

        // Events
        // TODO: Init Our Inventory once fixed
        this.getServer().getPluginManager().registerEvents(new PlayerListener(), this);
    }

    @Override
    public void onDisable() {

    }
}
