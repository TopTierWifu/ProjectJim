package me.josh444.projectjim.utils;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

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
}
