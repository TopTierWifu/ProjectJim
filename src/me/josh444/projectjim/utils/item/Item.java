package me.josh444.projectjim.utils.item;

import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.josh444.projectjim.utils.Attributes;

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
	
	public static ItemStack make(Material material, int amount, String name, Attributes[] attributes, String...lore) {
		ItemStack item = new ItemStack(material,amount);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + name);
		meta.setLore(Arrays.asList(lore));
		for(int i = 0; i < attributes.length; i++) {
			Attributes a = attributes[i];
			meta.addAttributeModifier(a.getAttribute(), new AttributeModifier(a.getUUID(), name, a.getAmount(), a.getOperation(), a.getSlot()));

		}
		
		item.setItemMeta(meta);
		return item;
	}

}
