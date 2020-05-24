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
import me.josh444.projectjim.customitems.JimItem;
import me.josh444.projectjim.customitems.TopicPaper;
import me.josh444.projectjim.customitems.TopicPaper.TopicPaperType;
import me.josh444.projectjim.utils.PlayerData;

public class PlayerSetup implements Listener{

	private JavaPlugin plugin = ProjectJim.getPlugin(ProjectJim.class);
	
	public PlayerSetup(ProjectJim plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
	
	@EventHandler
	public void setupPlayer(PlayerJoinEvent e) throws IllegalArgumentException, IllegalAccessException {
		
		Player p = e.getPlayer();
		String uuid = p.getUniqueId().toString();
		FileConfiguration config = PlayerData.getConfig(p);
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
		
		
		//This is for testing remember to remove later
		for(Field field : TopicPaper.class.getDeclaredFields()) {
			if(field.getType().toString().equals("class me.josh444.projectjim.customitems.TopicPaper")) {
				
				TopicPaper paper = (TopicPaper) field.get(field.getName());
				
				if(paper.type.equals(TopicPaperType.RECIPE)) {
					p.undiscoverRecipe(new NamespacedKey(plugin, paper.unlock.key));
				}
				
			}
		}
		
		config.set("unlocked", null);
		PlayerData.saveConfig(config, file);
		
	}
}
