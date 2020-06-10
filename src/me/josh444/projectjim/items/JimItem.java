package me.josh444.projectjim.items;

import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.utils.item.ItemUtil;

public class JimItem {

	private String key;
	private Type type;
	private ItemStack item;
	
	public enum Type{
		COMPRESSED,
		ARMOR,
		METAL,
		TOOL,
		ORE
	}
	
	public JimItem(ItemStack item, String key, Type type) {
		this.item = item;
		this.key = key;
		this.type = type;
	}
	
	public String getKey() {
		return key;
	}
	
	public ItemStack getItem() {
		return item;
	}
	
	public Type getType() {
		return type;
	}
	
	public String getName() {
		return item.getItemMeta().getDisplayName();
	}
	
	public Boolean isItem(ItemStack item) {
		if(ItemUtil.getName(item).equals(this.getName())) {
			return true;
		} else {
			return false;
		}
	}
	
}
