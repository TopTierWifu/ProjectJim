package me.Josh444.ProjectJim.Utils;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class Item {

	public static ItemStack make(Material material) {
		ItemStack item = new ItemStack(material, 1);
		return item;
	}
	
	public static ItemStack make(Material material, int amount) {
		ItemStack item = new ItemStack(material,amount);
		return item;
	}
	
	public static ItemStack make(Material material, int amount, String name, String...lore) {
		ItemStack item = new ItemStack(material,amount);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(name);
		meta.setLore(Arrays.asList(lore));
		
		item.setItemMeta(meta);
		return item;
	}
	
	public static ItemStack skull(Player p, int amount, String name, String...lore) {
		ItemStack skull = new ItemStack(Material.PLAYER_HEAD, amount);
		ItemMeta meta = skull.getItemMeta();
		meta.setDisplayName(name);
		meta.setLore(Arrays.asList(lore));
		((SkullMeta) meta).setOwningPlayer(p);
		skull.setItemMeta(meta);
		
		return skull;
	}
	
}
