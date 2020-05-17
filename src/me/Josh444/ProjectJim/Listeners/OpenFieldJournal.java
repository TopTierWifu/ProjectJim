package me.Josh444.ProjectJim.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import me.Josh444.ProjectJim.CustomInventories.FieldJournalInventory;

public class OpenFieldJournal implements Listener{
	
	FieldJournalInventory fJI = new FieldJournalInventory();
	
	@EventHandler
	public void openFieldJournal(PlayerInteractEvent e) {
		
		Player p = e.getPlayer();
		String itemName = e.getItem().getItemMeta().getDisplayName();
		
		if(itemName.equals(ChatColor.DARK_PURPLE + "Field Journal")) {
			e.setCancelled(true);
			fJI.fieldJournalInventory(p);
		}
		
	}
}