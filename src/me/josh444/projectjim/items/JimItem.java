package me.josh444.projectjim.items;

import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.utils.item.Item;
import me.josh444.projectjim.utils.item.NBT;
import me.josh444.projectjim.utils.item.Skull;
import me.josh444.projectjim.utils.item.Texture;

public enum JimItem {
	
	//Tools
	STEEL_PICKAXE(Item.make(Material.IRON_PICKAXE, 1, ChatColor.GOLD + "Steel Pickaxe", Arrays.asList("", ChatColor.GRAY + "Increases your chance to mine", ChatColor.GRAY + "custom ores from stone")), "steel_pickaxe"),
	MOLTEN_PICKAXE(Item.make(Material.IRON_PICKAXE, 1, ChatColor.GOLD + "Molten Pickaxe", Arrays.asList("", ChatColor.GRAY + "Smelts everything you mine")), "molten_pickaxe"),
	
	//Ores
	COPPER_ORE(Skull.make(Texture.COPPER_ORE, 1, ChatColor.GOLD + "Copper Ore"), "copper_ore"),
	TIN_ORE(Skull.make(Texture.TIN_ORE, 1, ChatColor.GOLD + "Tin Ore"), "tin_ore"),
	LEAD_ORE(Skull.make(Texture.LEAD_ORE, 1, ChatColor.GOLD + "Lead Ore"), "lead_ore"),
	SILVER_ORE(Skull.make(Texture.SILVER_ORE, 1, ChatColor.GOLD + "Silver Ore"), "silver_ore"),
	MAGNESIUM_ORE(Skull.make(Texture.MAGNESIUM_ORE, 1, ChatColor.GOLD + "Magnesium Ore"), "magnesium_ore"),
			
	//Metals
	STEEL(Item.make(Material.IRON_INGOT, 1, ChatColor.GOLD + "Steel Ingot"), "steel"),
	R_STEEL(Item.make(Material.IRON_INGOT, 1, ChatColor.GOLD + "Reinforced Steel Ingot"), "r_steel"),
	COPPER(Item.make(Material.BRICK, 1, ChatColor.GOLD + "Copper Ingot"), "copper_ingot"),
	TIN(Item.make(Material.IRON_INGOT, 1, ChatColor.GOLD + "Tin Ingot"), "tin_ingot"),
	LEAD(Item.make(Material.IRON_INGOT, 1, ChatColor.GOLD + "Lead Ingot"), "lead_ingot"),
	SILVER(Item.make(Material.IRON_INGOT, 1, ChatColor.GOLD + "Silver Ingot"), "silver_ingot"),
	MAGNESIUM(Item.make(Material.IRON_INGOT, 1, ChatColor.GOLD + "Magnesium Ingot"), "magnesium_ingot"),
	
	//Crafting Materials
	RNG(Skull.make(Texture.RNG, 1, ChatColor.GOLD + "Essence of RNG"), "rng"),
	
	//Upgrade Cores
	UPGRADE_CORE(Skull.make(Texture.UPGRADE_CORE, 1, ChatColor.BLUE + "Upgrade Core", Arrays.asList(ChatColor.GRAY + "Base for all tool upgrades")), "upgrade_core"),
	MOLTEN_CORE(Skull.make(Texture.MOLTEN_CORE, 1, ChatColor.BLUE + "Molten Core", Arrays.asList(ChatColor.GRAY + "Anything you mine is smelted")), "molten_core"),
	TREASURE_CORE(Skull.make(Texture.TREASURE_CORE, 1, ChatColor.BLUE + "Treasure Core", Arrays.asList(ChatColor.GRAY + "Gives a chance to mine up", ChatColor.GRAY + "treasures from the earth")), "treasure_core"),

	//Magic
	MAGIC_DUST(Item.make(Material.GUNPOWDER, 1, ChatColor.DARK_AQUA + "Magic Dust"), "magic_dust"),
	MAGIC_ESSENCE(Skull.make(Texture.MAGIC_ESSENCE, 1, ChatColor.DARK_AQUA + "Magic Essence"), "magic_essence"),
	MAGIC_ROD(Item.make(Material.BLAZE_ROD, 1, ChatColor.DARK_AQUA + "Magic Rod"), "magic_rod"),
	
	//Compressed Items
	C1_COBBLE(Skull.make(Texture.C_COBBLE, 1, ChatColor.RED + "Compressed Cobblestone", Arrays.asList(ChatColor.GRAY + "9 Cobblestone")), "c1_cobblestone"),
	C2_COBBLE(Skull.make(Texture.C_COBBLE, 1, ChatColor.GOLD + "Double Compressed Cobblestone", Arrays.asList(ChatColor.GRAY + "81 Cobblestone")), "c2_cobblestone"),
	C3_COBBLE(Skull.make(Texture.C_COBBLE, 1, ChatColor.YELLOW + "Triple Compressed Cobblestone", Arrays.asList(ChatColor.GRAY + "729 Cobblestone")), "c3_cobblestone"),
	C4_COBBLE(Skull.make(Texture.C_COBBLE, 1, ChatColor.GREEN + "Quadruple Compressed Cobblestone", Arrays.asList(ChatColor.GRAY + "6,561 Cobblestone")), "c4_cobblestone"),
	C5_COBBLE(Skull.make(Texture.C_COBBLE, 1, ChatColor.AQUA + "Quintuple Compressed Cobblestone", Arrays.asList(ChatColor.GRAY + "59,049 Cobblestone")), "c5_cobblestone"),
	C6_COBBLE(Skull.make(Texture.C_COBBLE, 1, ChatColor.BLUE + "Sextuple Compressed Cobblestone", Arrays.asList(ChatColor.GRAY + "531,441 Cobblestone")), "c6_cobblestone"),
	C7_COBBLE(Skull.make(Texture.C_COBBLE, 1, ChatColor.DARK_PURPLE + "Septuple Compressed Cobblestone", Arrays.asList(ChatColor.GRAY + "4,782,969 Cobblestone")), "c7_cobblestone"),
	C8_COBBLE(Skull.make(Texture.C_COBBLE, 1, ChatColor.LIGHT_PURPLE + "Octuple Compressed Cobblestone", Arrays.asList(ChatColor.GRAY + "43,046,271 Cobblestone")), "c8_cobblestone"),
	//BEDROCK(),

	C_COAL(Skull.make(Texture.C_COAL, 1, ChatColor.YELLOW + "Compressed Coal", Arrays.asList(ChatColor.GRAY + "81 Coal")), "c_coal"),
	C_IRON(Skull.make(Texture.C_IRON, 1, ChatColor.YELLOW + "Compressed Iron", Arrays.asList(ChatColor.GRAY + "81 Iron")), "c_iron"),
	C_GOLD(Skull.make(Texture.C_GOLD, 1, ChatColor.YELLOW + "Compressed Gold", Arrays.asList(ChatColor.GRAY + "81 Gold")), "c_gold"),
	C_LAPIS(Skull.make(Texture.C_LAPIS, 1, ChatColor.YELLOW + "Compressed Lapis", Arrays.asList(ChatColor.GRAY + "81 Lapis")), "c_lapis"),
	C_REDSTONE(Skull.make(Texture.C_REDSTONE, 1, ChatColor.YELLOW + "Compressed Redstone", Arrays.asList(ChatColor.GRAY + "81 Redstone")), "c_redstone"),
	C_EMERALD(Skull.make(Texture.C_EMERALD, 1, ChatColor.YELLOW + "Compressed Emerald", Arrays.asList(ChatColor.GRAY + "81 Emeralds")), "c_emerald"),
	C_DIAMOND(Skull.make(Texture.C_DIAMOND, 1, ChatColor.YELLOW + "Compressed Diamond", Arrays.asList(ChatColor.GRAY + "81 Diamonds")), "c_diamond");
	
	//Constructor
	private String key;
	private ItemStack item;

	JimItem(ItemStack item, String key) {
		this.item = NBT.addString(item, "jim", key);
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}
	
	public ItemStack getItem() {
		return item;
	}
	
	public String getName() {
		return item.getItemMeta().getDisplayName();
	}
	
	public boolean isItem(ItemStack item) {
		if(!NBT.hasTag(item, "jim")) {
			return false;
		}
		if(NBT.getString(item, "jim").equals(key)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isJim(ItemStack item) {
		boolean result = false;
		for(JimItem jim: JimItem.values()) {
			if(jim.isItem(item)) {
				result = true;
			}
		}
		return result;
	}
	
	
}
