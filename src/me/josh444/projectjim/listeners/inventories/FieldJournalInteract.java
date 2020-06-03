package me.josh444.projectjim.listeners.inventories;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.inventories.FieldJournal;
import me.josh444.projectjim.inventories.Items;
import me.josh444.projectjim.inventories.ResearchTopics;

public class FieldJournalInteract implements Listener{
	
	ResearchTopics researchTopics = new ResearchTopics();
	
	public FieldJournalInteract(ProjectJim plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
	
	@EventHandler
	public void fieldJournalClick(InventoryClickEvent e) throws IllegalArgumentException, IllegalAccessException {
		
		if (e.getClickedInventory() == null) {return;}
		
		String invName = e.getView().getTitle();
		
		if (invName.equals(FieldJournal.name)) {
			
			Player p = (Player) e.getWhoClicked();
			ItemStack item = e.getCurrentItem();
			
			if (item.equals(Items.CLOSE)) {
				e.setCancelled(true);
				p.closeInventory();
				return;
			}
			
			if (item.equals(Items.RESEARCH_TOPICS)) {
				e.setCancelled(true);
				researchTopics.openInventory(p, 0);
				return;
			}
			
			if (item.equals(Items.PORTABLE_CRAFTING_TABLE)) {
				e.setCancelled(true);
				p.openWorkbench(p.getLocation(), true);
				return;
			}
			
			e.setCancelled(true);
		}
	}
}