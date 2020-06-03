package me.josh444.projectjim.listeners;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

import org.bukkit.NamespacedKey;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.items.JimItem;
import me.josh444.projectjim.items.JimItem.JimType;
import me.josh444.projectjim.items.JimItems;
import me.josh444.projectjim.utils.User;

public class PlayerSetup implements Listener{

	private JavaPlugin plugin = ProjectJim.getPlugin(ProjectJim.class);
	
	public PlayerSetup(ProjectJim plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
	
	@EventHandler
	public void setupPlayer(PlayerJoinEvent e) throws IllegalArgumentException, IllegalAccessException {
		
		Player p = e.getPlayer();
		FileConfiguration config = User.getConfig(p);
		File file = User.getFile(p);
		
		try {
			
			if(!file.exists()) {
				file.createNewFile();
				System.out.println( p.getName() + "'s player file was created");
			}
			
			} catch (IOException ex) {
			      System.out.println( p.getName() + "'s player file could not be created");
			      ex.printStackTrace();			
			}
		
		p.discoverRecipe(new NamespacedKey(plugin, JimItems.FIELD_JOURNAL.getKey()));
		
		
		
		//This is for testing remember to remove later 
		for(Field field : JimItems.class.getDeclaredFields()) { 
			JimItem jim = (JimItem) field.get(field.getName());
		  
			if(jim.getType().equals(JimType.RECIPE)) { 
				p.undiscoverRecipe(new NamespacedKey(plugin, jim.getKey())); 
			}
		  
		}
		  
		config.set("unlocked", null);
		User.saveConfig(config, file);
		 
	}
}
