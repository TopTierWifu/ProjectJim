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
import me.josh444.projectjim.utils.PlayerData;

public class ResearchTopics implements Listener {
	
	private Plugin plugin = ProjectJim.getPlugin(ProjectJim.class);
		
	public void openInventory(Player p) throws IllegalArgumentException, IllegalAccessException{		
		
		FileConfiguration config = PlayerData.getConfig(p);
		
		
		ItemStack n = null;
		ItemStack g = CustomInventory.BORDER;		
		
		Inventory i = plugin.getServer().createInventory(null, 54, ChatColor.stripColor(CustomInventory.RESEARCH_TOPICS.getItemMeta().getDisplayName()));
		
		ItemStack[] gui = new ItemStack[] {
				g,g,g,g,g,g,g,g,g,
				g,n,n,n,n,n,n,n,g,
				g,n,n,n,n,n,n,n,g,
				g,n,n,n,n,n,n,n,g,
				g,n,n,n,n,n,n,n,g,
				g,g,g,g,g,g,g,g,g,
		};
		
		i.setContents(gui);
		
		for(Field field : TopicPaper.class.getDeclaredFields()) {
			if(!(i.firstEmpty() == -1)) {
				if(field.getType().toString().equals("class me.josh444.projectjim.customitems.TopicPaper")) {
				
					TopicPaper paper = (TopicPaper) field.get(field.getName());
				
					if(!config.contains("unlocked." + paper.unlock.key)) {
						ItemStack topicPaper = TopicPaper.make(paper);
						i.addItem(topicPaper);
					}
				}
			}
		}
		
		p.openInventory(i);
	}

}