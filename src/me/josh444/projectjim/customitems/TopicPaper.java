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
	public ItemStack portable;
	public String name;
	public ItemStack[] cost;
	public List<String> costList;
	public TopicPaperType type;
	
	public TopicPaper(JimItem unlock, TopicPaperType type, ItemStack...cost) {
		this.unlock = unlock;
		this.name = unlock.item.getItemMeta().getDisplayName();
		this.type = type;
		this.cost = cost;
		
		this.costList = new ArrayList<String>();
		
		for(ItemStack item: cost) {																//Didn't apply title case since the display name should already be title case			//Applied title case with this method having a split delimiter of "_" because of the way Minecraft handles type names
			String lore = (item.hasItemMeta()) ? ChatColor.GRAY + "- " + item.getAmount() + " " + item.getItemMeta().getDisplayName() : ChatColor.GRAY + "- " + item.getAmount() + " " + Word.toTitleCase(item.getType().name());
			this.costList.add(lore);
		}
		
	}
	
	public enum TopicPaperType{
		RECIPE,
		PORTABLE
	}
	
	public static ItemStack make(TopicPaper paperData) {
		ItemStack paper = Item.make(Material.PAPER, 1, paperData.name, paperData.costList);
		return paper;
	}
	
	public static final TopicPaper COMPRESSED_COBBLESTONE = new TopicPaper(JimItem.COMPRESSED_COBBLESTONE, TopicPaperType.RECIPE, Item.make(Material.COBBLESTONE, 256));
	public static final TopicPaper DOUBLE_COMPRESSED_COBBLESTONE = new TopicPaper(JimItem.DOUBLE_COMPRESSED_COBBLESTONE, TopicPaperType.RECIPE, Item.setAmount(JimItem.COMPRESSED_COBBLESTONE.item, 128));
	public static final TopicPaper TRIPLE_COMPRESSED_COBBLESTONE = new TopicPaper(JimItem.TRIPLE_COMPRESSED_COBBLESTONE, TopicPaperType.RECIPE, Item.setAmount(JimItem.DOUBLE_COMPRESSED_COBBLESTONE.item, 64));
	
	public static final TopicPaper COMPRESSED_COAL = new TopicPaper(JimItem.COMPRESSED_COAL, TopicPaperType.RECIPE, Item.make(Material.COAL, 128));
	public static final TopicPaper DOUBLE_COMPRESSED_COAL = new TopicPaper(JimItem.DOUBLE_COMPRESSED_COAL, TopicPaperType.RECIPE, Item.setAmount(JimItem.COMPRESSED_COAL.item, 64));
	public static final TopicPaper TRIPLE_COMPRESSED_COAL = new TopicPaper(JimItem.TRIPLE_COMPRESSED_COAL, TopicPaperType.RECIPE, Item.setAmount(JimItem.DOUBLE_COMPRESSED_COAL.item, 32));
	
	public static final TopicPaper COMPRESSED_IRON = new TopicPaper(JimItem.COMPRESSED_IRON, TopicPaperType.RECIPE, Item.make(Material.IRON_INGOT, 64));
	public static final TopicPaper DOUBLE_COMPRESSED_IRON = new TopicPaper(JimItem.DOUBLE_COMPRESSED_IRON, TopicPaperType.RECIPE, Item.setAmount(JimItem.COMPRESSED_IRON.item, 32));
	public static final TopicPaper TRIPLE_COMPRESSED_IRON = new TopicPaper(JimItem.TRIPLE_COMPRESSED_IRON, TopicPaperType.RECIPE, Item.setAmount(JimItem.DOUBLE_COMPRESSED_IRON.item, 16));

	public static final TopicPaper COMPRESSED_GOLD = new TopicPaper(JimItem.COMPRESSED_GOLD, TopicPaperType.RECIPE, Item.make(Material.GOLD_INGOT, 64));
	public static final TopicPaper DOUBLE_COMPRESSED_GOLD = new TopicPaper(JimItem.DOUBLE_COMPRESSED_GOLD, TopicPaperType.RECIPE, Item.setAmount(JimItem.COMPRESSED_GOLD.item, 32));
	public static final TopicPaper TRIPLE_COMPRESSED_GOLD = new TopicPaper(JimItem.TRIPLE_COMPRESSED_GOLD, TopicPaperType.RECIPE, Item.setAmount(JimItem.DOUBLE_COMPRESSED_GOLD.item, 16));

	public static final TopicPaper COMPRESSED_LAPIS = new TopicPaper(JimItem.COMPRESSED_LAPIS, TopicPaperType.RECIPE, Item.make(Material.LAPIS_LAZULI, 256));
	public static final TopicPaper DOUBLE_COMPRESSED_LAPIS = new TopicPaper(JimItem.DOUBLE_COMPRESSED_LAPIS, TopicPaperType.RECIPE, Item.setAmount(JimItem.COMPRESSED_LAPIS.item, 128));
	public static final TopicPaper TRIPLE_COMPRESSED_LAPIS = new TopicPaper(JimItem.TRIPLE_COMPRESSED_LAPIS, TopicPaperType.RECIPE, Item.setAmount(JimItem.DOUBLE_COMPRESSED_LAPIS.item, 64));

	public static final TopicPaper COMPRESSED_REDSTONE = new TopicPaper(JimItem.COMPRESSED_REDSTONE, TopicPaperType.RECIPE, Item.make(Material.REDSTONE, 256));
	public static final TopicPaper DOUBLE_COMPRESSED_REDSTONE = new TopicPaper(JimItem.DOUBLE_COMPRESSED_REDSTONE, TopicPaperType.RECIPE, Item.setAmount(JimItem.COMPRESSED_REDSTONE.item, 128));
	public static final TopicPaper TRIPLE_COMPRESSED_REDSTONE = new TopicPaper(JimItem.TRIPLE_COMPRESSED_REDSTONE, TopicPaperType.RECIPE, Item.setAmount(JimItem.DOUBLE_COMPRESSED_REDSTONE.item, 64));

	public static final TopicPaper COMPRESSED_EMERALD = new TopicPaper(JimItem.COMPRESSED_EMERALD, TopicPaperType.RECIPE, Item.make(Material.EMERALD, 64));
	public static final TopicPaper DOUBLE_COMPRESSED_EMERALD = new TopicPaper(JimItem.DOUBLE_COMPRESSED_EMERALD, TopicPaperType.RECIPE, Item.setAmount(JimItem.COMPRESSED_EMERALD.item, 32));
	public static final TopicPaper TRIPLE_COMPRESSED_EMERALD = new TopicPaper(JimItem.TRIPLE_COMPRESSED_EMERALD, TopicPaperType.RECIPE, Item.setAmount(JimItem.DOUBLE_COMPRESSED_EMERALD.item, 16));

	public static final TopicPaper COMPRESSED_DIAMOND = new TopicPaper(JimItem.COMPRESSED_DIAMOND, TopicPaperType.RECIPE, Item.make(Material.DIAMOND, 32));
	public static final TopicPaper DOUBLE_COMPRESSED_DIAMOND = new TopicPaper(JimItem.DOUBLE_COMPRESSED_DIAMOND, TopicPaperType.RECIPE, Item.setAmount(JimItem.COMPRESSED_DIAMOND.item, 16));
	public static final TopicPaper TRIPLE_COMPRESSED_DIAMOND = new TopicPaper(JimItem.TRIPLE_COMPRESSED_DIAMOND, TopicPaperType.RECIPE, Item.setAmount(JimItem.DOUBLE_COMPRESSED_DIAMOND.item, 8));
	
	public static final TopicPaper COMPRESSED_OBSIDIAN = new TopicPaper(JimItem.COMPRESSED_OBSIDIAN, TopicPaperType.RECIPE, Item.make(Material.OBSIDIAN, 64));
	public static final TopicPaper DOUBLE_COMPRESSED_OBSIDIAN = new TopicPaper(JimItem.DOUBLE_COMPRESSED_OBSIDIAN, TopicPaperType.RECIPE, Item.setAmount(JimItem.COMPRESSED_OBSIDIAN.item, 32));
	public static final TopicPaper TRIPLE_COMPRESSED_OBSIDIAN = new TopicPaper(JimItem.TRIPLE_COMPRESSED_OBSIDIAN, TopicPaperType.RECIPE, Item.setAmount(JimItem.DOUBLE_COMPRESSED_OBSIDIAN.item, 16));
	
	
	
	public static final TopicPaper PORTABLE_CRAFTING_TABLE = new TopicPaper(JimItem.PORTABLE_CRAFTING_TABLE, TopicPaperType.PORTABLE, Item.make(Material.OAK_LOG, 128));
	public static final TopicPaper PORTABLE_TRASH_CAN = new TopicPaper(JimItem.PORTABLE_TRASH_CAN, TopicPaperType.PORTABLE, Item.setAmount(JimItem.COMPRESSED_IRON.item, 8));

	public static final TopicPaper MAGIC_MISSILE_WAND = new TopicPaper(JimItem.MAGIC_MISSILE_WAND, TopicPaperType.RECIPE, Item.make(Material.COBBLESTONE));
	public static final TopicPaper ZAPP_WAND = new TopicPaper(JimItem.ZAPP_WAND, TopicPaperType.RECIPE, Item.make(Material.COBBLESTONE));

}
