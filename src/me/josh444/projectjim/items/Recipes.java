package me.josh444.projectjim.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.utils.Recipe;
import me.josh444.projectjim.utils.item.Item;

public class Recipes {

	private static final String[] PICKAXE = new String[] {"aaa"," b "," b "};
	private static final String[] PICKAXE_VARIANT = new String[] {"aba"," c "," c "};
	private static final String[] O4 = new String[] {"abc","ded","cba"};
//	private static final String[] FULL = new String[] {"abc","def","ghi"};
//	private static final String[] XT = new String[] {"aba","b b","aba"};
	private static final String[] XT_FULL = new String[] {"aba","bcb","aba"};
	private static final String[] O_FULL = new String[] {"aaa","aba","aaa"};
	private static final String[] ROD = new String[] {"  a"," b ","a  "};
	
	public static void loadRecipes() {
		Recipe r = new Recipe();
		
		//Tools
		r.addRecipe(JimItem.STEEL_PICKAXE, PICKAXE, new ItemStack[] {JimItem.STEEL.getItem(), Item.make(Material.STICK)});
		r.addRecipe(JimItem.MOLTEN_PICKAXE, PICKAXE_VARIANT, new ItemStack[] {JimItem.R_STEEL.getItem(), Item.make(Material.LAVA_BUCKET), Item.make(Material.STICK)});		
		
		//Metals
		r.addBlastRecipe(JimItem.STEEL, Item.make(Material.IRON_INGOT), 1.0F, 5);
		r.addRecipe(JimItem.R_STEEL, O_FULL, new ItemStack[] {Item.make(Material.COAL), JimItem.STEEL.getItem()});
		r.addFurnaceRecipe(JimItem.COPPER, JimItem.COPPER_ORE.getItem(), 0.7F, 10);
		r.addFurnaceRecipe(JimItem.TIN, JimItem.TIN_ORE.getItem(), 0.7F, 10);
		r.addFurnaceRecipe(JimItem.LEAD, JimItem.LEAD_ORE.getItem(), 0.7F, 10);
		r.addFurnaceRecipe(JimItem.SILVER, JimItem.SILVER_ORE.getItem(), 0.7F, 10);
		r.addFurnaceRecipe(JimItem.MAGNESIUM, JimItem.MAGNESIUM_ORE.getItem(), 0.7F, 10);

		//Crafting Materials
		r.addRecipe(JimItem.RNG, O4, new Material[] {Material.WHEAT_SEEDS, Material.FLINT, Material.APPLE, Material.POISONOUS_POTATO, Material.GLASS_BOTTLE});
		
		//Upgrade Cores
		r.addRecipe(JimItem.UPGRADE_CORE, O_FULL, new Material[] {Material.QUARTZ, Material.GLASS});
		r.addRecipe(JimItem.MOLTEN_CORE, XT_FULL, new ItemStack[] {Item.make(Material.BLAZE_POWDER), Item.make(Material.LAVA_BUCKET), JimItem.UPGRADE_CORE.getItem()});
		r.addRecipe(JimItem.TREASURE_CORE, XT_FULL, new ItemStack[] {Item.make(Material.GOLD_BLOCK), Item.make(Material.DIAMOND), JimItem.UPGRADE_CORE.getItem()});
		
		//Magic
		r.addRecipe(JimItem.MAGIC_ESSENCE, XT_FULL, new ItemStack[] {Item.make(Material.LAPIS_LAZULI), JimItem.MAGIC_DUST.getItem(), Item.make(Material.GLASS_BOTTLE)});
		r.addRecipe(JimItem.MAGIC_ROD, ROD, new ItemStack[] {JimItem.MAGIC_ESSENCE.getItem(), Item.make(Material.BLAZE_ROD)});
		
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
