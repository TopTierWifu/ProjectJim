package me.josh444.projectjim.inventories;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.items.Items;
import me.josh444.projectjim.items.JimItem;
import me.josh444.projectjim.utils.Item;
import me.josh444.projectjim.utils.PlayerData;
import me.josh444.projectjim.utils.PlayerStatsItem;

public class FieldJournal implements Listener {
	
	private Plugin plugin = ProjectJim.getPlugin(ProjectJim.class);
		
	public void openInventory(Player p){
		
		FileConfiguration config = PlayerData.getConfig(p);
		
		String[] attributes = PlayerStatsItem.attributes(p);
		
		ItemStack gl = Items.BORDER;
		ItemStack g2 = Items.NOT_UNLOCKED;
		ItemStack cl = Items.CLOSE;
		
		ItemStack ci = Items.ITEM_INDEX;
		ItemStack ps = Item.skull(p, 1, ChatColor.YELLOW + p.getDisplayName() + "'s Stats", attributes);
		ItemStack rt = Items.RESEARCH_TOPICS;
		
		Inventory i = plugin.getServer().createInventory(null, 27, ChatColor.stripColor(JimItem.FIELD_JOURNAL.item.getItemMeta().getDisplayName()));
		
		ItemStack[] gui = new ItemStack[] {
				gl,gl,gl,gl,gl,gl,gl,gl,gl,
				gl,g2,g2,gl,ps,gl,rt,ci,gl,
				gl,gl,gl,gl,cl,gl,gl,gl,gl,
		};
		
		i.setContents(gui);
		
		if(config.contains("unlocked." + JimItem.PORTABLE_CRAFTING_TABLE.key)) {
			i.setItem(11, JimItem.PORTABLE_CRAFTING_TABLE.item);
		}
		
		if(config.contains("unlocked." + JimItem.PORTABLE_TRASH_CAN.key)) {
			i.setItem(10, JimItem.PORTABLE_TRASH_CAN.item);
		}
		
		p.openInventory(i);
	}

}