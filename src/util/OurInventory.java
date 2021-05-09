package util;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class OurInventory implements Listener {
    public static ArrayList<ItemStack> items = new ArrayList<>();

    private static Inventory inv;

    // TODO: Needs Fixing
    public OurInventory() {
        inv = Bukkit.createInventory(null, 45, "Our Inventory");
        inv.setItem(40, new ItemStack(Material.REDSTONE));
    }


    public void openInventory(Player p) {
        Bukkit.broadcastMessage(inv.toString());
        p.openInventory(inv);
    }
}
