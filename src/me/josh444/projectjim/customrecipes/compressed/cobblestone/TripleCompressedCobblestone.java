package me.josh444.projectjim.customrecipes.compressed.cobblestone;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.customitems.JimItem;

public class TripleCompressedCobblestone implements Listener{
	
	private JavaPlugin plugin = ProjectJim.getPlugin(ProjectJim.class);

	public void addRecipe() {
		
		JimItem jim = JimItem.TRIPLE_COMPRESSED_COBBLESTONE;
		
		ItemStack item = jim.item;
		NamespacedKey key = new NamespacedKey(plugin, jim.key);
		ShapedRecipe r = new ShapedRecipe(key, item);
		
		@SuppressWarnings("deprecation")
		RecipeChoice c = new RecipeChoice.ExactChoice(JimItem.DOUBLE_COMPRESSED_COBBLESTONE.item);
		
		r.shape("aaa", "aaa", "aaa");
		r.setIngredient('a', c);

		Bukkit.addRecipe(r);
	}
}