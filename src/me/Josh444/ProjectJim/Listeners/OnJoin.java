package me.Josh444.ProjectJim.Listeners;

import java.io.File;
import java.io.IOException;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import me.Josh444.ProjectJim.ProjectJim;
import me.Josh444.ProjectJim.CustomRecipes.CompressedCobblestone;
import me.Josh444.ProjectJim.Utils.Item;

public class OnJoin implements Listener{

	private JavaPlugin plugin = ProjectJim.getPlugin(ProjectJim.class);
	//private FileConfiguration config = plugin.getConfig();
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		
		Player p = e.getPlayer();
		String uuid = p.getUniqueId().toString();
		File file = new File("plugins/ProjectJim/PlayerData/" + uuid + ".yml");
		
		//Registering player to config if not already there
		
		try {
		
		if(file.createNewFile()) {
			System.out.println("File was created");
		}
		
		} catch (IOException e2) {
		      System.out.println("File already exists");
		      e2.printStackTrace();
		
		}
		//Removes all unlockable recipes
		p.undiscoverRecipe(new NamespacedKey(plugin, Item.make(Material.ENCHANTED_BOOK).getType().name().toString()));

		
		//Adds *some* of the custom recipies to the knowledge book
		p.discoverRecipe(new NamespacedKey(plugin, Item.make(Material.WRITTEN_BOOK).getType().name().toString()));
		p.discoverRecipe(new NamespacedKey(plugin, Item.skull(CompressedCobblestone.skullID, 1, CompressedCobblestone.name).getType().name().toString()));
		p.discoverRecipe(new NamespacedKey(plugin, Item.skull(CompressedCobblestone.skullID, 1, CompressedCobblestone.name2).getType().name().toString()));
		p.discoverRecipe(new NamespacedKey(plugin, Item.skull(CompressedCobblestone.skullID, 1, CompressedCobblestone.name3).getType().name().toString()));

		
	}
}
