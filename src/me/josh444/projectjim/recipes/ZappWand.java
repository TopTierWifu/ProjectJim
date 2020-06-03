package me.josh444.projectjim.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.items.JimItem;

public class ZappWand implements Listener{
	
	private JavaPlugin plugin = ProjectJim.getPlugin(ProjectJim.class);

	public void addRecipe() {
		
		JimItem jim = JimItem.ZAPP_WAND;
		
		ItemStack item = jim.item;
		NamespacedKey key = new NamespacedKey(plugin, jim.key);
		ShapedRecipe r = new ShapedRecipe(key, item);
		
		r.shape("a  ", "   ", "   ");
		r.setIngredient('a', Material.COBBLESTONE);

		Bukkit.addRecipe(r);
	}
}