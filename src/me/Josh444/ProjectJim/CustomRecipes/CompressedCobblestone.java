package me.Josh444.ProjectJim.CustomRecipes;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import me.Josh444.ProjectJim.ProjectJim;
import me.Josh444.ProjectJim.Utils.Item;

public class CompressedCobblestone implements Listener{
	
	private JavaPlugin plugin = ProjectJim.getPlugin(ProjectJim.class);

	public static String skullID = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGMxNzU0ODUxZTM2N2U4YmViYTJhNmQ4ZjdjMmZlZGU4N2FlNzkzYWM1NDZiMGYyOTlkNjczMjE1YjI5MyJ9fX0=";
	public static String name = ChatColor.YELLOW + "Compressed Cobblestone";
	public static String name2 = ChatColor.BLUE + "Double Compressed Cobblestone";
	public static String name3 = ChatColor.LIGHT_PURPLE + "Triple Compressed Cobblestone";
	
	public void compressedCobblestone() {
				
		ItemStack item = Item.skull(skullID, 1, name);
		NamespacedKey key = new NamespacedKey(plugin, item.getType().name().toString());
		ShapedRecipe r = new ShapedRecipe(key, item);
		
		r.shape("aaa", "a a", "aaa");
		r.setIngredient('a', Material.COBBLESTONE);

		Bukkit.addRecipe(r);
	}
	
	@SuppressWarnings("deprecation")
	public void compressedCobblestone2() {
		
		ItemStack item = Item.skull(skullID, 1, name2);
		NamespacedKey key = new NamespacedKey(plugin, item.getType().name().toString());
		ShapedRecipe r = new ShapedRecipe(key, item);
		
		r.shape("aaa", "a a", "aaa");
		r.setIngredient('a',  new RecipeChoice.ExactChoice(Item.skull(skullID, 1, name)));

		Bukkit.addRecipe(r);
	}
	
	@SuppressWarnings("deprecation")
	public void compressedCobblestone3() {
		
		ItemStack item = Item.skull(skullID, 1, name3);
		NamespacedKey key = new NamespacedKey(plugin, item.getType().name().toString());
		ShapedRecipe r = new ShapedRecipe(key, item);
		
		r.shape("aaa", "a a", "aaa");
		r.setIngredient('a', new RecipeChoice.ExactChoice(Item.skull(skullID, 1, name2)));

		Bukkit.addRecipe(r);
	}
}