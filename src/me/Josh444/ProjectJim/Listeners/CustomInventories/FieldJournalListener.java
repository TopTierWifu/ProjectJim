package me.Josh444.ProjectJim.Listeners.CustomInventories;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;

import me.Josh444.ProjectJim.CustomInventories.FieldJournalInventory;
import me.Josh444.ProjectJim.CustomInventories.UnansweredQuestions;

public class FieldJournalListener implements Listener{

	private UnansweredQuestions uqI = new UnansweredQuestions();
	
	@EventHandler
	public void onfjClick(InventoryClickEvent e) {
		
		Player p = (Player) e.getWhoClicked();
		InventoryView inventory = e.getView();
		String inventoryName = e.getView().getTitle();
		ItemStack item = e.getCurrentItem();

		if (e.getClickedInventory() == null) {
			return;
		}
		
		if (inventoryName.equals(FieldJournalInventory.inventoryName)) {
			
			if (item.getType().equals(Material.BARRIER)) {
				e.setCancelled(true);
				inventory.close();
				return;
			}
			
			if (item.getType().equals(Material.WRITABLE_BOOK)) {
				e.setCancelled(true);
				uqI.unansweredQuestionsInventory(p);
				return;
			}
			
			e.setCancelled(true);
		}
	}
}
