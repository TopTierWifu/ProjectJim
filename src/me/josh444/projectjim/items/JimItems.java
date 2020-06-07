package me.josh444.projectjim.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;

import me.josh444.projectjim.items.JimItem.Type;
import me.josh444.projectjim.utils.Item;
import me.josh444.projectjim.utils.ItemAttribute;

public class JimItems {
	
	public static final JimItem T2_DIAMOND_BOOTS = new JimItem(Item.make(Material.DIAMOND_BOOTS, 1, ChatColor.BLUE + "Tier 2 Diamond Boots", ItemAttribute.T2_DIAMOND_BOOTS), "t2_diamond_boots", Type.ARMOR);
	public static final JimItem T3_DIAMOND_BOOTS = new JimItem(Item.make(Material.DIAMOND_BOOTS, 1, ChatColor.DARK_PURPLE + "Tier 3 Diamond Boots", ItemAttribute.T3_DIAMOND_BOOTS), "t3_diamond_boots", Type.ARMOR);
	public static final JimItem T4_DIAMOND_BOOTS = new JimItem(Item.make(Material.DIAMOND_BOOTS, 1, ChatColor.LIGHT_PURPLE + "Tier 4 Diamond Boots", ItemAttribute.T4_DIAMOND_BOOTS), "t4_diamond_boots", Type.ARMOR);

	public static final JimItem C1_COBBLESTONE = new JimItem(Item.make(Material.COBBLESTONE, 1, ChatColor.RED + "Compressed Cobblestone", ChatColor.GRAY + "4 Cobblestone"), "c1_cobblestone", Type.COMPRESSED);
	public static final JimItem C2_COBBLESTONE = new JimItem(Item.make(Material.COBBLESTONE, 1, ChatColor.GOLD + "Double Compressed Cobblestone", ChatColor.GRAY + "16 Cobblestone"), "c2_cobblestone", Type.COMPRESSED);
	public static final JimItem C3_COBBLESTONE = new JimItem(Item.make(Material.COBBLESTONE, 1, ChatColor.YELLOW + "Triple Compressed Cobblestone", ChatColor.GRAY + "64 Cobblestone"), "c3_cobblestone", Type.COMPRESSED);
	public static final JimItem C4_COBBLESTONE = new JimItem(Item.make(Material.COBBLESTONE, 1, ChatColor.GREEN + "Quadruple Compressed Cobblestone", ChatColor.GRAY + "256 Cobblestone"), "c4_cobblestone", Type.COMPRESSED);
	public static final JimItem C5_COBBLESTONE = new JimItem(Item.make(Material.COBBLESTONE, 1, ChatColor.AQUA + "Quintuple Compressed Cobblestone", ChatColor.GRAY + "1,024 Cobblestone"), "c5_cobblestone", Type.COMPRESSED);
	public static final JimItem C6_COBBLESTONE = new JimItem(Item.make(Material.COBBLESTONE, 1, ChatColor.BLUE + "Sextuple Compressed Cobblestone", ChatColor.GRAY + "4,096 Cobblestone"), "c6_cobblestone", Type.COMPRESSED);
	public static final JimItem C7_COBBLESTONE = new JimItem(Item.make(Material.COBBLESTONE, 1, ChatColor.DARK_PURPLE + "Septuple Compressed Cobblestone", ChatColor.GRAY + "16,384 Cobblestone"), "c7_cobblestone", Type.COMPRESSED);
	public static final JimItem C8_COBBLESTONE = new JimItem(Item.make(Material.COBBLESTONE, 1, ChatColor.LIGHT_PURPLE + "Octuple Compressed Cobblestone", ChatColor.GRAY + "65,536 Cobblestone"), "c8_cobblestone", Type.COMPRESSED);

	public static final JimItem C1_COAL = new JimItem(Item.make(Material.COAL, 1, ChatColor.YELLOW + "Compressed Coal", ChatColor.GRAY + "4 Coal"), "c1_coal", Type.COMPRESSED);
	public static final JimItem C2_COAL = new JimItem(Item.make(Material.COAL, 1, ChatColor.GREEN + "Double Compressed Coal", ChatColor.GRAY + "16 Coal"), "c2_coal", Type.COMPRESSED);
	public static final JimItem C3_COAL = new JimItem(Item.make(Material.COAL, 1, ChatColor.AQUA + "Triple Compressed Coal", ChatColor.GRAY + "64 Coal"), "c3_coal", Type.COMPRESSED);

	public static final JimItem C1_IRON = new JimItem(Item.make(Material.IRON_INGOT, 1, ChatColor.GREEN + "Compressed Iron", ChatColor.GRAY + "4 Iron"), "c1_iron", Type.COMPRESSED);
	public static final JimItem C2_IRON = new JimItem(Item.make(Material.IRON_INGOT, 1, ChatColor.AQUA + "Double Compressed Iron", ChatColor.GRAY + "16 Iron"), "c2_iron", Type.COMPRESSED);
	public static final JimItem C3_IRON = new JimItem(Item.make(Material.IRON_INGOT, 1, ChatColor.BLUE + "Triple Compressed Iron", ChatColor.GRAY + "64 Iron"), "c3_iron", Type.COMPRESSED);

	public static final JimItem C1_GOLD = new JimItem(Item.make(Material.GOLD_INGOT, 1, ChatColor.AQUA + "Compressed Gold", ChatColor.GRAY + "4 Gold"), "c1_gold", Type.COMPRESSED);
	public static final JimItem C2_GOLD = new JimItem(Item.make(Material.GOLD_INGOT, 1, ChatColor.BLUE + "Double Compressed Gold", ChatColor.GRAY + "16 Gold"), "c2_gold", Type.COMPRESSED);
	public static final JimItem C3_GOLD = new JimItem(Item.make(Material.GOLD_INGOT, 1, ChatColor.DARK_PURPLE + "Triple Compressed Gold", ChatColor.GRAY + "64 Gold"), "c3_gold", Type.COMPRESSED);

	public static final JimItem C1_LAPIS = new JimItem(Item.make(Material.LAPIS_LAZULI, 1, ChatColor.GREEN + "Compressed Lapis", ChatColor.GRAY + "4 Lapis"), "c1_lapis", Type.COMPRESSED);
	public static final JimItem C2_LAPIS = new JimItem(Item.make(Material.LAPIS_LAZULI, 1, ChatColor.AQUA + "Double Compressed Lapis", ChatColor.GRAY + "16 Lapis"), "c2_lapis", Type.COMPRESSED);
	public static final JimItem C3_LAPIS = new JimItem(Item.make(Material.LAPIS_LAZULI, 1, ChatColor.BLUE + "Triple Compressed Lapis", ChatColor.GRAY + "64 Lapis"), "c3_lapis", Type.COMPRESSED);

	public static final JimItem C1_REDSTONE = new JimItem(Item.make(Material.REDSTONE, 1, ChatColor.YELLOW + "Compressed Redstone", ChatColor.GRAY + "4 Redstone"), "c1_redstone", Type.COMPRESSED);
	public static final JimItem C2_REDSTONE = new JimItem(Item.make(Material.REDSTONE, 1, ChatColor.GREEN + "Double Compressed Redstone", ChatColor.GRAY + "16 Redstone"), "c2_redstone", Type.COMPRESSED);
	public static final JimItem C3_REDSTONE = new JimItem(Item.make(Material.REDSTONE, 1, ChatColor.AQUA + "Triple Compressed Redstone", ChatColor.GRAY + "64 Redstone"), "c3_redstone", Type.COMPRESSED);

	public static final JimItem C1_EMERALD = new JimItem(Item.make(Material.EMERALD, 1, ChatColor.AQUA + "Compressed Emerald", ChatColor.GRAY + "4 Emerald"), "c1_emerald", Type.COMPRESSED);
	public static final JimItem C2_EMERALD = new JimItem(Item.make(Material.EMERALD, 1, ChatColor.BLUE + "Double Compressed Emerald", ChatColor.GRAY + "16 Emerald"), "c2_emerald", Type.COMPRESSED);
	public static final JimItem C3_EMERALD = new JimItem(Item.make(Material.EMERALD, 1, ChatColor.DARK_PURPLE + "Triple Compressed Emerald", ChatColor.GRAY + "64 Emerald"), "c3_emerald", Type.COMPRESSED);

	public static final JimItem C1_DIAMOND = new JimItem(Item.make(Material.DIAMOND, 1, ChatColor.BLUE + "Compressed Diamond", ChatColor.GRAY + "4 Diamond"), "c1_diamond", Type.COMPRESSED);
	public static final JimItem C2_DIAMOND = new JimItem(Item.make(Material.DIAMOND, 1, ChatColor.DARK_PURPLE + "Double Compressed Diamond", ChatColor.GRAY + "16 Diamond"), "c2_diamond", Type.COMPRESSED);
	public static final JimItem C3_DIAMOND = new JimItem(Item.make(Material.DIAMOND, 1, ChatColor.LIGHT_PURPLE + "Triple Compressed Diamond", ChatColor.GRAY + "64 Diamond"), "c3_diamond", Type.COMPRESSED);

}
