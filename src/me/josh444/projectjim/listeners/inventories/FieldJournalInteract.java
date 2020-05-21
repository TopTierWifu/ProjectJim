package me.josh444.projectjim.listeners.inventories;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.custominventories.ResearchTopics;
import me.josh444.projectjim.customitems.CustomItem;

public class FieldJournalInteract implements Listener{
	
	ResearchTopics researchTopics = new ResearchTopics();
	
	public FieldJournalInteract(ProjectJim plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
	
	@EventHandler
	public void fieldJournalClick(InventoryClickEvent e) {
		
		Player p = (Player) e.getWhoClicked();
		String inventoryName = e.getView().getTitle();
		ItemStack item = e.getCurrentItem();

		if (e.getClickedInventory() == null) {
			return;
		}
		
		if (inventoryName.equals(ChatColor.stripColor(CustomItem.FIELD_JOURNAL.getItemMeta().getDisplayName()))) {
			
			if (item.getType().equals(Material.WRITABLE_BOOK)) {
				e.setCancelled(true);
				researchTopics.openInventory(p);
				return;
			}
			
			e.setCancelled(true);
		}
	}
}