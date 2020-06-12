package me.josh444.projectjim;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import me.josh444.projectjim.items.Recipes;
import me.josh444.projectjim.listeners.CancelBlockPlacement;
import me.josh444.projectjim.listeners.ItemUpgrade;
import me.josh444.projectjim.listeners.PlayerSetup;
import me.josh444.projectjim.listeners.StructureGen;
import me.josh444.projectjim.listeners.mobdrops.Witch;
import me.josh444.projectjim.listeners.tools.MoltenPickaxe;
import me.josh444.projectjim.listeners.tools.StoneBreak;

public class ProjectJim extends JavaPlugin{
	
	public static String prefix = ChatColor.GREEN + "Project Jim " + ChatColor.GRAY + "> " + ChatColor.RESET;
	
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
		
		new StructureGen(this);
		
		new PlayerSetup(this);
		new CancelBlockPlacement(this);
		new ItemUpgrade(this);
		
		//Tools
		new StoneBreak(this);
		new MoltenPickaxe(this);
		
		//Mob Drops
		new Witch(this);
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
