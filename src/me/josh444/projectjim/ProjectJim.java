package me.josh444.projectjim;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import me.josh444.projectjim.items.Recipes;
import me.josh444.projectjim.listeners.CancelBlockPlacement;

public class ProjectJim extends JavaPlugin{
	
	public static String prefix = ChatColor.GREEN + "Project Jim " + ChatColor.GRAY + "> " + ChatColor.WHITE;
	
	public void onEnable() {
		
		setupConfig();
		
		registerEvents();
		
		Recipes.loadRecipes();
		
		//Enable message
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Project Jim has been enabled");
	}
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "Project Jim has been disabled");
	}
	
	public void registerEvents() {
		new CancelBlockPlacement(this);
	}
	
	public void setupConfig() {
		
		getConfig().options().copyDefaults(true);
		saveConfig();
		
		File file = new File("plugins/ProjectJim/PlayerData");
		
		if(file.mkdirs()) {
			System.out.println("PlayerData folder created");
		} else{
	         System.out.println("PlayerData folder couldn't be created or already exists");
	    }
	}
	
}	
