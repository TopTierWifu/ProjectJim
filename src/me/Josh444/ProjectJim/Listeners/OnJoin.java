package me.Josh444.ProjectJim.Listeners;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import me.Josh444.ProjectJim.ProjectJim;
import me.Josh444.ProjectJim.Utils.Item;

public class OnJoin implements Listener{

	private JavaPlugin plugin = ProjectJim.getPlugin(ProjectJim.class);
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		
		Player p = e.getPlayer();
		
		//Removes all unlockable recipes
		p.undiscoverRecipe(new NamespacedKey(plugin, Item.make(Material.ENCHANTED_BOOK).getType().name().toString()));

		
		//Adds *some* of the custom recipies to the knowledge book
		p.discoverRecipe(new NamespacedKey(plugin, Item.make(Material.WRITTEN_BOOK).getType().name().toString()));
		
	}
}
