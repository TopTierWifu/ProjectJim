package me.Josh444.ProjectJim.CustomRecipes;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import me.Josh444.ProjectJim.ProjectJim;
import me.Josh444.ProjectJim.Utils.Item;

public class FieldJournal implements Listener{
	
	private JavaPlugin plugin = ProjectJim.getPlugin(ProjectJim.class);

	public void customFieldJournal() {
		
		String name = ChatColor.DARK_PURPLE + "Field Journal";
		
		ItemStack item = Item.make(Material.WRITTEN_BOOK, 1, name);
		NamespacedKey key = new NamespacedKey(plugin, item.getType().name().toString());
		ShapedRecipe r = new ShapedRecipe(key, item);
		
		r.shape("dac", "beb", "cad");
		r.setIngredient('a', Material.DIRT);
		r.setIngredient('b', Material.SAND);
		r.setIngredient('c', Material.GRAVEL);
		r.setIngredient('d', Material.COBBLESTONE);
		r.setIngredient('e', Material.WRITABLE_BOOK);

		Bukkit.addRecipe(r);
	}
}
