package me.josh444.projectjim.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.inventories.FieldJournal;
import me.josh444.projectjim.items.JimItem;

public class OpenFieldJournal implements Listener{
	
	FieldJournal fieldJournal = new FieldJournal();
	
	public OpenFieldJournal(ProjectJim plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
	
	@EventHandler
	public void openFieldJournal(PlayerInteractEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getItem() != null && !e.getItem().getType().equals(Material.AIR)) {
		
		if(e.getItem().hasItemMeta()) {
			
			String itemName = e.getItem().getItemMeta().getDisplayName();
		
			if(itemName.equals(JimItem.FIELD_JOURNAL.item.getItemMeta().getDisplayName())) {
				e.setCancelled(true);
				fieldJournal.openInventory(p);
				
			}
		}}
		
	}
}