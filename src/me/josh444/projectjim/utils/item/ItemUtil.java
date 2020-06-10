package me.josh444.projectjim.utils.item;

import java.lang.reflect.Field;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.items.JimItem;
import me.josh444.projectjim.items.JimItems;

public class ItemUtil {
	
		public static Boolean isNullOrAir(ItemStack item) {
			return item == null || item.getType().equals(Material.AIR);
		}
		
		public static String getName(ItemStack item) {
			if(isNullOrAir(item)) {return null;}
			if(item.hasItemMeta()) {
				return item.getItemMeta().getDisplayName();
			} else {
				return item.getType().name();
			}
		}
		
		public static JimItem findJimItem(ItemStack item) {
			
			JimItem match = null;			
			
			for(Field f: JimItems.class.getDeclaredFields()) {
				try {
					JimItem jim = (JimItem) f.get(f.getName());
					if(getName(item).equals(jim.getName())) {
						match = jim;
					}
				} catch (IllegalArgumentException | IllegalAccessException e1) {
					e1.printStackTrace();
				}
			}
			return match;
		}
		
		public static void dropItem(World w, Block b, ItemStack item) {
			w.dropItemNaturally(b.getLocation(), item);
		}

}
