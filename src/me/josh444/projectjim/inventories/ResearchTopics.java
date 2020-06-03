package me.josh444.projectjim.inventories;

import java.lang.reflect.Field;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.items.JimItem;
import me.josh444.projectjim.items.JimItem.JimType;
import me.josh444.projectjim.items.JimItems;
import me.josh444.projectjim.utils.Item;
import me.josh444.projectjim.utils.User;

public class ResearchTopics implements Listener {
	
	private Plugin plugin = ProjectJim.getPlugin(ProjectJim.class);
		
	public static String name = ChatColor.stripColor(Items.RESEARCH_TOPICS.getItemMeta().getDisplayName());
	
	public void openInventory(Player p, int page) throws IllegalArgumentException, IllegalAccessException{		
				
		ItemStack n = null;
		ItemStack g = Items.BORDER;
		ItemStack b = Items.OAK_ARROW_DOWN;
		
		Boolean morePages = false;
		
		Inventory i = plugin.getServer().createInventory(null, 54, name);
		
		ItemStack[] gui = new ItemStack[] {
				g,g,g,g,g,g,g,g,g,
				g,n,n,n,n,n,n,n,g,
				g,n,n,n,n,n,n,n,g,
				g,n,n,n,n,n,n,n,g,
				g,n,n,n,n,n,n,n,g,
				g,g,g,g,b,g,g,g,g,
		};
		
		i.setContents(gui);
		
		Field[] fields = JimItems.class.getDeclaredFields();				
		
		//six is for the index of the first topic paper field and 28 is for the items per page. Remember to change these if TopicPaper ever changes
		for(int j = (page * 28); j < fields.length; j++) {
			if(!(i.firstEmpty() == -1)) {
				
				JimItem jim = (JimItem) fields[j].get(fields[j].getName());
				
				if(!User.hasUnlock(p, jim) && !jim.getType().equals(JimType.DEFAULT)) {
					i.addItem(jim.getPaper());
				}
				
			} else {
				morePages = true;
			}
		}
		
		if(page > 0) {
			i.setItem(47, Item.setLore(Items.OAK_ARROW_LEFT, ChatColor.GRAY + "Page " + (page)));
		}
		
		if(morePages) {
			i.setItem(51, Item.setLore(Items.OAK_ARROW_RIGHT, ChatColor.GRAY + "Page " + (page+2)));
		}
		
		
		p.openInventory(i);
	}

}