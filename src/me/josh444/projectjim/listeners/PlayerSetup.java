package me.josh444.projectjim.listeners;

import java.io.File;
import java.io.IOException;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.josh444.projectjim.ProjectJim;

public class PlayerSetup implements Listener{

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
		
	}
}
