package me.josh444.projectjim.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.utils.Item;
import me.josh444.projectjim.utils.Recipe;

public class Recipes {
	
		//Not sure if this should be static
		public static void loadRecipes() {
			Recipe r = new Recipe();
			
			r.addRecipe(JimItems.FIELD_JOURNAL, new String[] {"dac", "beb", "cad"}, new char[] {'a','b','c','d','e'}, new ItemStack[] {Item.make(Material.DIRT),Item.make(Material.SAND),Item.make(Material.GRAVEL),Item.make(Material.COBBLESTONE),Item.make(Material.WRITABLE_BOOK)});
			r.addRecipe(JimItems.MAGIC_MISSILE_WAND, new String[] {" a ", "   ", "   "}, new char[] {'a'}, new ItemStack[] {Item.make(Material.COBBLESTONE)});
			r.addRecipe(JimItems.ZAPP_WAND, new String[] {"a  ", "   ", "   "}, new char[] {'a'}, new ItemStack[] {Item.make(Material.COBBLESTONE)});

			r.addCompressedRecipe(JimItems.COMPRESSED_COBBLESTONE, Item.make(Material.COBBLESTONE));
			r.addCompressedRecipe(JimItems.DOUBLE_COMPRESSED_COBBLESTONE, JimItems.COMPRESSED_COBBLESTONE);
			r.addCompressedRecipe(JimItems.TRIPLE_COMPRESSED_COBBLESTONE, JimItems.DOUBLE_COMPRESSED_COBBLESTONE);
			r.addCompressedRecipe(JimItems.QUADRUPLE_COMPRESSED_COBBLESTONE, JimItems.TRIPLE_COMPRESSED_COBBLESTONE);
			r.addCompressedRecipe(JimItems.QUINTUPLE_COMPRESSED_COBBLESTONE, JimItems.QUADRUPLE_COMPRESSED_COBBLESTONE);
			r.addCompressedRecipe(JimItems.SEXTUPLE_COMPRESSED_COBBLESTONE, JimItems.QUINTUPLE_COMPRESSED_COBBLESTONE);

			r.addCompressedRecipe(JimItems.COMPRESSED_COAL, Item.make(Material.COAL));
			r.addCompressedRecipe(JimItems.DOUBLE_COMPRESSED_COAL, JimItems.COMPRESSED_COAL);
			r.addCompressedRecipe(JimItems.TRIPLE_COMPRESSED_COAL, JimItems.DOUBLE_COMPRESSED_COAL);
			
			r.addCompressedRecipe(JimItems.COMPRESSED_IRON, Item.make(Material.IRON_INGOT));
			r.addCompressedRecipe(JimItems.DOUBLE_COMPRESSED_IRON, JimItems.COMPRESSED_IRON);
			r.addCompressedRecipe(JimItems.TRIPLE_COMPRESSED_IRON, JimItems.DOUBLE_COMPRESSED_IRON);

			r.addCompressedRecipe(JimItems.COMPRESSED_GOLD, Item.make(Material.GOLD_INGOT));
			r.addCompressedRecipe(JimItems.DOUBLE_COMPRESSED_GOLD, JimItems.COMPRESSED_GOLD);
			r.addCompressedRecipe(JimItems.TRIPLE_COMPRESSED_GOLD, JimItems.DOUBLE_COMPRESSED_GOLD);

			r.addCompressedRecipe(JimItems.COMPRESSED_LAPIS, Item.make(Material.LAPIS_LAZULI));
			r.addCompressedRecipe(JimItems.DOUBLE_COMPRESSED_LAPIS, JimItems.COMPRESSED_LAPIS);
			r.addCompressedRecipe(JimItems.TRIPLE_COMPRESSED_LAPIS, JimItems.DOUBLE_COMPRESSED_LAPIS);

			r.addCompressedRecipe(JimItems.COMPRESSED_REDSTONE, Item.make(Material.REDSTONE));
			r.addCompressedRecipe(JimItems.DOUBLE_COMPRESSED_REDSTONE, JimItems.COMPRESSED_REDSTONE);
			r.addCompressedRecipe(JimItems.TRIPLE_COMPRESSED_REDSTONE, JimItems.DOUBLE_COMPRESSED_REDSTONE);

			r.addCompressedRecipe(JimItems.COMPRESSED_EMERALD, Item.make(Material.EMERALD));
			r.addCompressedRecipe(JimItems.DOUBLE_COMPRESSED_EMERALD, JimItems.COMPRESSED_EMERALD);
			r.addCompressedRecipe(JimItems.TRIPLE_COMPRESSED_EMERALD, JimItems.DOUBLE_COMPRESSED_EMERALD);

			r.addCompressedRecipe(JimItems.COMPRESSED_DIAMOND, Item.make(Material.DIAMOND));
			r.addCompressedRecipe(JimItems.DOUBLE_COMPRESSED_DIAMOND, JimItems.COMPRESSED_DIAMOND);
			r.addCompressedRecipe(JimItems.TRIPLE_COMPRESSED_DIAMOND, JimItems.DOUBLE_COMPRESSED_DIAMOND);

			r.addCompressedRecipe(JimItems.COMPRESSED_OBSIDIAN, Item.make(Material.OBSIDIAN));
			r.addCompressedRecipe(JimItems.DOUBLE_COMPRESSED_OBSIDIAN, JimItems.COMPRESSED_OBSIDIAN);
			r.addCompressedRecipe(JimItems.TRIPLE_COMPRESSED_OBSIDIAN, JimItems.DOUBLE_COMPRESSED_OBSIDIAN);

		}
}
