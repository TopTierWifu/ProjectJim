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
import me.josh444.projectjim.inventories.FieldJournal;
import me.josh444.projectjim.inventories.Items;
import me.josh444.projectjim.inventories.ResearchTopics;
import me.josh444.projectjim.items.JimItem;
import me.josh444.projectjim.items.JimItem.JimType;
import me.josh444.projectjim.items.JimItems;
import me.josh444.projectjim.utils.Item;
import me.josh444.projectjim.utils.User;

public class ResearchTopicInteract implements Listener{

	private JavaPlugin plugin = ProjectJim.getPlugin(ProjectJim.class);

	ResearchTopics researchTopics = new ResearchTopics();
	FieldJournal fieldJournal = new FieldJournal();
	
	public ResearchTopicInteract(ProjectJim plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
	
	@EventHandler
	public void researchTopicClick(InventoryClickEvent e) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		if (e.getClickedInventory() == null) {return;}
		
		String invName = e.getView().getTitle();

		if (invName.equals(ResearchTopics.name)) {
			
			Player p = (Player) e.getWhoClicked();
			ItemStack item = e.getCurrentItem();
			
			if(Item.isNullOrAir(item)) {return;}
			
			if (item.getType().equals(Material.PAPER)) {
				e.setCancelled(true);
				
				for(Field field : JimItems.class.getDeclaredFields()) {
						
						JimItem jim = (JimItem) field.get(field.getName());
						
						if(Item.getName(item).equals(jim.getName())) {
						
							int price = 0;
							
							for(int i = 0; i < jim.getCost().length; i++) {
								ItemStack cost = jim.getCost()[i];
								String name = Item.getName(cost);
								if(p.getInventory().containsAtLeast(cost, cost.getAmount())) {
									price++;
								} else {
									p.sendMessage(ChatColor.RED + "You do not have " + cost.getAmount() + " " + name);
								}
									
							}
							
							if(jim.getCost().length == price) {
								
								FileConfiguration config = User.getConfig(p);
								File file = User.getFile(p);
								
								p.getInventory().removeItem(jim.getCost());			
								p.sendMessage(ChatColor.GREEN + "Unlocked " + jim.getName());
								e.getClickedInventory().setItem(e.getSlot(), null);
								
								config.set("unlocked." + jim.getKey(), 1);
								User.saveConfig(config, file);
								
								if(jim.getType().equals(JimType.RECIPE)) {
									p.discoverRecipe(new NamespacedKey(plugin, jim.getKey()));
								} else if(jim.getType().equals(JimType.PORTABLE)) {
									
								}
								
							}
						}
				}
				
				return;
			}
			
			if (item.equals(Items.OAK_ARROW_DOWN)) {
				e.setCancelled(true);
				fieldJournal.openInventory(p);
				return;
			}
			
			if (item.equals(Items.OAK_ARROW_LEFT) | item.equals(Items.OAK_ARROW_RIGHT)) {
				e.setCancelled(true);
				int page = Integer.parseInt(item.getItemMeta().getLore().toArray()[0].toString().substring(7)) - 1;
				researchTopics.openInventory(p, page);
				return;
			}
			
			e.setCancelled(true);
		}
	}
	
}
