package me.josh444.projectjim.utils;

import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Mana {

	public static final String prefix = ChatColor.AQUA + "Mana " + ChatColor.GRAY + "> ";
	
	public static boolean testXP(Player p, int value) {
		
		int xp = p.getTotalExperience();
		
		if(xp >= value) {
			p.giveExp(-value);
			return true;
		} else if(xp == 0) {
			p.sendMessage(prefix + ChatColor.RED + "You have no xp");
			return false;
		} else {
			p.sendMessage(prefix + ChatColor.RED + "You only have " + xp + " xp");
			return false;
		}
	}

	public static boolean testLevel(Player p, int value) {
		
		int lvl = p.getLevel();		
		
		if(lvl >= value) {
			for(int i = 0; i < value; i++) {
				p.giveExp(-(Mana.getXPfromLevel(p.getLevel()) - Mana.getXPfromLevel(p.getLevel() - 1)));
			}
			return true;
		} else if(lvl == 0) {
			p.sendMessage(prefix + ChatColor.RED + "You have no levels");
			return false;
		} else if(lvl == 1) {
			p.sendMessage(prefix + ChatColor.RED + "You only have " + lvl + " level");
			return false;
		}else {
			p.sendMessage(prefix + ChatColor.RED + "You only have " + lvl + " levels");
			return false;
		}
	}
	
	public static int getXPfromLevel(int level) {
		if(level >= 1 && level <= 16){
			return (int)(Math.pow(level, 2) + 6 * level);
		} else if(level >= 17 && level <= 31){
			return (int)( 2.5 * Math.pow(level, 2) - 40.5 * level + 360);
		} else if(level >= 32){
			return (int)(4.5 * Math.pow(level, 2) - 162.5 * level + 2220);
		} else {
			return 0;
		}
	}
	
}
