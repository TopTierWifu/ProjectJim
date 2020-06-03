package me.josh444.projectjim.recipes;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.items.JimItem;

public class Compress implements Listener{
	
	private JavaPlugin plugin = ProjectJim.getPlugin(ProjectJim.class);

	public void addCompressRecipe(JimItem result, ItemStack input) {
		
		JimItem jim = result;
		
		ItemStack item = jim.item;
		NamespacedKey key = new NamespacedKey(plugin, jim.key);
		ShapedRecipe r = new ShapedRecipe(key, item);
		
		@SuppressWarnings("deprecation")
		RecipeChoice c = new RecipeChoice.ExactChoice(input);
		
		r.shape("aaa", "a  ", "   ");
		r.setIngredient('a', c);

		Bukkit.addRecipe(r);
	}
}