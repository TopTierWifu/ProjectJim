package me.josh444.projectjim.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

import net.md_5.bungee.api.ChatColor;

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
	
	public static ItemStack make(Material material, int amount, String name, List<String>lore) {
		ItemStack item = new ItemStack(material,amount);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + name);
		meta.setLore(lore);
		
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
	
	public static ItemStack skull(String[] skullData, int amount, String name, String...lore) {
		
		final ItemStack skull = new ItemStack(Material.PLAYER_HEAD, amount);
        SkullMeta meta = (SkullMeta) skull.getItemMeta();
        assert meta != null;
        GameProfile profile = new GameProfile(UUID.fromString(skullData[1]), null);
        profile.getProperties().put("textures", new Property("textures", skullData[0]));
        try {
            Method mtd = meta.getClass().getDeclaredMethod("setProfile", GameProfile.class);
            mtd.setAccessible(true);
            mtd.invoke(meta, profile);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
            ex.printStackTrace();
        }
		
		meta.setDisplayName(name);
		meta.setLore(Arrays.asList(lore));
		
		skull.setItemMeta(meta);
		
		return skull;
	}
	
	public static ItemStack skull(String[] skullData, int amount) {
		
		final ItemStack skull = new ItemStack(Material.PLAYER_HEAD, amount);
        SkullMeta meta = (SkullMeta) skull.getItemMeta();
        assert meta != null;
        GameProfile profile = new GameProfile(UUID.fromString(skullData[1]), null);
        profile.getProperties().put("textures", new Property("textures", skullData[0]));
        try {
            Method mtd = meta.getClass().getDeclaredMethod("setProfile", GameProfile.class);
            mtd.setAccessible(true);
            mtd.invoke(meta, profile);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
            ex.printStackTrace();
        }
		
		skull.setItemMeta(meta);
		
		return skull;
	}
	
	public static ItemStack wand(Material material, int amount, String name, String...lore) {
		ItemStack item = new ItemStack(material,amount);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + name);
		meta.setLore(Arrays.asList(lore));
		meta.addEnchant(Enchantment.LOYALTY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		return item;
	}
	
	public static ItemStack setAmount(ItemStack item, int amount) {
		item.setAmount(amount);
		return item;
	}
	
	public static ItemStack setLore(ItemStack item, String...lore) {
		ItemMeta meta = item.getItemMeta();
		meta.setLore(Arrays.asList(lore));
		item.setItemMeta(meta);
		return item;
	}
}