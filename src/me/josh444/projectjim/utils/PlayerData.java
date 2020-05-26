package me.josh444.projectjim.utils;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.customitems.JimItem;

public class PlayerData {
	
	public static FileConfiguration getConfig(Player p) {
	
		String uuid = p.getUniqueId().toString();
		File file = new File("plugins/ProjectJim/PlayerData/" + uuid + ".yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		return config;
	}
	
	public static File getFile(Player p) {
		
		String uuid = p.getUniqueId().toString();
		File file = new File("plugins/ProjectJim/PlayerData/" + uuid + ".yml");
		
		return file;
	}
	
	public static void saveConfig(FileConfiguration config, File file) {
		try {
			config.save(file);
		} catch (IOException e) {
			Bukkit.getServer().getConsoleSender().sendMessage("Could not save a player's config file");
		}
	}
	
	public static boolean hasUnlock(Player p, String itemName, JimItem jim) {
		if(itemName.equals(jim.item.getItemMeta().getDisplayName())) {
			
			FileConfiguration config = PlayerData.getConfig(p);
			
			if(config.contains("unlocked." + jim.key)) {
				return true;
			} else {
				p.sendMessage(ProjectJim.prefix + "You have not unlocked " + jim.item.getItemMeta().getDisplayName());
			}
		}
		
		return false;
	}
}
