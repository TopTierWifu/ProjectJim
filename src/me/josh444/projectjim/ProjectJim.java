package me.josh444.projectjim;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import me.josh444.projectjim.customrecipes.FieldJournal;
import me.josh444.projectjim.listeners.OpenFieldJournal;
import me.josh444.projectjim.listeners.PlayerSetup;
import me.josh444.projectjim.listeners.inventories.FieldJournalInteract;

public class ProjectJim extends JavaPlugin{
	
	public void onEnable() {
		
		setupConfig();
		
		loadCustomRecipes();
		
		registerEvents();
		
		//Enable message
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Project Jim has been enabled");
	}
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "Project Jim has been disabled");
	}
	
	
	public void loadCustomRecipes() {
		FieldJournal fieldJournal = new FieldJournal(); fieldJournal.addRecipe();
	}
	
	public void registerEvents() {
		
		new OpenFieldJournal(this);
		new PlayerSetup(this);
		
		//Inventory interact
		new FieldJournalInteract(this);
	}
	
	public void setupConfig() {
		
		getConfig().options().copyDefaults(true);
		saveConfig();
		
		File file = new File("plugins/ProjectJim/PlayerData");
		
		if(file.mkdirs()) {
			System.out.println("PlayerData folder created");
		}else{
	         System.out.println("PlayerData folder couldn't be created or already exists");
	    }
	}
	
}	