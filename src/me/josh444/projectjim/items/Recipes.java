package me.josh444.projectjim.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.utils.Item;
import me.josh444.projectjim.utils.Recipe;

public class Recipes {

	private static final String[] BOOT_UPGRADE = new String[] {" a ","aba"," a "};
	
	
	public static void loadRecipes() {
		Recipe r = new Recipe();
		
		r.addRecipe(JimItems.T2_DIAMOND_BOOTS, BOOT_UPGRADE, new ItemStack[] {JimItems.C1_DIAMOND.getItem(),Item.make(Material.DIAMOND_BOOTS)});
		r.addRecipe(JimItems.T3_DIAMOND_BOOTS, BOOT_UPGRADE, new ItemStack[] {JimItems.C2_DIAMOND.getItem(),JimItems.T2_DIAMOND_BOOTS.getItem()});
		r.addRecipe(JimItems.T4_DIAMOND_BOOTS, BOOT_UPGRADE, new ItemStack[] {JimItems.C3_DIAMOND.getItem(),JimItems.T3_DIAMOND_BOOTS.getItem()});
		
		r.addCRecipe(JimItems.C1_COBBLESTONE, Material.COBBLESTONE);
		r.addCRecipe(JimItems.C2_COBBLESTONE, JimItems.C1_COBBLESTONE);
		r.addCRecipe(JimItems.C3_COBBLESTONE, JimItems.C2_COBBLESTONE);
		r.addCRecipe(JimItems.C4_COBBLESTONE, JimItems.C3_COBBLESTONE);
		r.addCRecipe(JimItems.C5_COBBLESTONE, JimItems.C4_COBBLESTONE);
		r.addCRecipe(JimItems.C6_COBBLESTONE, JimItems.C5_COBBLESTONE);
		r.addCRecipe(JimItems.C7_COBBLESTONE, JimItems.C6_COBBLESTONE);
		r.addCRecipe(JimItems.C8_COBBLESTONE, JimItems.C7_COBBLESTONE);

		r.addCRecipe(JimItems.C1_COAL, Material.COAL);
		r.addCRecipe(JimItems.C2_COAL, JimItems.C1_COAL);
		r.addCRecipe(JimItems.C3_COAL, JimItems.C2_COAL);

		r.addCRecipe(JimItems.C1_IRON, Material.IRON_INGOT);
		r.addCRecipe(JimItems.C2_IRON, JimItems.C1_IRON);
		r.addCRecipe(JimItems.C3_IRON, JimItems.C2_IRON);

		r.addCRecipe(JimItems.C1_GOLD, Material.GOLD_INGOT);
		r.addCRecipe(JimItems.C2_GOLD, JimItems.C1_GOLD);
		r.addCRecipe(JimItems.C3_GOLD, JimItems.C2_GOLD);

		r.addCRecipe(JimItems.C1_LAPIS, Material.LAPIS_LAZULI);
		r.addCRecipe(JimItems.C2_LAPIS, JimItems.C1_LAPIS);
		r.addCRecipe(JimItems.C3_LAPIS, JimItems.C2_LAPIS);

		r.addCRecipe(JimItems.C1_REDSTONE, Material.REDSTONE);
		r.addCRecipe(JimItems.C2_REDSTONE, JimItems.C1_REDSTONE);
		r.addCRecipe(JimItems.C3_REDSTONE, JimItems.C2_REDSTONE);

		r.addCRecipe(JimItems.C1_EMERALD, Material.EMERALD);
		r.addCRecipe(JimItems.C2_EMERALD, JimItems.C1_EMERALD);
		r.addCRecipe(JimItems.C3_EMERALD, JimItems.C2_EMERALD);

		r.addCRecipe(JimItems.C1_DIAMOND, Material.DIAMOND);
		r.addCRecipe(JimItems.C2_DIAMOND, JimItems.C1_DIAMOND);
		r.addCRecipe(JimItems.C3_DIAMOND, JimItems.C2_DIAMOND);
		
	}
}
