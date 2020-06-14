package me.josh444.projectjim.utils;

import org.bukkit.ChatColor;

public enum Upgrade {

	MOLTEN(ChatColor.DARK_RED + "Molten", "molten"),
	TREASURE(ChatColor.GOLD + "Treasure Find", "treasure");
	
	private String lore;
	private String key;
	
	Upgrade(String lore, String key){
		this.lore = lore;
		this.key = key;
	}

	public String getLore() {
		return lore;
	}

	public String getKey() {
		return key;
	}
	
}
