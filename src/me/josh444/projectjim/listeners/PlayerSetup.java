package me.josh444.projectjim.listeners;

import java.io.File;
import java.io.IOException;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.utils.User;

public class PlayerSetup implements Listener{
	
	private JavaPlugin plugin = ProjectJim.getPlugin(ProjectJim.class);
	
	public PlayerSetup(ProjectJim plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
	
	@EventHandler
	public void setupPlayer(PlayerJoinEvent e) throws IllegalArgumentException, IllegalAccessException {
		
		Player p = e.getPlayer();
		File file = User.getFile(p);
		
		try {
			
			if(!file.exists()) {
				file.createNewFile();
				plugin.getServer().getConsoleSender().sendMessage(ProjectJim.prefix + p.getName() + "'s player file was created");
			}
			
		} catch (IOException ex) {
			plugin.getServer().getConsoleSender().sendMessage(ProjectJim.prefix + p.getName() + "'s player file could not be created");
			ex.printStackTrace();			
		}
		 
	}
}
