package me.josh444.projectjim.customitems;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.utils.Item;

public class JimItem {

	public ItemStack item;
	public String key;
	
	public JimItem(ItemStack item, String key) {
		this.item = item;
		this.key = key;
	}
	
	//Field journal
	public static final JimItem FIELD_JOURNAL = new JimItem(Item.make(Material.WRITTEN_BOOK, 1, ChatColor.DARK_PURPLE + "Field Journal"), "field_journal");
	
	//Compressed items
	public static final JimItem COMPRESSED_COBBLESTONE = new JimItem(Item.skull(SkullTexture.COMPRESSED_COBBLESTONE, 1, ChatColor.WHITE + "Compressed Cobblestone", ChatColor.GRAY + "9 Cobblestone"), "compressed_cobblestone");
	public static final JimItem DOUBLE_COMPRESSED_COBBLESTONE = new JimItem(Item.skull(SkullTexture.COMPRESSED_COBBLESTONE, 1, ChatColor.GREEN + "Double Compressed Cobblestone", ChatColor.GRAY + "81 Cobblestone"), "double_compressed_cobblestone");
	public static final JimItem TRIPLE_COMPRESSED_COBBLESTONE = new JimItem(Item.skull(SkullTexture.COMPRESSED_COBBLESTONE, 1, ChatColor.BLUE + "Triple Compressed Cobblestone", ChatColor.GRAY + "729 Cobblestone"), "triple_compressed_cobblestone");

}
