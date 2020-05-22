package me.josh444.projectjim.custominventories;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.customitems.CustomInventory;
import me.josh444.projectjim.customitems.TopicPaper;
import me.josh444.projectjim.utils.Item;

public class ResearchTopics implements Listener {
	
	private Plugin plugin = ProjectJim.getPlugin(ProjectJim.class);
		
	public void openInventory(Player p){		
		
		ItemStack n = null;
		ItemStack g = CustomInventory.BORDER;
		
		ItemStack a = Item.skull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTA5Y2RlMWFmYzk1YTQ3NGQyMjI1NTQwOTdlZDZkMzkxZTdjYzdhZTFmMjAyZmRiZmQyZDZkYmM5ODMwOTM3MCJ9fX0=", 1);
		ItemStack b = Item.skull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjBlMzI3ODViOGU3ZWZhOTUyOWUzNTg2MGE4NTBlNmFkNzQzMGQ3NGFjNGEwNzBkZTgzMDczN2RhNDA5MmYyMCJ9fX0=", 1);
		ItemStack c = TopicPaper.make(TopicPaper.COMPRESSED_COBBLESTONE);
		
		
		Inventory i = plugin.getServer().createInventory(null, 54, ChatColor.stripColor(CustomInventory.RESEARCH_TOPICS.getItemMeta().getDisplayName()));
		
		ItemStack[] gui = new ItemStack[] {
				g,g,g,g,g,g,g,g,g,
				g,a,b,c,n,n,n,n,g,
				g,n,n,n,n,n,n,n,g,
				g,n,n,n,n,n,n,n,g,
				g,n,n,n,n,n,n,n,g,
				g,g,g,g,g,g,g,g,g,
		};
		
		i.setContents(gui);
		
		p.openInventory(i);
	}

}