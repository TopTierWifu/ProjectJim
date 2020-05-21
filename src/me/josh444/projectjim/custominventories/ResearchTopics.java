package me.josh444.projectjim.custominventories;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.customitems.CustomInventory;

public class ResearchTopics implements Listener {
	
	private Plugin plugin = ProjectJim.getPlugin(ProjectJim.class);
		
	public void openInventory(Player p){		
		
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
		
		p.openInventory(i);
	}

}