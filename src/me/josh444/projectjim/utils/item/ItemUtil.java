package me.josh444.projectjim.utils.item;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

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
	
	public static boolean dropLoot(World w, Block b, HashMap<ItemStack, Double> lootTable) {
		
		Double r = new Random().nextDouble() * 100;
		Double p = 100D;
		Iterator<ItemStack> keys = lootTable.keySet().iterator();
		ItemStack key = null;
		
		for(int i = 0; i < lootTable.size(); i++) {
			if(keys.hasNext()) {key = keys.next();}
			p -= lootTable.get(key);
			if(r >= p) {
				w.dropItemNaturally(b.getLocation(), key);
				return true;
			}
		}
		
		return false;
	}
		
}
