package main;

import commands.DebugCommand;
import eventlisteners.PlayerListener;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public class Ourcraft extends JavaPlugin {
    public static ArrayList<Player> players = new ArrayList<>();

    @Override
    public void onEnable() {
        this.getCommand("debug").setExecutor(new DebugCommand(this));
        this.getServer().getPluginManager().registerEvents(new PlayerListener(), this);
    }

    @Override
    public void onDisable() {

    }
}
