package me.josh444.projectjim.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.utils.Item;

public class JimItem {

	private String key;
	private JimType type;
	private JimCategory category;
	private ItemStack item;
	private ItemStack[] cost;

	public JimItem(ItemStack item, String key, JimType type, JimCategory category, ItemStack...cost) {
		this.item = item;
		this.key = key;
		this.type = type;
		this.cost = cost;
	}
	
	public enum JimType{
		DEFAULT,
		RECIPE,
		PORTABLE
	}
	
	public enum JimCategory{
		DEFAULT,
		COMPRESSED,
		MAGIC_WANDS,
		PORTABLE
	}
		
	public String getKey() {
		return key;
	}
	
	public JimType getType() {
		return type;
	}
	
	public JimCategory getCategory() {
		return category;
	}
	
	public ItemStack getItem() {
		return item;
	}
	
	public ItemStack[] getCost() {
		return cost;
	}
	
	public String getName() {
		return item.getItemMeta().getDisplayName();
	}
	
	public List<String> getCostList() {
		List<String> list = new ArrayList<String>();
		for(ItemStack item: cost) {
			String lore = ChatColor.GRAY + "- " + item.getAmount() + " " + Item.getNameRaw(item);
			list.add(lore);
		}
		return list;
	}
	
	public ItemStack getPaper() {
		return Item.make(Material.PAPER, 1, this.getName(), this.getCostList());
	}
	
}
