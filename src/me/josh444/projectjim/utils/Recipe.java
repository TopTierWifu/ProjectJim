package me.josh444.projectjim.utils;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.items.JimItem;

public class Recipe {

	private JavaPlugin plugin = ProjectJim.getPlugin(ProjectJim.class);
	
	@SuppressWarnings("deprecation")
	public void addRecipe(JimItem result, String[] shape, char[] keys, ItemStack[] ingredients) {
		
		JimItem jim = result;
		
		ItemStack item = jim.getItem();
		NamespacedKey key = new NamespacedKey(plugin, jim.getKey());
		ShapedRecipe r = new ShapedRecipe(key, item);
		
		r.shape(shape);
		
		for(int i = 0; i < keys.length; i++) {
			r.setIngredient(keys[i], new RecipeChoice.ExactChoice(ingredients[i]));
		}

		Bukkit.addRecipe(r);
	}
	
	public void addCompressedRecipe(JimItem result, JimItem input) {
		
		JimItem jim = result;
		
		ItemStack item = jim.getItem();
		NamespacedKey key = new NamespacedKey(plugin, jim.getKey());
		ShapedRecipe r = new ShapedRecipe(key, item);
		
		@SuppressWarnings("deprecation")
		RecipeChoice c = new RecipeChoice.ExactChoice(input.getItem());
		
		r.shape("aaa", "a  ", "   ");
		r.setIngredient('a', c);

		Bukkit.addRecipe(r);
	}
	
	public void addCompressedRecipe(JimItem result, ItemStack input) {
		
		JimItem jim = result;
		
		ItemStack item = jim.getItem();
		NamespacedKey key = new NamespacedKey(plugin, jim.getKey());
		ShapedRecipe r = new ShapedRecipe(key, item);
		
		r.shape("aaa", "a  ", "   ");
		r.setIngredient('a', input.getType());

		Bukkit.addRecipe(r);
	}

}
