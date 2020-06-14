package me.josh444.projectjim.utils;

import java.util.HashMap;
import java.util.Iterator;

import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.items.JimItem;

public class LootTable {

	private HashMap<ItemStack, Double> lootTable;
	
	public LootTable(){lootTable = new HashMap<>();}
	
	public void addOres(Double rate) {
		lootTable.put(JimItem.COPPER_ORE.getItem(), rate);
		lootTable.put(JimItem.LEAD_ORE.getItem(), rate);
		lootTable.put(JimItem.MAGNESIUM_ORE.getItem(), rate);
		lootTable.put(JimItem.SILVER_ORE.getItem(), rate);
		lootTable.put(JimItem.TIN_ORE.getItem(), rate);
	}
	
	public void addMoltenOres(Double rate) {
		lootTable.put(JimItem.SILVER.getItem(), rate);
		lootTable.put(JimItem.COPPER.getItem(), rate);
		lootTable.put(JimItem.MAGNESIUM.getItem(), rate);
		lootTable.put(JimItem.TIN.getItem(), rate);
		lootTable.put(JimItem.LEAD.getItem(), rate);
	}
	
	public void addTreasure(Double rate) {
		lootTable.put(JimItem.RNG.getItem(), rate);
	}

	public void addDrop(ItemStack item, Double rate) {
		if(rate > 0) {lootTable.put(item, rate);}
	}
	
	public void addDefault(ItemStack item) {
		double p = 100D;
		Iterator<ItemStack> keys = lootTable.keySet().iterator();
		for(int i = 0; i < lootTable.size(); i++) {
			if(keys.hasNext()) {p -= lootTable.get(keys.next());}
		}
		if(p > 0) {lootTable.put(item, p);}
	}
	
	public HashMap<ItemStack, Double> getTable() {
		return lootTable;
	}
	
}
