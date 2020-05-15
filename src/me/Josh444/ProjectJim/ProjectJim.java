package me.Josh444.ProjectJim;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import me.Josh444.ProjectJim.Listeners.OnJoin;

public class ProjectJim extends JavaPlugin{
	
	public void onEnable() {
		
		//Registering Events
		getServer().getPluginManager().registerEvents(new OnJoin(), this);
		
		//Enable Message
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Project Jim has been enabled");
	}
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "Project Jim has been disabled");
	}
}	
