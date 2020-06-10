package me.josh444.projectjim.items;

import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.utils.item.Item;
import me.josh444.projectjim.utils.item.ItemUtil;
import me.josh444.projectjim.utils.item.Skull;
import me.josh444.projectjim.utils.item.Texture;

public enum JimItem {
	
	//Tools
	STEEL_PICKAXE(Item.make(Material.IRON_PICKAXE, 1, ChatColor.GOLD + "Steel Pickaxe"), "steel_pickaxe"),
	
	//Ores
	COPPER_ORE(Skull.make(Texture.COPPER_ORE, 1, ChatColor.GOLD + "Copper Ore"), "copper_ore"),
	TIN_ORE(Skull.make(Texture.TIN_ORE, 1, ChatColor.GOLD + "Tin Ore"), "tin_ore"),
	LEAD_ORE(Skull.make(Texture.LEAD_ORE, 1, ChatColor.GOLD + "Lead Ore"), "lead_ore"),
	SILVER_ORE(Skull.make(Texture.SILVER_ORE, 1, ChatColor.GOLD + "Silver Ore"), "silver_ore"),
	MAGNESIUM_ORE(Skull.make(Texture.MAGNESIUM_ORE, 1, ChatColor.GOLD + "Magnesium Ore"), "magnesium_ore"),
			
	//Metals
	STEEL(Item.make(Material.IRON_INGOT, 1, ChatColor.GOLD + "Steel Ingot"), "steel"),
	COPPER_INGOT(Item.make(Material.BRICK, 1, ChatColor.GOLD + "Copper Ingot"), "copper_ingot"),
	TIN_INGOT(Item.make(Material.IRON_INGOT, 1, ChatColor.GOLD + "Tin Ingot"), "tin_ingot"),
	LEAD_INGOT(Item.make(Material.IRON_INGOT, 1, ChatColor.GOLD + "Lead Ingot"), "lead_ingot"),
	SILVER_INGOT(Item.make(Material.IRON_INGOT, 1, ChatColor.GOLD + "Silver Ingot"), "silver_ingot"),
	MAGNESIUM_INGOT(Item.make(Material.IRON_INGOT, 1, ChatColor.GOLD + "Magnesium Ingot"), "magnesium_ingot"),
	
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
		this.item = item;
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
		if(ItemUtil.getName(item).equals(this.getName())) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isJim(ItemStack item) {
		boolean result = false;
		for(JimItem jim: JimItem.values()) {
			if(ItemUtil.getName(item).equals(jim.getName())) {
				result = true;
			}
		}
		return result;
	}
	
	
}
