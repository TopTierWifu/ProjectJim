package me.josh444.projectjim.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;

import me.josh444.projectjim.inventories.Items;
import me.josh444.projectjim.items.JimItem.JimCategory;
import me.josh444.projectjim.items.JimItem.JimType;
import me.josh444.projectjim.utils.Item;
import me.josh444.projectjim.utils.Mana;
import me.josh444.projectjim.utils.SkullTexture;

public class JimItems {

	public static final JimItem FIELD_JOURNAL = new JimItem(Item.make(Material.WRITTEN_BOOK, 1, ChatColor.DARK_PURPLE + "Field Journal"), "field_journal", JimType.DEFAULT, JimCategory.DEFAULT);

	public static final JimItem COMPRESSED_COBBLESTONE = new JimItem(Item.skull(SkullTexture.COMPRESSED_COBBLESTONE, 1, ChatColor.WHITE + "Compressed Cobblestone", ChatColor.GRAY + "4 Cobblestone"), "compressed_cobblestone", JimType.RECIPE, JimCategory.COMPRESSED, Item.make(Material.COBBLESTONE, 256));
	public static final JimItem DOUBLE_COMPRESSED_COBBLESTONE = new JimItem(Item.skull(SkullTexture.COMPRESSED_COBBLESTONE, 1, ChatColor.GREEN + "Double Compressed Cobblestone", ChatColor.GRAY + "16 Cobblestone"), "double_compressed_cobblestone", JimType.RECIPE, JimCategory.COMPRESSED, Item.setAmount(JimItems.COMPRESSED_COBBLESTONE.getItem(), 128));
	public static final JimItem TRIPLE_COMPRESSED_COBBLESTONE = new JimItem(Item.skull(SkullTexture.COMPRESSED_COBBLESTONE, 1, ChatColor.BLUE + "Triple Compressed Cobblestone", ChatColor.GRAY + "64 Cobblestone"), "triple_compressed_cobblestone", JimType.RECIPE, JimCategory.COMPRESSED, Item.setAmount(JimItems.DOUBLE_COMPRESSED_COBBLESTONE.getItem(), 64));
	public static final JimItem QUADRUPLE_COMPRESSED_COBBLESTONE = new JimItem(Item.skull(SkullTexture.COMPRESSED_COBBLESTONE, 1, ChatColor.DARK_PURPLE + "Quadruple Compressed Cobblestone", ChatColor.GRAY + "256 Cobblestone"), "quadruple_compressed_cobblestone", JimType.RECIPE, JimCategory.COMPRESSED, Item.setAmount(JimItems.TRIPLE_COMPRESSED_COBBLESTONE.getItem(), 32));
	public static final JimItem QUINTUPLE_COMPRESSED_COBBLESTONE = new JimItem(Item.skull(SkullTexture.COMPRESSED_COBBLESTONE, 1, ChatColor.GOLD + "Quintuple Cobblestone", ChatColor.GRAY + "1024 Cobblestone"), "quintuple_compressed_cobblestone", JimType.RECIPE, JimCategory.COMPRESSED, Item.setAmount(JimItems.QUADRUPLE_COMPRESSED_COBBLESTONE.getItem(), 16));
	public static final JimItem SEXTUPLE_COMPRESSED_COBBLESTONE = new JimItem(Item.skull(SkullTexture.COMPRESSED_COBBLESTONE, 1, ChatColor.LIGHT_PURPLE + "Sextuple Compressed Cobblestone", ChatColor.GRAY + "4096 Cobblestone"), "sextuple_compressed_cobblestone", JimType.RECIPE, JimCategory.COMPRESSED, Item.setAmount(JimItems.QUINTUPLE_COMPRESSED_COBBLESTONE.getItem(), 8));
	
	public static final JimItem COMPRESSED_COAL = new JimItem(Item.skull(SkullTexture.COMPRESSED_COAL, 1, ChatColor.GREEN + "Compressed Coal", ChatColor.GRAY + "4 Coal"), "compressed_coal", JimType.RECIPE, JimCategory.COMPRESSED, Item.make(Material.COAL, 128));
	public static final JimItem DOUBLE_COMPRESSED_COAL = new JimItem(Item.skull(SkullTexture.COMPRESSED_COAL, 1, ChatColor.BLUE + "Double Compressed Coal", ChatColor.GRAY + "16 Coal"), "double_compressed_coal", JimType.RECIPE, JimCategory.COMPRESSED, Item.setAmount(JimItems.COMPRESSED_COAL.getItem(), 64));
	public static final JimItem TRIPLE_COMPRESSED_COAL = new JimItem(Item.skull(SkullTexture.COMPRESSED_COAL, 1, ChatColor.DARK_PURPLE + "Triple Compressed Coal", ChatColor.GRAY + "64 Coal"), "triple_compressed_coal", JimType.RECIPE, JimCategory.COMPRESSED, Item.setAmount(JimItems.DOUBLE_COMPRESSED_COAL.getItem(), 32));

	public static final JimItem COMPRESSED_IRON = new JimItem(Item.skull(SkullTexture.COMPRESSED_IRON, 1, ChatColor.GREEN + "Compressed Iron", ChatColor.GRAY + "4 Iron"), "compressed_iron", JimType.RECIPE, JimCategory.COMPRESSED, Item.make(Material.IRON_INGOT, 64));
	public static final JimItem DOUBLE_COMPRESSED_IRON = new JimItem(Item.skull(SkullTexture.COMPRESSED_IRON, 1, ChatColor.BLUE + "Double Compressed Iron", ChatColor.GRAY + "16 Iron"), "double_compressed_iron", JimType.RECIPE, JimCategory.COMPRESSED, Item.setAmount(JimItems.COMPRESSED_IRON.getItem(), 32));
	public static final JimItem TRIPLE_COMPRESSED_IRON = new JimItem(Item.skull(SkullTexture.COMPRESSED_IRON, 1, ChatColor.DARK_PURPLE + "Triple Compressed Iron", ChatColor.GRAY + "64 Iron"), "triple_compressed_iron", JimType.RECIPE, JimCategory.COMPRESSED, Item.setAmount(JimItems.DOUBLE_COMPRESSED_IRON.getItem(), 16));

	public static final JimItem COMPRESSED_GOLD = new JimItem(Item.skull(SkullTexture.COMPRESSED_GOLD, 1, ChatColor.GREEN + "Compressed Gold", ChatColor.GRAY + "4 Gold"), "compressed_gold", JimType.RECIPE, JimCategory.COMPRESSED, Item.make(Material.GOLD_INGOT, 64));
	public static final JimItem DOUBLE_COMPRESSED_GOLD = new JimItem(Item.skull(SkullTexture.COMPRESSED_GOLD, 1, ChatColor.BLUE + "Double Compressed Gold", ChatColor.GRAY + "16 Gold"), "double_compressed_gold", JimType.RECIPE, JimCategory.COMPRESSED, Item.setAmount(JimItems.COMPRESSED_GOLD.getItem(), 32));
	public static final JimItem TRIPLE_COMPRESSED_GOLD = new JimItem(Item.skull(SkullTexture.COMPRESSED_GOLD, 1, ChatColor.DARK_PURPLE + "Triple Compressed Gold", ChatColor.GRAY + "64 Gold"), "triple_compressed_gold", JimType.RECIPE, JimCategory.COMPRESSED, Item.setAmount(JimItems.DOUBLE_COMPRESSED_GOLD.getItem(), 16));

	public static final JimItem COMPRESSED_LAPIS = new JimItem(Item.skull(SkullTexture.COMPRESSED_LAPIS, 1, ChatColor.WHITE + "Compressed Lapis", ChatColor.GRAY + "4 Lapis"), "compressed_lapis", JimType.RECIPE, JimCategory.COMPRESSED, Item.make(Material.LAPIS_LAZULI, 256));
	public static final JimItem DOUBLE_COMPRESSED_LAPIS = new JimItem(Item.skull(SkullTexture.COMPRESSED_LAPIS, 1, ChatColor.GREEN + "Double Compressed Lapis", ChatColor.GRAY + "16 Lapis"), "double_compressed_lapis", JimType.RECIPE, JimCategory.COMPRESSED, Item.setAmount(JimItems.COMPRESSED_LAPIS.getItem(), 128));
	public static final JimItem TRIPLE_COMPRESSED_LAPIS = new JimItem(Item.skull(SkullTexture.COMPRESSED_LAPIS, 1, ChatColor.BLUE + "Triple Compressed Lapis", ChatColor.GRAY + "64 Lapis"), "triple_compressed_lapis", JimType.RECIPE, JimCategory.COMPRESSED, Item.setAmount(JimItems.DOUBLE_COMPRESSED_LAPIS.getItem(), 64));

	public static final JimItem COMPRESSED_REDSTONE = new JimItem(Item.skull(SkullTexture.COMPRESSED_REDSTONE, 1, ChatColor.WHITE + "Compressed Redstone", ChatColor.GRAY + "4 Redstone"), "compressed_redstone", JimType.RECIPE, JimCategory.COMPRESSED, Item.make(Material.REDSTONE, 256));
	public static final JimItem DOUBLE_COMPRESSED_REDSTONE = new JimItem(Item.skull(SkullTexture.COMPRESSED_REDSTONE, 1, ChatColor.GREEN + "Double Compressed Redstone", ChatColor.GRAY + "16 Redstone"), "double_compressed_redstone", JimType.RECIPE, JimCategory.COMPRESSED, Item.setAmount(JimItems.COMPRESSED_REDSTONE.getItem(), 128));
	public static final JimItem TRIPLE_COMPRESSED_REDSTONE = new JimItem(Item.skull(SkullTexture.COMPRESSED_REDSTONE, 1, ChatColor.BLUE + "Triple Compressed Redstone", ChatColor.GRAY + "64 Redstone"), "triple_compressed_redstone", JimType.RECIPE, JimCategory.COMPRESSED, Item.setAmount(JimItems.DOUBLE_COMPRESSED_REDSTONE.getItem(), 64));

	public static final JimItem COMPRESSED_EMERALD = new JimItem(Item.skull(SkullTexture.COMPRESSED_EMERALD, 1, ChatColor.BLUE + "Compressed Emerald", ChatColor.GRAY + "4 Emerald"), "compressed_emerald", JimType.RECIPE, JimCategory.COMPRESSED, Item.make(Material.EMERALD, 64));
	public static final JimItem DOUBLE_COMPRESSED_EMERALD = new JimItem(Item.skull(SkullTexture.COMPRESSED_EMERALD, 1, ChatColor.DARK_PURPLE + "Double Compressed Emerald", ChatColor.GRAY + "16 Emerald"), "double_compressed_emerald", JimType.RECIPE, JimCategory.COMPRESSED, Item.setAmount(JimItems.COMPRESSED_EMERALD.getItem(), 32));
	public static final JimItem TRIPLE_COMPRESSED_EMERALD = new JimItem(Item.skull(SkullTexture.COMPRESSED_EMERALD, 1, ChatColor.GOLD + "Triple Compressed Emerald", ChatColor.GRAY + "64 Emerald"), "triple_compressed_emerald", JimType.RECIPE, JimCategory.COMPRESSED, Item.setAmount(JimItems.DOUBLE_COMPRESSED_EMERALD.getItem(), 16));

	public static final JimItem COMPRESSED_DIAMOND = new JimItem(Item.skull(SkullTexture.COMPRESSED_DIAMOND, 1, ChatColor.BLUE + "Compressed Diamond", ChatColor.GRAY + "4 Diamond"), "compressed_diamond", JimType.RECIPE, JimCategory.COMPRESSED, Item.make(Material.DIAMOND, 32));
	public static final JimItem DOUBLE_COMPRESSED_DIAMOND = new JimItem(Item.skull(SkullTexture.COMPRESSED_DIAMOND, 1, ChatColor.DARK_PURPLE + "Double Compressed Diamond", ChatColor.GRAY + "16 Diamond"), "double_compressed_diamond", JimType.RECIPE, JimCategory.COMPRESSED, Item.setAmount(JimItems.COMPRESSED_DIAMOND.getItem(), 16));
	public static final JimItem TRIPLE_COMPRESSED_DIAMOND = new JimItem(Item.skull(SkullTexture.COMPRESSED_DIAMOND, 1, ChatColor.GOLD + "Triple Compressed Diamond", ChatColor.GRAY + "64 Diamond"), "triple_compressed_diamond", JimType.RECIPE, JimCategory.COMPRESSED, Item.setAmount(JimItems.DOUBLE_COMPRESSED_DIAMOND.getItem(), 8));

	public static final JimItem COMPRESSED_OBSIDIAN = new JimItem(Item.skull(SkullTexture.COMPRESSED_OBSIDIAN, 1, ChatColor.BLUE + "Compressed Obsidian", ChatColor.GRAY + "4 Obsidian"), "compressed_obsidian", JimType.RECIPE, JimCategory.COMPRESSED, Item.make(Material.OBSIDIAN, 64));
	public static final JimItem DOUBLE_COMPRESSED_OBSIDIAN = new JimItem(Item.skull(SkullTexture.COMPRESSED_OBSIDIAN, 1, ChatColor.DARK_PURPLE + "Double Compressed Obsidian", ChatColor.GRAY + "16 Obsidian"), "double_compressed_obsidian", JimType.RECIPE, JimCategory.COMPRESSED, Item.setAmount(JimItems.COMPRESSED_OBSIDIAN.getItem(), 32));
	public static final JimItem TRIPLE_COMPRESSED_OBSIDIAN = new JimItem(Item.skull(SkullTexture.COMPRESSED_OBSIDIAN, 1, ChatColor.GOLD + "Triple Compressed Obsidian", ChatColor.GRAY + "64 Obsidian"), "triple_compressed_obsidian", JimType.RECIPE, JimCategory.COMPRESSED, Item.setAmount(JimItems.DOUBLE_COMPRESSED_OBSIDIAN.getItem(), 16));
	
	public static final JimItem PORTABLE_CRAFTING_TABLE = new JimItem(Items.PORTABLE_CRAFTING_TABLE, "portable_crafting_table", JimType.PORTABLE, JimCategory.PORTABLE, Item.make(Material.OAK_LOG, 128));
	public static final JimItem PORTABLE_TRASH_CAN = new JimItem(Items.PORTABLE_TRASH_CAN, "portable_trash_can", JimType.PORTABLE, JimCategory.PORTABLE, Item.setAmount(JimItems.COMPRESSED_IRON.getItem(), 8));
	
	public static final JimItem MAGIC_MISSILE_WAND = new JimItem(Item.wand(Material.BLAZE_ROD, 1, ChatColor.GOLD + "Magic Missile", ChatColor.GRAY + "Shoots a fireball at your enemies", Mana.prefix + ChatColor.DARK_PURPLE + "50 xp"), "magic_missile_wand", JimType.RECIPE, JimCategory.MAGIC_WANDS, Item.make(Material.COBBLESTONE));
	public static final JimItem ZAPP_WAND = new JimItem(Item.wand(Material.BLAZE_ROD, 1, ChatColor.GOLD + "Zapp", ChatColor.GRAY + "Shoots laser in your line of sight", Mana.prefix + ChatColor.DARK_PURPLE + "50 xp"), "zap_wand", JimType.RECIPE, JimCategory.MAGIC_WANDS, Item.make(Material.COBBLESTONE));

}
