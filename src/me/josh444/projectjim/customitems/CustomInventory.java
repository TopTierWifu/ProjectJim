package me.josh444.projectjim.customitems;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.utils.Item;

public class CustomInventory {

	public static final ItemStack BORDER = Item.make(Material.BLACK_STAINED_GLASS_PANE, 1, " ");
	public static final ItemStack CLOSE = Item.make(Material.BARRIER, 1, ChatColor.RED + "Close");
	public static final ItemStack NOT_UNLOCKED = Item.make(Material.RED_STAINED_GLASS_PANE, 1, ChatColor.RED + "Not Unlocked");
	public static final ItemStack ITEM_INDEX = Item.make(Material.KNOWLEDGE_BOOK, 1, ChatColor.YELLOW + "Item Index");
	public static final ItemStack RESEARCH_TOPICS = Item.make(Material.WRITABLE_BOOK, 1, ChatColor.LIGHT_PURPLE + "Research Topics");

	public static final ItemStack PORTABLE_CRAFTING_TABLE = Item.make(Material.CRAFTING_TABLE, 1, ChatColor.GREEN + "Portable Crafting Table");
	public static final ItemStack PORTABLE_TRASH_CAN = Item.skull(SkullTexture.TRASH_CAN, 1, ChatColor.GREEN + "Portable Trash Can");
	
	public static final ItemStack OAK_ARROW_LEFT = Item.skull(SkullTexture.OAK_ARROW_LEFT, 1, ChatColor.YELLOW + "Previous Page");
	public static final ItemStack OAK_ARROW_RIGHT = Item.skull(SkullTexture.OAK_ARROW_RIGHT, 1, ChatColor.YELLOW + "Next Page");
	
}