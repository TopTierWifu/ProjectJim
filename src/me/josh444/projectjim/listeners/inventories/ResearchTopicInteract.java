package me.josh444.projectjim.listeners.inventories;

import java.io.File;
import java.lang.reflect.Field;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.customitems.CustomInventory;
import me.josh444.projectjim.customitems.TopicPaper;
import me.josh444.projectjim.utils.PlayerData;
import me.josh444.projectjim.utils.Word;

public class ResearchTopicInteract implements Listener{

	private JavaPlugin plugin = ProjectJim.getPlugin(ProjectJim.class);
	
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
												
				for(Field field : TopicPaper.class.getDeclaredFields()) {
					if(field.getType().toString().equals("class me.josh444.projectjim.customitems.TopicPaper")) {
						
						TopicPaper paper = (TopicPaper) field.get(field.getName());
						
						if(item.getItemMeta().getDisplayName().equals(paper.name)) {
						
							int price = 0;
							
							for(int i = 0; i < paper.cost.length; i++) {
								
								String name = (paper.cost[i].hasItemMeta()) ?  paper.cost[i].getItemMeta().getDisplayName() : Word.toTitleCase(paper.cost[i].getType().name());

								if(p.getInventory().containsAtLeast(paper.cost[i], paper.cost[i].getAmount())) {
									price++;
								} else {
									p.sendMessage(ChatColor.RED + "You do not have " + paper.cost[i].getAmount() + " " + name);
								}
									
							}
							
							if(paper.cost.length == price) {
								
								FileConfiguration config = PlayerData.getConfig(p);
								File file = PlayerData.getFile(p);
								
								p.getInventory().removeItem(paper.cost);
								p.discoverRecipe(new NamespacedKey(plugin, paper.unlock.key));
								p.sendMessage(ChatColor.GREEN + "Unlocked " + paper.unlock.item.getItemMeta().getDisplayName());
								e.getClickedInventory().setItem(e.getSlot(), null);
								
								config.set("unlocked." + paper.unlock.key, 1);
								PlayerData.saveConfig(config, file);
							}
						}
					}
				}
				
				return;
			}
			
			e.setCancelled(true);
		}
	}
	
}
