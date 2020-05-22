package me.josh444.projectjim.listeners;

import java.io.File;
import java.io.IOException;

import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.customitems.JimItem;

public class PlayerSetup implements Listener{

	private JavaPlugin plugin = ProjectJim.getPlugin(ProjectJim.class);
	
	public PlayerSetup(ProjectJim plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
	
	@EventHandler
	public void setupPlayer(PlayerJoinEvent e) {
		
		Player p = e.getPlayer();
		String uuid = p.getUniqueId().toString();
		File file = new File("plugins/ProjectJim/PlayerData/" + uuid + ".yml");
		
		try {
			
			if(!file.exists()) {
				file.createNewFile();
				System.out.println( p.getName() + "'s player file was created");
			}
			
			} catch (IOException ex) {
			      System.out.println( p.getName() + "'s player file could not be created");
			      ex.printStackTrace();			
			}
		
		p.discoverRecipe(new NamespacedKey(plugin, JimItem.FIELD_JOURNAL.key));
		p.discoverRecipe(new NamespacedKey(plugin, JimItem.COMPRESSED_COBBLESTONE.key));
		p.discoverRecipe(new NamespacedKey(plugin, JimItem.DOUBLE_COMPRESSED_COBBLESTONE.key));
		p.discoverRecipe(new NamespacedKey(plugin, JimItem.TRIPLE_COMPRESSED_COBBLESTONE.key));
		
		
	}
}
