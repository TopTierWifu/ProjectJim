package me.josh444.projectjim.utils;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.items.JimItem;

public class User {

	public static String[] attributes(Player p) {
		
		double speed = Math.round(10*(43.178 * p.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).getValue() - 0.02141))/((double)10.0);
		
		String health = ChatColor.RED + "❤ Health " + p.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
		String armor = ChatColor.DARK_GREEN + "❈ Armor " + p.getAttribute(Attribute.GENERIC_ARMOR).getValue();
		String armorToughness = ChatColor.DARK_GRAY + "❂ Armor Toughness " + p.getAttribute(Attribute.GENERIC_ARMOR_TOUGHNESS).getValue();
		String knockbackResistance = ChatColor.DARK_PURPLE + "۞ Knockback Resistance " + p.getAttribute(Attribute.GENERIC_KNOCKBACK_RESISTANCE).getValue();
		String damage = ChatColor.DARK_RED + "✄ Damage " + p.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).getValue();
		String attackSpeed = ChatColor.AQUA + "✦ Attack Speed " + p.getAttribute(Attribute.GENERIC_ATTACK_SPEED).getValue();
		String movementSpeed = ChatColor.WHITE + "✧ Speed " + (speed);
		String xp = ChatColor.LIGHT_PURPLE + "☀ XP " + p.getTotalExperience();
		
		String[] stats = new String[] {health, armor, armorToughness, knockbackResistance, damage, attackSpeed, movementSpeed, xp};
		
		return stats;
	}
	
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
	
	public static boolean hasUnlock(Player p, JimItem jim, ItemStack item) {
		if(item.equals(jim.getItem())) {
			
			FileConfiguration config = User.getConfig(p);
			
			if(config.contains("unlocked." + jim.getKey())) {
				return true;
			} else {
				p.sendMessage(ProjectJim.prefix + "You have not unlocked " + jim.getName());
			}
		}
		
		return false;
	}
	
	public static boolean hasUnlock(Player p, JimItem jim) {
			
		FileConfiguration config = User.getConfig(p);
			
		if(config.contains("unlocked." + jim.getKey())) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static boolean isLeftClick(PlayerInteractEvent e) {
		Boolean air = e.getAction().equals(Action.LEFT_CLICK_AIR);
		Boolean block = e.getAction().equals(Action.LEFT_CLICK_BLOCK);
		return (air || block);
	}
	
}
