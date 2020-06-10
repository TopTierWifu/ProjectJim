package me.josh444.projectjim.utils;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class User {
	
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
			e.printStackTrace();
		}
	}
}
