package me.josh444.projectjim.customitems;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.utils.Item;
import me.josh444.projectjim.utils.Mana;

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
	public static final JimItem COMPRESSED_COBBLESTONE = new JimItem(Item.skull(SkullTexture.COMPRESSED_COBBLESTONE, 1, ChatColor.WHITE + "Compressed Cobblestone", ChatColor.GRAY + "4 Cobblestone"), "compressed_cobblestone");
	public static final JimItem DOUBLE_COMPRESSED_COBBLESTONE = new JimItem(Item.skull(SkullTexture.COMPRESSED_COBBLESTONE, 1, ChatColor.GREEN + "Double Compressed Cobblestone", ChatColor.GRAY + "16 Cobblestone"), "double_compressed_cobblestone");
	public static final JimItem TRIPLE_COMPRESSED_COBBLESTONE = new JimItem(Item.skull(SkullTexture.COMPRESSED_COBBLESTONE, 1, ChatColor.BLUE + "Triple Compressed Cobblestone", ChatColor.GRAY + "64 Cobblestone"), "triple_compressed_cobblestone");

	public static final JimItem COMPRESSED_COAL = new JimItem(Item.skull(SkullTexture.COMPRESSED_COAL, 1, ChatColor.GREEN + "Compressed Coal", ChatColor.GRAY + "4 Coal"), "compressed_coal");
	public static final JimItem DOUBLE_COMPRESSED_COAL = new JimItem(Item.skull(SkullTexture.COMPRESSED_COAL, 1, ChatColor.BLUE + "Double Compressed Coal", ChatColor.GRAY + "16 Coal"), "double_compressed_coal");
	public static final JimItem TRIPLE_COMPRESSED_COAL = new JimItem(Item.skull(SkullTexture.COMPRESSED_COAL, 1, ChatColor.DARK_PURPLE + "Triple Compressed Coal", ChatColor.GRAY + "64 Coal"), "triple_compressed_coal");

	public static final JimItem COMPRESSED_IRON = new JimItem(Item.skull(SkullTexture.COMPRESSED_IRON, 1, ChatColor.GREEN + "Compressed Iron", ChatColor.GRAY + "4 Iron"), "compressed_iron");
	public static final JimItem DOUBLE_COMPRESSED_IRON = new JimItem(Item.skull(SkullTexture.COMPRESSED_IRON, 1, ChatColor.BLUE + "Double Compressed Iron", ChatColor.GRAY + "16 Iron"), "double_compressed_iron");
	public static final JimItem TRIPLE_COMPRESSED_IRON = new JimItem(Item.skull(SkullTexture.COMPRESSED_IRON, 1, ChatColor.DARK_PURPLE + "Triple Compressed Iron", ChatColor.GRAY + "64 Iron"), "triple_compressed_iron");

	public static final JimItem COMPRESSED_GOLD = new JimItem(Item.skull(SkullTexture.COMPRESSED_GOLD, 1, ChatColor.GREEN + "Compressed Gold", ChatColor.GRAY + "4 Gold"), "compressed_gold");
	public static final JimItem DOUBLE_COMPRESSED_GOLD = new JimItem(Item.skull(SkullTexture.COMPRESSED_GOLD, 1, ChatColor.BLUE + "Double Compressed Gold", ChatColor.GRAY + "16 Gold"), "double_compressed_gold");
	public static final JimItem TRIPLE_COMPRESSED_GOLD = new JimItem(Item.skull(SkullTexture.COMPRESSED_GOLD, 1, ChatColor.DARK_PURPLE + "Triple Compressed Gold", ChatColor.GRAY + "64 Gold"), "triple_compressed_gold");

	public static final JimItem COMPRESSED_LAPIS = new JimItem(Item.skull(SkullTexture.COMPRESSED_LAPIS, 1, ChatColor.WHITE + "Compressed Lapis", ChatColor.GRAY + "4 Lapis"), "compressed_lapis");
	public static final JimItem DOUBLE_COMPRESSED_LAPIS = new JimItem(Item.skull(SkullTexture.COMPRESSED_LAPIS, 1, ChatColor.GREEN + "Double Compressed Lapis", ChatColor.GRAY + "16 Lapis"), "double_compressed_lapis");
	public static final JimItem TRIPLE_COMPRESSED_LAPIS = new JimItem(Item.skull(SkullTexture.COMPRESSED_LAPIS, 1, ChatColor.BLUE + "Triple Compressed Lapis", ChatColor.GRAY + "64 Lapis"), "triple_compressed_lapis");

	public static final JimItem COMPRESSED_REDSTONE = new JimItem(Item.skull(SkullTexture.COMPRESSED_REDSTONE, 1, ChatColor.WHITE + "Compressed Redstone", ChatColor.GRAY + "4 Redstone"), "compressed_redstone");
	public static final JimItem DOUBLE_COMPRESSED_REDSTONE = new JimItem(Item.skull(SkullTexture.COMPRESSED_REDSTONE, 1, ChatColor.GREEN + "Double Compressed Redstone", ChatColor.GRAY + "16 Redstone"), "double_compressed_redstone");
	public static final JimItem TRIPLE_COMPRESSED_REDSTONE = new JimItem(Item.skull(SkullTexture.COMPRESSED_REDSTONE, 1, ChatColor.BLUE + "Triple Compressed Redstone", ChatColor.GRAY + "64 Redstone"), "triple_compressed_redstone");

	public static final JimItem COMPRESSED_EMERALD = new JimItem(Item.skull(SkullTexture.COMPRESSED_EMERALD, 1, ChatColor.BLUE + "Compressed Emerald", ChatColor.GRAY + "4 Emerald"), "compressed_emerald");
	public static final JimItem DOUBLE_COMPRESSED_EMERALD = new JimItem(Item.skull(SkullTexture.COMPRESSED_EMERALD, 1, ChatColor.DARK_PURPLE + "Double Compressed Emerald", ChatColor.GRAY + "16 Emerald"), "double_compressed_emerald");
	public static final JimItem TRIPLE_COMPRESSED_EMERALD = new JimItem(Item.skull(SkullTexture.COMPRESSED_EMERALD, 1, ChatColor.GOLD + "Triple Compressed Emerald", ChatColor.GRAY + "64 Emerald"), "triple_compressed_emerald");

	public static final JimItem COMPRESSED_DIAMOND = new JimItem(Item.skull(SkullTexture.COMPRESSED_DIAMOND, 1, ChatColor.BLUE + "Compressed Diamond", ChatColor.GRAY + "4 Diamond"), "compressed_diamond");
	public static final JimItem DOUBLE_COMPRESSED_DIAMOND = new JimItem(Item.skull(SkullTexture.COMPRESSED_DIAMOND, 1, ChatColor.DARK_PURPLE + "Double Compressed Diamond", ChatColor.GRAY + "16 Diamond"), "double_compressed_diamond");
	public static final JimItem TRIPLE_COMPRESSED_DIAMOND = new JimItem(Item.skull(SkullTexture.COMPRESSED_DIAMOND, 1, ChatColor.GOLD + "Triple Compressed Diamond", ChatColor.GRAY + "64 Diamond"), "triple_compressed_diamond");

	public static final JimItem COMPRESSED_OBSIDIAN = new JimItem(Item.skull(SkullTexture.COMPRESSED_OBSIDIAN, 1, ChatColor.BLUE + "Compressed Obsidian", ChatColor.GRAY + "4 Obsidian"), "compressed_obsidian");
	public static final JimItem DOUBLE_COMPRESSED_OBSIDIAN = new JimItem(Item.skull(SkullTexture.COMPRESSED_OBSIDIAN, 1, ChatColor.DARK_PURPLE + "Double Compressed Obsidian", ChatColor.GRAY + "16 Obsidian"), "double_compressed_obsidian");
	public static final JimItem TRIPLE_COMPRESSED_OBSIDIAN = new JimItem(Item.skull(SkullTexture.COMPRESSED_OBSIDIAN, 1, ChatColor.GOLD + "Triple Compressed Obsidian", ChatColor.GRAY + "64 Obsidian"), "triple_compressed_obsidian");

	//Portables in field journal
	public static final JimItem PORTABLE_CRAFTING_TABLE = new JimItem(CustomInventory.PORTABLE_CRAFTING_TABLE, "portable_crafting_table");
	public static final JimItem PORTABLE_TRASH_CAN = new JimItem(CustomInventory.PORTABLE_TRASH_CAN, "portable_trash_can");

	//Magic items that use mana
	public static final JimItem MAGIC_MISSILE_WAND = new JimItem(Item.wand(Material.BLAZE_ROD, 1, ChatColor.GOLD + "Magic Missile", ChatColor.GRAY + "Shoots a fireball at your enemies", Mana.prefix + ChatColor.DARK_PURPLE + "50 xp"), "magic_missile_wand");
	public static final JimItem ZAPP_WAND = new JimItem(Item.wand(Material.BLAZE_ROD, 1, ChatColor.GOLD + "Zapp", ChatColor.GRAY + "Shoots laser in your line of sight", Mana.prefix + ChatColor.DARK_PURPLE + "50 xp"), "zap_wand");

}
