package me.josh444.projectjim.utils.item;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.UUID;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

public class Skull {

	public static ItemStack make(String[] skullData, int amount) {
		
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
	
	public static ItemStack make(String[] skullData, int amount, String name, String...lore) {
		
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
	
	
}
