package me.Josh444.ProjectJim;

import org.bukkit.ChatColor;
import org.bukkit.GameRule;
import org.bukkit.plugin.java.JavaPlugin;

import me.Josh444.ProjectJim.CustomRecipes.FieldJournal;
import me.Josh444.ProjectJim.CustomRecipes.PublishedResearch;
import me.Josh444.ProjectJim.Listeners.OnJoin;
import me.Josh444.ProjectJim.Listeners.OpenFieldJournal;

public class ProjectJim extends JavaPlugin{
	
	public void onEnable() {
		
		//Registering Events
		getServer().getPluginManager().registerEvents(new OnJoin(), this);
		getServer().getPluginManager().registerEvents(new OpenFieldJournal(), this);
		
		//Custom Recipes
		FieldJournal fJ = new FieldJournal(); fJ.customFieldJournal();
		PublishedResearch pR = new PublishedResearch(); pR.customPublishedResearch();
		
		//Enabling limited crafting so custom recipes may work properly in recipe book
		getServer().getWorld("world").setGameRule(GameRule.DO_LIMITED_CRAFTING, true);
		
		//Enable Message
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Project Jim has been enabled");
	}
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "Project Jim has been disabled");
	}
}	
