package eventlisteners;

import main.Ourcraft;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Bukkit.broadcastMessage(event.getPlayer().getName() + " AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        Ourcraft.players.add(event.getPlayer());
    }
}
