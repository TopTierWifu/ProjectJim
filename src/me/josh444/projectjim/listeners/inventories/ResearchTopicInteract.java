package me.josh444.projectjim.listeners.inventories;

import java.lang.reflect.Field;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.customitems.CustomInventory;
import me.josh444.projectjim.customitems.TopicPaper;

public class ResearchTopicInteract implements Listener{

	public ResearchTopicInteract(ProjectJim plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
	
	@EventHandler
	public void researchTopicClick(InventoryClickEvent e) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Player p = (Player) e.getWhoClicked();
		String inventoryName = e.getView().getTitle();
		ItemStack item = e.getCurrentItem();

		if (e.getClickedInventory() == null) {
			return;
		}
		
		if (inventoryName.equals(ChatColor.stripColor(CustomInventory.RESEARCH_TOPICS.getItemMeta().getDisplayName()))) {
			
			if (item.getType().equals(Material.PAPER)) {
				e.setCancelled(true);
				
				//TopicPaper paper = null;
				
				String topicPapers = "class me.josh444.projectjim.customitems.TopicPaper";
				
				for(Field field : TopicPaper.class.getDeclaredFields()) {
					if(field.getType().toString().equals(topicPapers)) {
						Field f = TopicPaper.class.getDeclaredField(field.getName());
						TopicPaper t = (TopicPaper) field.get(f);
						
						if(item.getItemMeta().getDisplayName().equals(t.name)) {
						
							p.getInventory().addItem(TopicPaper.make(t));
						
						}
					}
				}
				
				return;
			}
			
			e.setCancelled(true);
		}
	}
	
}
