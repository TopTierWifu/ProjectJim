package me.josh444.projectjim.customrecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.customitems.CustomItem;

public class CompressedCobblestone implements Listener{
	
	private JavaPlugin plugin = ProjectJim.getPlugin(ProjectJim.class);

	public void addRecipe() {
		
		ItemStack item = CustomItem.COMPRESSED_COBBLESTONE;
		NamespacedKey key = new NamespacedKey(plugin, item.getType().name().toString());
		ShapedRecipe r = new ShapedRecipe(key, item);
		
		r.shape("aaa", "a a", "aaa");
		r.setIngredient('a', Material.COBBLESTONE);

		Bukkit.addRecipe(r);
	}
}