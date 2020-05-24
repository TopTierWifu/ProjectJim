package me.josh444.projectjim.customitems;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.utils.Item;
import me.josh444.projectjim.utils.Word;

public class TopicPaper {

	public JimItem unlock;
	public String name;
	public ItemStack[] cost;
	public List<String> costList;
	
	public TopicPaper(JimItem unlock, ItemStack...cost) {
		this.unlock = unlock;
		this.name = unlock.item.getItemMeta().getDisplayName();
		this.cost = cost;
		
		this.costList = new ArrayList<String>();
		
		for(ItemStack item: cost) {																//Didn't apply title case since the display name should already be title case			//Applied title case with this method having a split delimiter of "_" because of the way Minecraft handles type names
			String lore = (item.hasItemMeta()) ? ChatColor.GRAY + "- " + item.getAmount() + " " + item.getItemMeta().getDisplayName() : ChatColor.GRAY + "- " + item.getAmount() + " " + Word.toTitleCase(item.getType().name());
			this.costList.add(lore);
		}
		
	}
	
	public static ItemStack make(TopicPaper paperData) {
		ItemStack paper = Item.make(Material.PAPER, 1, paperData.name, paperData.costList);
		return paper;
	}
	
	public static final TopicPaper COMPRESSED_COBBLESTONE = new TopicPaper(JimItem.COMPRESSED_COBBLESTONE, Item.make(Material.COBBLESTONE, 128));
	public static final TopicPaper DOUBLE_COMPRESSED_COBBLESTONE = new TopicPaper(JimItem.DOUBLE_COMPRESSED_COBBLESTONE, Item.setAmount(JimItem.COMPRESSED_COBBLESTONE.item, 64));
	public static final TopicPaper TRIPLE_COMPRESSED_COBBLESTONE = new TopicPaper(JimItem.TRIPLE_COMPRESSED_COBBLESTONE, Item.setAmount(JimItem.DOUBLE_COMPRESSED_COBBLESTONE.item, 32));

}
