package me.josh444.projectjim.utils.item;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.UUID;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

public class Skull {

	public static ItemStack make(Texture data, int amount) {
		
		final ItemStack skull = new ItemStack(Material.PLAYER_HEAD, amount);
        SkullMeta meta = (SkullMeta) skull.getItemMeta();
        assert meta != null;
        GameProfile profile = new GameProfile(UUID.fromString(data.getUUID()), null);
        profile.getProperties().put("textures", new Property("textures", data.getTexture()));
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
	
	public static ItemStack make(Texture data, int amount, String name) {
		
		final ItemStack skull = new ItemStack(Material.PLAYER_HEAD, amount);
        SkullMeta meta = (SkullMeta) skull.getItemMeta();
        assert meta != null;
        GameProfile profile = new GameProfile(UUID.fromString(data.getUUID()), null);
        profile.getProperties().put("textures", new Property("textures", data.getTexture()));
        try {
            Method mtd = meta.getClass().getDeclaredMethod("setProfile", GameProfile.class);
            mtd.setAccessible(true);
            mtd.invoke(meta, profile);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
            ex.printStackTrace();
        }
		
		meta.setDisplayName(name);
		
		skull.setItemMeta(meta);
		
		return skull;
	}
	
	public static ItemStack make(Texture data, int amount, String name, List<String> lore) {
		
		final ItemStack skull = new ItemStack(Material.PLAYER_HEAD, amount);
        SkullMeta meta = (SkullMeta) skull.getItemMeta();
        assert meta != null;
        GameProfile profile = new GameProfile(UUID.fromString(data.getUUID()), null);
        profile.getProperties().put("textures", new Property("textures", data.getTexture()));
        try {
            Method mtd = meta.getClass().getDeclaredMethod("setProfile", GameProfile.class);
            mtd.setAccessible(true);
            mtd.invoke(meta, profile);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
            ex.printStackTrace();
        }
		
		meta.setDisplayName(name);
		meta.setLore(lore);
		
		skull.setItemMeta(meta);
		
		return skull;
	}
	
	
}
