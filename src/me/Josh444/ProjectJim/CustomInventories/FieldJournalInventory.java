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
import me.Josh444.ProjectJim.Utils.PlayerStats;



public class FieldJournalInventory implements Listener {
	
	private Plugin plugin = ProjectJim.getPlugin(ProjectJim.class);
	
	public static String inventoryName = "Field Journal";
		
	public void fieldJournalInventory(Player p){
		
		String[]attributes = PlayerStats.attributes(p);
		
		ItemStack gl = Item.make(Material.BLACK_STAINED_GLASS_PANE, 1, " ");
		ItemStack g2 = Item.make(Material.RED_STAINED_GLASS_PANE, 1, ChatColor.RED + "Not Unlocked");	
		
		ItemStack sp = Item.make(Material.NETHER_STAR, 1, ChatColor.YELLOW + "Stat Points");
		ItemStack rm = Item.make(Material.HOPPER, 1, ChatColor.YELLOW + "Research Materials");
		ItemStack ps = Item.skull(p, 1, (ChatColor.YELLOW + p.getName() + "'s Stats"), attributes);
		ItemStack cd = Item.make(Material.ENCHANTED_BOOK, 1, ChatColor.YELLOW + "Collected Data");
		ItemStack uq = Item.make(Material.WRITABLE_BOOK, 1, ChatColor.LIGHT_PURPLE + "Unanswered Questions");
		
		ItemStack et = Item.make(Material.ENCHANTING_TABLE, 1, ChatColor.GREEN + "Portable Enchanting Table");
		ItemStack an = Item.make(Material.ANVIL, 1, ChatColor.GREEN + "Portable Anvil");
		ItemStack ct = Item.make(Material.CRAFTING_TABLE, 1, ChatColor.GREEN + "Portable Crafting Table");
		ItemStack ec = Item.make(Material.ENDER_CHEST, 1, ChatColor.GREEN + "Portable Enderchest");
		ItemStack gs = Item.make(Material.GRINDSTONE, 1, ChatColor.GREEN + "Portable Grindstone");
		ItemStack ca = Item.make(Material.CARTOGRAPHY_TABLE, 1, ChatColor.GREEN + "Portable Cartography Table");
		ItemStack st = Item.make(Material.STONECUTTER, 1, ChatColor.GREEN + "Portable Stonecutter");
		ItemStack lm = Item.make(Material.LOOM, 1, ChatColor.GREEN + "Portable Loom");
		
		ItemStack as = Item.make(Material.PLAYER_HEAD, 1, ChatColor.YELLOW + "Attribute Settings");
		ItemStack co = Item.make(Material.REDSTONE_TORCH, 1, ChatColor.RED + "Config");
		
		Inventory i = plugin.getServer().createInventory(null, 54, inventoryName);
		
		ItemStack[] fjGUI = new ItemStack[] {
				gl,gl,gl,gl,gl,gl,gl,gl,gl,
				gl,gl,sp,rm,ps,cd,uq,gl,gl,
				gl,gl,gl,gl,gl,gl,gl,gl,gl,
				gl,gl,g2,g2,g2,g2,g2,gl,gl,
                gl,gl,gl,g2,g2,g2,gl,gl,gl,
				co,gl,gl,gl,gl,gl,gl,gl,as
		};
		
		//gl,gl,et,an,ct,ec,gs,gl,gl,
		//gl,gl,gl,ca,st,lm,gl,gl,gl,
		
		i.setContents(fjGUI);
		
		p.openInventory(i);
	}

}
