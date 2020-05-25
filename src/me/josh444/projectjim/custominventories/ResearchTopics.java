package me.josh444.projectjim.custominventories;

import java.lang.reflect.Field;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.customitems.CustomInventory;
import me.josh444.projectjim.customitems.TopicPaper;
import me.josh444.projectjim.utils.Item;
import me.josh444.projectjim.utils.PlayerData;

public class ResearchTopics implements Listener {
	
	private Plugin plugin = ProjectJim.getPlugin(ProjectJim.class);
		
	public void openInventory(Player p, int page) throws IllegalArgumentException, IllegalAccessException{		
		
		FileConfiguration config = PlayerData.getConfig(p);
		
		ItemStack n = null;
		ItemStack g = CustomInventory.BORDER;
		ItemStack b = CustomInventory.OAK_ARROW_DOWN;
		
		Boolean morePages = false;
		
		Inventory i = plugin.getServer().createInventory(null, 54, ChatColor.stripColor(CustomInventory.RESEARCH_TOPICS.getItemMeta().getDisplayName()));
		
		ItemStack[] gui = new ItemStack[] {
				g,g,g,g,g,g,g,g,g,
				g,n,n,n,n,n,n,n,g,
				g,n,n,n,n,n,n,n,g,
				g,n,n,n,n,n,n,n,g,
				g,n,n,n,n,n,n,n,g,
				g,g,g,g,b,g,g,g,g,
		};
		
		i.setContents(gui);
		
		
		//six is for the index of the first topic paper field and 28 is for the items per page. Remember to change these if TopicPaper ever changes
		for(int j = 6 + (page * 28); j < TopicPaper.class.getDeclaredFields().length; j++) {
			if(!(i.firstEmpty() == -1)) {
				
				Field[] field = TopicPaper.class.getDeclaredFields();				
				TopicPaper paper = (TopicPaper) field[j].get(field[j].getName());
				
				if(config.contains("inprogress." + paper.unlock.key)) {
					ItemStack topicPaper = TopicPaper.make(paper);
					i.addItem(topicPaper);
				}
				
			} else {
				morePages = true;
			}
		}
		
		if(page > 0) {
			i.setItem(47, Item.setLore(CustomInventory.OAK_ARROW_LEFT, ChatColor.GRAY + "Page " + (page)));
		}
		
		if(morePages) {
			i.setItem(51, Item.setLore(CustomInventory.OAK_ARROW_RIGHT, ChatColor.GRAY + "Page " + (page+2)));
		}
		
		
		p.openInventory(i);
	}

}