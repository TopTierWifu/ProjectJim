package me.josh444.projectjim.customrecipes.compressed.cobblestone;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.customitems.CustomItem;

public class DoubleCompressedCobblestone implements Listener{
	
	private JavaPlugin plugin = ProjectJim.getPlugin(ProjectJim.class);

	public void addRecipe() {
		
		ItemStack item = CustomItem.DOUBLE_COMPRESSED_COBBLESTONE;
		NamespacedKey key = new NamespacedKey(plugin, "double_compressed_cobblestone");
		ShapedRecipe r = new ShapedRecipe(key, item);
		
		@SuppressWarnings("deprecation")
		RecipeChoice c = new RecipeChoice.ExactChoice(CustomItem.COMPRESSED_COBBLESTONE);
		
		r.shape("aaa", "aaa", "aaa");
		r.setIngredient('a', c);

		Bukkit.addRecipe(r);
	}
}