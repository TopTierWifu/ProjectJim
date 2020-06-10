package me.josh444.projectjim.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.BlastingRecipe;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.items.JimItem;
import me.josh444.projectjim.utils.item.Item;

public class Recipe {

	private JavaPlugin plugin = ProjectJim.getPlugin(ProjectJim.class);
	private char[] keys = new char[] {'a','b','c','d','e','f','g','h','i'};
	
	@SuppressWarnings("deprecation")
	public void addRecipe(JimItem jim, String[] shape, ItemStack[] input) {

		ShapedRecipe r = new ShapedRecipe(new NamespacedKey(plugin, jim.getKey()), jim.getItem());
		
		r.shape(shape);
		
		for(int i = 0; i < input.length; i++) {
			r.setIngredient(keys[i], new RecipeChoice.ExactChoice(input[i]));
		}

		Bukkit.addRecipe(r);
	}
	
	public void addCRecipe(JimItem jim, JimItem item) {
		ShapedRecipe r = new ShapedRecipe(new NamespacedKey(plugin, jim.getKey()), jim.getItem());
		
		@SuppressWarnings("deprecation")
		RecipeChoice c = new RecipeChoice.ExactChoice(item.getItem());
		
		r.shape("aaa", "aaa", "aaa");
		r.setIngredient('a', c);

		Bukkit.addRecipe(r);
	}
	
	public void addCRecipe(JimItem jim, Material material) {
		ShapedRecipe r = new ShapedRecipe(new NamespacedKey(plugin, jim.getKey()), jim.getItem());
		
		@SuppressWarnings("deprecation")
		RecipeChoice c = new RecipeChoice.ExactChoice(Item.make(material));
		
		r.shape("aaa", "aaa", "aaa");
		r.setIngredient('a', c);

		Bukkit.addRecipe(r);
	}
	
	public void addFurnaceRecipe(JimItem result, ItemStack input, float xp, int sec) {

		@SuppressWarnings("deprecation")
		RecipeChoice c = new RecipeChoice.ExactChoice(input);
		
		FurnaceRecipe r = new FurnaceRecipe(new NamespacedKey(plugin, result.getKey()), result.getItem(), c, xp, sec*20);
		
		Bukkit.addRecipe(r);
	}
	
	public void addBlastRecipe(JimItem result, ItemStack input, float xp, int sec) {

		@SuppressWarnings("deprecation")
		RecipeChoice c = new RecipeChoice.ExactChoice(input);
		
		BlastingRecipe r = new BlastingRecipe(new NamespacedKey(plugin, result.getKey()), result.getItem(), c, xp, sec*20);
		
		Bukkit.addRecipe(r);
	}
	
}
