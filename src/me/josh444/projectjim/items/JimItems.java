package me.josh444.projectjim.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.EquipmentSlot;

import me.josh444.projectjim.items.JimItem.Type;
import me.josh444.projectjim.utils.Attributes;
import me.josh444.projectjim.utils.Uuid;
import me.josh444.projectjim.utils.item.Item;
import me.josh444.projectjim.utils.item.Skull;

public class JimItems {
	
	
	
	
	//Tools
	public static final JimItem STEEL_PICKAXE = new JimItem(Item.make(Material.IRON_PICKAXE, 1, ChatColor.GOLD + "Steel Pickaxe"), "steel_pickaxe", Type.TOOL);
	
	//Tiered Diamond Armor
	public static final JimItem MK2_DIAMOND_HELMET = new JimItem(Item.make(Material.DIAMOND_HELMET, 1, "Diamond Helmet MK2", Attributes.getArmorData(Uuid.MK_DIAMOND_ARMOR, 2, 4, EquipmentSlot.HEAD)), "mk2_diamond_helmet", Type.ARMOR);
	public static final JimItem MK3_DIAMOND_HELMET = new JimItem(Item.make(Material.DIAMOND_HELMET, 1, "Diamond Helmet MK3", Attributes.getArmorData(Uuid.MK_DIAMOND_ARMOR, 3, 5, EquipmentSlot.HEAD)), "mk3_diamond_helmet", Type.ARMOR);
	public static final JimItem MK4_DIAMOND_HELMET = new JimItem(Item.make(Material.DIAMOND_HELMET, 1, "Diamond Helmet MK4", Attributes.getArmorData(Uuid.MK_DIAMOND_ARMOR, 4, 6, EquipmentSlot.HEAD)), "mk4_diamond_helmet", Type.ARMOR);

	public static final JimItem MK2_DIAMOND_CHESTPLATE = new JimItem(Item.make(Material.DIAMOND_CHESTPLATE, 1, "Diamond Chestplate MK2", Attributes.getArmorData(Uuid.MK_DIAMOND_ARMOR, 2, 10, EquipmentSlot.CHEST)), "mk2_diamond_chestplate", Type.ARMOR);
	public static final JimItem MK3_DIAMOND_CHESTPLATE = new JimItem(Item.make(Material.DIAMOND_CHESTPLATE, 1, "Diamond Chestplate MK3", Attributes.getArmorData(Uuid.MK_DIAMOND_ARMOR, 3, 13, EquipmentSlot.CHEST)), "mk3_diamond_chestplate", Type.ARMOR);
	public static final JimItem MK4_DIAMOND_CHESTPLATE = new JimItem(Item.make(Material.DIAMOND_CHESTPLATE, 1, "Diamond Chestplate MK4", Attributes.getArmorData(Uuid.MK_DIAMOND_ARMOR, 4, 16, EquipmentSlot.CHEST)), "mk4_diamond_chestplate", Type.ARMOR);

	public static final JimItem MK2_DIAMOND_LEGGINGS = new JimItem(Item.make(Material.DIAMOND_LEGGINGS, 1, "Diamond Leggings MK2", Attributes.getArmorData(Uuid.MK_DIAMOND_ARMOR, 2, 8, EquipmentSlot.LEGS)), "mk2_diamond_leggings", Type.ARMOR);
	public static final JimItem MK3_DIAMOND_LEGGINGS = new JimItem(Item.make(Material.DIAMOND_LEGGINGS, 1, "Diamond Leggings MK3", Attributes.getArmorData(Uuid.MK_DIAMOND_ARMOR, 3, 10, EquipmentSlot.LEGS)), "mk3_diamond_leggings", Type.ARMOR);
	public static final JimItem MK4_DIAMOND_LEGGINGS = new JimItem(Item.make(Material.DIAMOND_LEGGINGS, 1, "Diamond Leggings MK4", Attributes.getArmorData(Uuid.MK_DIAMOND_ARMOR, 4, 12, EquipmentSlot.LEGS)), "mk4_diamond_leggings", Type.ARMOR);

	public static final JimItem MK2_DIAMOND_BOOTS = new JimItem(Item.make(Material.DIAMOND_BOOTS, 1, "Diamond Boots MK2", Attributes.getArmorData(Uuid.MK_DIAMOND_ARMOR, 2, 4, EquipmentSlot.FEET)), "mk2_diamond_boots", Type.ARMOR);
	public static final JimItem MK3_DIAMOND_BOOTS = new JimItem(Item.make(Material.DIAMOND_BOOTS, 1, "Diamond Boots MK3", Attributes.getArmorData(Uuid.MK_DIAMOND_ARMOR, 3, 5, EquipmentSlot.FEET)), "mk3_diamond_boots", Type.ARMOR);
	public static final JimItem MK4_DIAMOND_BOOTS = new JimItem(Item.make(Material.DIAMOND_BOOTS, 1, "Diamond Boots MK4", Attributes.getArmorData(Uuid.MK_DIAMOND_ARMOR, 4, 6, EquipmentSlot.FEET)), "mk4_diamond_boots", Type.ARMOR);

	//Ores
	public static final JimItem COPPER_ORE = new JimItem(Skull.make(Uuid.COPPER_ORE, 1, ChatColor.GOLD + "Copper Ore"), "copper_ore", Type.ORE);
	public static final JimItem TIN_ORE = new JimItem(Skull.make(Uuid.TIN_ORE, 1, ChatColor.GOLD + "Tin Ore"), "tin_ore", Type.ORE);
	public static final JimItem LEAD_ORE = new JimItem(Skull.make(Uuid.LEAD_ORE, 1, ChatColor.GOLD + "Lead Ore"), "lead_ore", Type.ORE);
	public static final JimItem SILVER_ORE = new JimItem(Skull.make(Uuid.SILVER_ORE, 1, ChatColor.GOLD + "Silver Ore"), "silver_ore", Type.ORE);
	public static final JimItem MAGNESIUM_ORE = new JimItem(Skull.make(Uuid.MAGNESIUM_ORE, 1, ChatColor.GOLD + "Magnesium Ore"), "magnesium_ore", Type.ORE);
			
	//Metals
	public static final JimItem STEEL = new JimItem(Item.make(Material.IRON_INGOT, 1, ChatColor.GOLD + "Steel Ingot"), "steel", Type.METAL);
	public static final JimItem COPPER_INGOT = new JimItem(Item.make(Material.BRICK, 1, ChatColor.GOLD + "Copper Ingot"), "copper_ingot", Type.METAL);
	
	//Compressed Items
	public static final JimItem C1_COBBLESTONE = new JimItem(Skull.make(Uuid.COMPRESSED_COBBLESTONE, 1, ChatColor.RED + "Compressed Cobblestone", ChatColor.GRAY + "9 Cobblestone"), "c1_cobblestone", Type.COMPRESSED);
	public static final JimItem C2_COBBLESTONE = new JimItem(Skull.make(Uuid.COMPRESSED_COBBLESTONE, 1, ChatColor.GOLD + "Double Compressed Cobblestone", ChatColor.GRAY + "81 Cobblestone"), "c2_cobblestone", Type.COMPRESSED);
	public static final JimItem C3_COBBLESTONE = new JimItem(Skull.make(Uuid.COMPRESSED_COBBLESTONE, 1, ChatColor.YELLOW + "Triple Compressed Cobblestone", ChatColor.GRAY + "729 Cobblestone"), "c3_cobblestone", Type.COMPRESSED);
	public static final JimItem C4_COBBLESTONE = new JimItem(Skull.make(Uuid.COMPRESSED_COBBLESTONE, 1, ChatColor.GREEN + "Quadruple Compressed Cobblestone", ChatColor.GRAY + "6,561 Cobblestone"), "c4_cobblestone", Type.COMPRESSED);
	public static final JimItem C5_COBBLESTONE = new JimItem(Skull.make(Uuid.COMPRESSED_COBBLESTONE, 1, ChatColor.AQUA + "Quintuple Compressed Cobblestone", ChatColor.GRAY + "59,049 Cobblestone"), "c5_cobblestone", Type.COMPRESSED);
	public static final JimItem C6_COBBLESTONE = new JimItem(Skull.make(Uuid.COMPRESSED_COBBLESTONE, 1, ChatColor.BLUE + "Sextuple Compressed Cobblestone", ChatColor.GRAY + "531,441 Cobblestone"), "c6_cobblestone", Type.COMPRESSED);
	public static final JimItem C7_COBBLESTONE = new JimItem(Skull.make(Uuid.COMPRESSED_COBBLESTONE, 1, ChatColor.DARK_PURPLE + "Septuple Compressed Cobblestone", ChatColor.GRAY + "4,782,969 Cobblestone"), "c7_cobblestone", Type.COMPRESSED);
	public static final JimItem C8_COBBLESTONE = new JimItem(Skull.make(Uuid.COMPRESSED_COBBLESTONE, 1, ChatColor.LIGHT_PURPLE + "Octuple Compressed Cobblestone", ChatColor.GRAY + "43,046,271 Cobblestone"), "c8_cobblestone", Type.COMPRESSED);
	//public static final JimItem BEDROCK = new JimItem();

	public static final JimItem C_COAL = new JimItem(Skull.make(Uuid.COMPRESSED_COAL, 1, ChatColor.YELLOW + "Compressed Coal", ChatColor.GRAY + "81 Coal"), "c_coal", Type.COMPRESSED);
	public static final JimItem C_IRON = new JimItem(Skull.make(Uuid.COMPRESSED_IRON, 1, ChatColor.YELLOW + "Compressed Iron", ChatColor.GRAY + "81 Iron"), "c_iron", Type.COMPRESSED);
	public static final JimItem C_GOLD = new JimItem(Skull.make(Uuid.COMPRESSED_GOLD, 1, ChatColor.YELLOW + "Compressed Gold", ChatColor.GRAY + "81 Gold"), "c_gold", Type.COMPRESSED);
	public static final JimItem C_LAPIS = new JimItem(Skull.make(Uuid.COMPRESSED_LAPIS, 1, ChatColor.YELLOW + "Compressed Lapis", ChatColor.GRAY + "81 Lapis"), "c_lapis", Type.COMPRESSED);
	public static final JimItem C_REDSTONE = new JimItem(Skull.make(Uuid.COMPRESSED_REDSTONE, 1, ChatColor.YELLOW + "Compressed Redstone", ChatColor.GRAY + "81 Redstone"), "c_redstone", Type.COMPRESSED);
	public static final JimItem C_EMERALD = new JimItem(Skull.make(Uuid.COMPRESSED_EMERALD, 1, ChatColor.YELLOW + "Compressed Emerald", ChatColor.GRAY + "81 Emeralds"), "c_emerald", Type.COMPRESSED);
	public static final JimItem C_DIAMOND = new JimItem(Skull.make(Uuid.COMPRESSED_DIAMOND, 1, ChatColor.YELLOW + "Compressed Diamond", ChatColor.GRAY + "81 Diamonds"), "c_diamond", Type.COMPRESSED);

}
