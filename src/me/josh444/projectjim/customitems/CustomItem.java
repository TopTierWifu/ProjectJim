package me.josh444.projectjim.customitems;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.utils.Item;

public class CustomItem {

	//Field Journal
	public static final ItemStack FIELD_JOURNAL = Item.make(Material.WRITTEN_BOOK, 1, ChatColor.DARK_PURPLE + "Field Journal");
	
	//Compressed Items
	public static final ItemStack COMPRESSED_COBBLESTONE = Item.skull(SkullTexture.COMPRESSED_COBBLESTONE, 1);
}
