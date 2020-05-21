package me.josh444.projectjim.customitems;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.utils.Item;

public class CustomInventory {

	public static final ItemStack BORDER = Item.make(Material.BLACK_STAINED_GLASS_PANE, 1, " ");
	public static final ItemStack NOT_UNLOCKED = Item.make(Material.RED_STAINED_GLASS_PANE, 1, ChatColor.RED + "Not Unlocked");
	public static final ItemStack STAT_POINTS = Item.make(Material.NETHER_STAR, 1, ChatColor.YELLOW + "Stat Points");
	public static final ItemStack RESEARCH_MATERIALS = Item.make(Material.HOPPER, 1, ChatColor.YELLOW + "Research Materials");
	public static final ItemStack COLLECTED_DATA = Item.make(Material.ENCHANTED_BOOK, 1, ChatColor.YELLOW + "Collected Data");
	public static final ItemStack RESEARCH_TOPICS = Item.make(Material.WRITABLE_BOOK, 1, ChatColor.LIGHT_PURPLE + "Research Topics");
}
