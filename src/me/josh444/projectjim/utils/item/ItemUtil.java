package me.josh444.projectjim.utils.item;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.josh444.projectjim.items.JimItem;

public class ItemUtil {

	public static Boolean isNullOrAir(ItemStack item) {
		return item == null || item.getType().equals(Material.AIR);
	}
	
	public static Boolean isPickaxe(ItemStack item) {
		
		if(isNullOrAir(item)) {
			return false;
		}
		
		boolean wood = item.getType().equals(Material.WOODEN_PICKAXE);
		boolean stone = item.getType().equals(Material.STONE_PICKAXE);
		boolean iron = item.getType().equals(Material.IRON_PICKAXE);
		boolean gold = item.getType().equals(Material.GOLDEN_PICKAXE);
		boolean diamond = item.getType().equals(Material.DIAMOND_PICKAXE);
		
		return wood || stone || iron || gold || diamond;
	}
	
	public static String getName(ItemStack item) {
		if(isNullOrAir(item)) {return null;}
		if(item.hasItemMeta()) {
			return item.getItemMeta().getDisplayName();
		} else {
			return item.getType().name();
		}
	}
	
	public static boolean dropLoot(Location loc, HashMap<ItemStack, Double> lootTable) {
		
		Double r = new Random().nextDouble() * 100;
		Double p = 100D;
		Iterator<ItemStack> keys = lootTable.keySet().iterator();
		ItemStack key = null;
		
		for(int i = 0; i < lootTable.size(); i++) {
			if(keys.hasNext()) {key = keys.next();}
			p -= lootTable.get(key);
			if(r >= p) {
				loc.getWorld().dropItemNaturally(loc, key);
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean dropItem(Location loc, ItemStack item) {
		loc.getWorld().dropItemNaturally(loc, item);
		return true;
	}
	
	public static ItemStack setLore(ItemStack item, List<String> lore) {
		ItemMeta meta = item.getItemMeta();
		meta.setLore(lore);
		item.setItemMeta(meta);
		return item;
	}
	
	public static HashMap<ItemStack, Double> addTreasureHashMap(HashMap<ItemStack, Double> lootTable) {
		lootTable.put(JimItem.RNG.getItem(), 50D);
		return lootTable;
	}
	
	public static HashMap<ItemStack, Double> addRest(ItemStack item, HashMap<ItemStack, Double> lootTable) {
		double p = 100D;
		Iterator<ItemStack> keys = lootTable.keySet().iterator();
		for(int i = 0; i < lootTable.size(); i++) {
			if(keys.hasNext()) {p -= lootTable.get(keys.next());}
		}
		lootTable.put(item, p);
		return lootTable;
	}
	
	
	
}
