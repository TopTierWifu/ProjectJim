package me.Josh444.ProjectJim;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class ProjectJim extends JavaPlugin{
	
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Project Jim has been enabled");
	}
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "Project Jim has been disabled");
	}
}
