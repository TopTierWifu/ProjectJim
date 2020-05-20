package me.Josh444.ProjectJim.Utils;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.UUID;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

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
	
	public static ItemStack skull(String base64EncodedString, int amount, String name, String...lore) {
		
		final ItemStack skull = new ItemStack(Material.PLAYER_HEAD, amount);
        SkullMeta meta = (SkullMeta) skull.getItemMeta();
        assert meta != null;
        GameProfile profile = new GameProfile(UUID.randomUUID(), null);
        profile.getProperties().put("textures", new Property("textures", base64EncodedString));
        try {
            Field profileField = meta.getClass().getDeclaredField("profile");
            profileField.setAccessible(true);
            profileField.set(meta, profile);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
		
		meta.setDisplayName(name);
		meta.setLore(Arrays.asList(lore));
		
		skull.setItemMeta(meta);
		
		return skull;
	}
	
}
