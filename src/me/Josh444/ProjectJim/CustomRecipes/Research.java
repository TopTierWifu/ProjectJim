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

public class Research implements Listener{
	
	private JavaPlugin plugin = ProjectJim.getPlugin(ProjectJim.class);

	public void customResearchBook() {
		
		String name = ChatColor.DARK_PURPLE + "Research";
		String blank = "";
		String open = ChatColor.DARK_AQUA + "Right Click" + ChatColor.WHITE + " to bind to self";
		
		ItemStack item = Item.make(Material.ENCHANTED_BOOK, 1, name, blank, open);
		NamespacedKey key = new NamespacedKey(plugin, item.getType().name().toString());
		ShapedRecipe r = new ShapedRecipe(key, item);
		
		r.shape("gha", "fib", "edc");
		r.setIngredient('a', Material.STONE);
		r.setIngredient('b', Material.COAL_ORE);
		r.setIngredient('c', Material.IRON_ORE);
		r.setIngredient('d', Material.GOLD_ORE);
		r.setIngredient('e', Material.LAPIS_ORE);
		r.setIngredient('f', Material.REDSTONE_ORE);
		r.setIngredient('g', Material.EMERALD_ORE);
		r.setIngredient('h', Material.DIAMOND_ORE);
		r.setIngredient('i', Material.WRITABLE_BOOK);

		Bukkit.addRecipe(r);
	}
}
