package util;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

public class OurInventory implements Listener {
    private static Inventory inv;
    private final Player p;

    // TODO: Needs Fixing
    public OurInventory(Player player) {
        inv = Bukkit.createInventory(null, 420, "Our Inventory");
        p = player;
    }

    public void openInventory() {
        p.openInventory(inv);
    }
}
