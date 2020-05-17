package me.Josh444.ProjectJim.CustomInventories;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import me.Josh444.ProjectJim.ProjectJim;
import me.Josh444.ProjectJim.Utils.Item;



public class FieldJournalInventory implements Listener {
	
	private Plugin plugin = ProjectJim.getPlugin(ProjectJim.class);
	
	public String inventoryName = "Field Journal";
		
	public void fieldJournalInventory(Player p){
		
		ItemStack glass = Item.make(Material.BLACK_STAINED_GLASS_PANE, 1, " ");
		ItemStack config = Item.make(Material.REDSTONE_TORCH, 1, ChatColor.RED + "Config");
		ItemStack pS = Item.skull(p, 1, (ChatColor.YELLOW + p.getName() + "'s Stats"));
		ItemStack rM = Item.make(Material.HOPPER, 1, ChatColor.YELLOW + "Research Materials");
		ItemStack cD = Item.make(Material.ENCHANTED_BOOK, 1, ChatColor.YELLOW + "Collected Data");
		ItemStack uQ = Item.make(Material.WRITABLE_BOOK, 1, ChatColor.LIGHT_PURPLE + "Unanswered Questions");
		ItemStack close = Item.make(Material.BARRIER, 1, ChatColor.RED + "Close");

		
		Inventory i = plugin.getServer().createInventory(null, 27, inventoryName);
		
		ItemStack[] fjGUI = new ItemStack[] {
				glass,glass,glass,glass,glass,glass,glass,glass,glass,
				glass,config,null,null,pS,rM,cD,uQ,glass,
				glass,glass,glass,glass,close,glass,glass,glass,glass
		};
		
		
		i.setContents(fjGUI);
		
		p.openInventory(i);
	}

}
