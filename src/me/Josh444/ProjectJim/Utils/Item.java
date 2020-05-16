package me.Josh444.ProjectJim.Utils;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

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
}
