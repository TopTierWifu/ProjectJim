package me.josh444.projectjim.utils;

import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.AttributeModifier;
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
		
		meta.setDisplayName(ChatColor.WHITE + name);
		meta.setLore(Arrays.asList(lore));
		
		item.setItemMeta(meta);
		return item;
	}
	
	public static ItemStack make(Material material, int amount, String name, ItemAttribute[] attributes, String...lore) {
		ItemStack item = new ItemStack(material,amount);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + name);
		for(int i = 0; i < attributes.length; i++) {
			ItemAttribute a = attributes[i];
			meta.addAttributeModifier(a.getAttribute(), new AttributeModifier(a.getUUID(), name, a.getAmount(), a.getOperation(), a.getSlot()));

		}
		
		item.setItemMeta(meta);
		return item;
	}
	
	

}
