package me.josh444.projectjim.customitems;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.utils.Item;

public class TopicPaper {

	public JimItem unlock;
	public String name;
	public ItemStack cost;
	public String costString;
	
	public TopicPaper(JimItem unlock, ItemStack cost) {
		this.unlock = unlock;
		this.name = unlock.item.getItemMeta().getDisplayName();
		this.cost = cost;
		this.costString = (cost.hasItemMeta()) ? ChatColor.GRAY + "- " + cost.getAmount() + " " + cost.getItemMeta().getDisplayName() : ChatColor.GRAY + "- " + cost.getAmount() + " " + cost.getType().name();
	}
	
	public static ItemStack make(TopicPaper paperData) {
		
		ItemStack paper = Item.make(Material.PAPER, 1, paperData.name, paperData.costString);
		
		return paper;
	}
	
	public static final TopicPaper COMPRESSED_COBBLESTONE = new TopicPaper(JimItem.COMPRESSED_COBBLESTONE, Item.make(Material.COBBLESTONE, 128));
	
}
