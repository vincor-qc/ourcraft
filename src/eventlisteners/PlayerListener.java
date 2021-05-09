package eventlisteners;

import main.Ourcraft;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Bukkit.broadcastMessage(event.getPlayer().getName() + " AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        Ourcraft.players.add(event.getPlayer());
    }

    @EventHandler
    public void onPLayerExpChange(PlayerExpChangeEvent event) {
        Bukkit.broadcastMessage(String.valueOf(event.getAmount()));
        Ourcraft.ourExp += event.getAmount();
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getInventory().getType() != InventoryType.PLAYER) return;

        if (event.getSlot() > 35 && event.getSlot() < 45) {

            // TODO: Individual functions
            if (event.getSlot() == 41) {
                Bukkit.broadcastMessage("CLICKED SLOT 41");
            }

            Bukkit.broadcastMessage("CLICK CLEARED");
            event.setCancelled(true);
        }
    }

    public void onInventoryDrag(InventoryDragEvent event) {
        if (event.getInventory().getType() != InventoryType.PLAYER) return;
        // TODO: Fix dragging
    }
}
