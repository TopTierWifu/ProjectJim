package me.josh444.projectjim.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.utils.Recipe;
import me.josh444.projectjim.utils.item.Item;

public class Recipes {

//	private static final String[] HELMET = new String[] {"aaa","a a","   "};
//	private static final String[] CHESTPLATE = new String[] {"a a","aaa","aaa"};
//	private static final String[] LEGGINGS = new String[] {"aaa","a a","a a"};
//	private static final String[] BOOTS = new String[] {"a a","a a","   "};
	
	private static final String[] PICKAXE = new String[] {"aaa"," b "," b "};
	
	private static final String[] UPGRADE_2 = new String[] {"   ","aba","   "};
//	private static final String[] UPGRADE_4 = new String[] {" a ","aba"," a "};
//	private static final String[] UPGRADE_6 = new String[] {"a a","aba","a a"};
//	private static final String[] UPGRADE_8 = new String[] {"aaa","aba","aaa"};
	
	public static void loadRecipes() {
		Recipe r = new Recipe();
		
		//Tools
		r.addRecipe(JimItems.STEEL_PICKAXE, PICKAXE, new ItemStack[] {JimItems.STEEL.getItem(), Item.make(Material.STICK)});
		
		//Tiered Diamond Armor
		r.addRecipe(JimItems.MK2_DIAMOND_HELMET, UPGRADE_2, new ItemStack[] {Item.make(Material.DIAMOND),Item.make(Material.DIAMOND_HELMET)});
		r.addRecipe(JimItems.MK3_DIAMOND_HELMET, UPGRADE_2, new ItemStack[] {Item.make(Material.DIAMOND_BLOCK),JimItems.MK2_DIAMOND_HELMET.getItem()});
		r.addRecipe(JimItems.MK4_DIAMOND_HELMET, UPGRADE_2, new ItemStack[] {JimItems.C_DIAMOND.getItem(),JimItems.MK3_DIAMOND_HELMET.getItem()});
		
		r.addRecipe(JimItems.MK2_DIAMOND_CHESTPLATE, UPGRADE_2, new ItemStack[] {Item.make(Material.DIAMOND),Item.make(Material.DIAMOND_CHESTPLATE)});
		r.addRecipe(JimItems.MK3_DIAMOND_CHESTPLATE, UPGRADE_2, new ItemStack[] {Item.make(Material.DIAMOND_BLOCK),JimItems.MK2_DIAMOND_CHESTPLATE.getItem()});
		r.addRecipe(JimItems.MK4_DIAMOND_CHESTPLATE, UPGRADE_2, new ItemStack[] {JimItems.C_DIAMOND.getItem(),JimItems.MK3_DIAMOND_CHESTPLATE.getItem()});
		
		r.addRecipe(JimItems.MK2_DIAMOND_LEGGINGS, UPGRADE_2, new ItemStack[] {Item.make(Material.DIAMOND),Item.make(Material.DIAMOND_LEGGINGS)});
		r.addRecipe(JimItems.MK3_DIAMOND_LEGGINGS, UPGRADE_2, new ItemStack[] {Item.make(Material.DIAMOND_BLOCK),JimItems.MK2_DIAMOND_LEGGINGS.getItem()});
		r.addRecipe(JimItems.MK4_DIAMOND_LEGGINGS, UPGRADE_2, new ItemStack[] {JimItems.C_DIAMOND.getItem(),JimItems.MK3_DIAMOND_LEGGINGS.getItem()});
		
		r.addRecipe(JimItems.MK2_DIAMOND_BOOTS, UPGRADE_2, new ItemStack[] {Item.make(Material.DIAMOND),Item.make(Material.DIAMOND_BOOTS)});
		r.addRecipe(JimItems.MK3_DIAMOND_BOOTS, UPGRADE_2, new ItemStack[] {Item.make(Material.DIAMOND_BLOCK),JimItems.MK2_DIAMOND_BOOTS.getItem()});
		r.addRecipe(JimItems.MK4_DIAMOND_BOOTS, UPGRADE_2, new ItemStack[] {JimItems.C_DIAMOND.getItem(),JimItems.MK3_DIAMOND_BOOTS.getItem()});
		
		//Metals
		r.addBlastRecipe(JimItems.STEEL, Item.make(Material.IRON_INGOT), 1.0F, 5);
		r.addFurnaceRecipe(JimItems.COPPER_INGOT, JimItems.COPPER_ORE.getItem(), 0.7F, 10);
		
		
		//Compressed Items
		r.addCRecipe(JimItems.C1_COBBLESTONE, Material.COBBLESTONE);
		r.addCRecipe(JimItems.C2_COBBLESTONE, JimItems.C1_COBBLESTONE);
		r.addCRecipe(JimItems.C3_COBBLESTONE, JimItems.C2_COBBLESTONE);
		r.addCRecipe(JimItems.C4_COBBLESTONE, JimItems.C3_COBBLESTONE);
		r.addCRecipe(JimItems.C5_COBBLESTONE, JimItems.C4_COBBLESTONE);
		r.addCRecipe(JimItems.C6_COBBLESTONE, JimItems.C5_COBBLESTONE);
		r.addCRecipe(JimItems.C7_COBBLESTONE, JimItems.C6_COBBLESTONE);
		r.addCRecipe(JimItems.C8_COBBLESTONE, JimItems.C7_COBBLESTONE);

		r.addCRecipe(JimItems.C_COAL, Material.COAL_BLOCK);
		r.addCRecipe(JimItems.C_IRON, Material.IRON_BLOCK);
		r.addCRecipe(JimItems.C_GOLD, Material.GOLD_BLOCK);
		r.addCRecipe(JimItems.C_LAPIS, Material.LAPIS_BLOCK);
		r.addCRecipe(JimItems.C_REDSTONE, Material.REDSTONE_BLOCK);
		r.addCRecipe(JimItems.C_EMERALD, Material.EMERALD_BLOCK);
		r.addCRecipe(JimItems.C_DIAMOND, Material.DIAMOND_BLOCK);
	
	}
}
