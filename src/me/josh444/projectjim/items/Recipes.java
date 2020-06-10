package me.josh444.projectjim.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.utils.Recipe;
import me.josh444.projectjim.utils.item.Item;

public class Recipes {

	private static final String[] PICKAXE = new String[] {"aaa"," b "," b "};
	
	public static void loadRecipes() {
		Recipe r = new Recipe();
		
		//Tools
		r.addRecipe(JimItem.STEEL_PICKAXE, PICKAXE, new ItemStack[] {JimItem.STEEL.getItem(), Item.make(Material.STICK)});
				
		//Metals
		r.addBlastRecipe(JimItem.STEEL, Item.make(Material.IRON_INGOT), 1.0F, 5);
		r.addFurnaceRecipe(JimItem.COPPER_INGOT, JimItem.COPPER_ORE.getItem(), 0.7F, 10);
		r.addFurnaceRecipe(JimItem.TIN_INGOT, JimItem.TIN_ORE.getItem(), 0.7F, 10);
		r.addFurnaceRecipe(JimItem.LEAD_INGOT, JimItem.LEAD_ORE.getItem(), 0.7F, 10);
		r.addFurnaceRecipe(JimItem.SILVER_INGOT, JimItem.SILVER_ORE.getItem(), 0.7F, 10);
		r.addFurnaceRecipe(JimItem.MAGNESIUM_INGOT, JimItem.MAGNESIUM_ORE.getItem(), 0.7F, 10);

		//Compressed Items
		r.addCRecipe(JimItem.C1_COBBLE, Material.COBBLESTONE);
		r.addCRecipe(JimItem.C2_COBBLE, JimItem.C1_COBBLE);
		r.addCRecipe(JimItem.C3_COBBLE, JimItem.C2_COBBLE);
		r.addCRecipe(JimItem.C4_COBBLE, JimItem.C3_COBBLE);
		r.addCRecipe(JimItem.C5_COBBLE, JimItem.C4_COBBLE);
		r.addCRecipe(JimItem.C6_COBBLE, JimItem.C5_COBBLE);
		r.addCRecipe(JimItem.C7_COBBLE, JimItem.C6_COBBLE);
		r.addCRecipe(JimItem.C8_COBBLE, JimItem.C7_COBBLE);

		r.addCRecipe(JimItem.C_COAL, Material.COAL_BLOCK);
		r.addCRecipe(JimItem.C_IRON, Material.IRON_BLOCK);
		r.addCRecipe(JimItem.C_GOLD, Material.GOLD_BLOCK);
		r.addCRecipe(JimItem.C_LAPIS, Material.LAPIS_BLOCK);
		r.addCRecipe(JimItem.C_REDSTONE, Material.REDSTONE_BLOCK);
		r.addCRecipe(JimItem.C_EMERALD, Material.EMERALD_BLOCK);
		r.addCRecipe(JimItem.C_DIAMOND, Material.DIAMOND_BLOCK);
	
	}
}
