package me.josh444.projectjim.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.custominventories.FieldJournal;
import me.josh444.projectjim.customitems.CustomItem;

public class OpenFieldJournal implements Listener{
	
	FieldJournal fieldJournal = new FieldJournal();
	
	public OpenFieldJournal(ProjectJim plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
	
	@EventHandler
	public void openFieldJournal(PlayerInteractEvent e) {
		
		Player p = e.getPlayer();
		String itemName = e.getItem().getItemMeta().getDisplayName();
		
		if(itemName.equals(CustomItem.FIELD_JOURNAL.getItemMeta().getDisplayName())) {
			e.setCancelled(true);
			fieldJournal.openInventory(p);
		}
		
		
	}
}