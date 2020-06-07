package me.josh444.projectjim.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.inventories.FieldJournal;
import me.josh444.projectjim.items.JimItems;
import me.josh444.projectjim.utils.Item;

public class OpenFieldJournal implements Listener{
	
	FieldJournal fieldJournal = new FieldJournal();
	
	public OpenFieldJournal(ProjectJim plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
	
	@EventHandler
	public void openFieldJournal(PlayerInteractEvent e) {
		
		Player p = e.getPlayer();
		ItemStack item = e.getItem();
		
		if(!Item.isNullOrAir(item)) {
			
			String itemName = Item.getName(item);
		
			if(itemName.equals(JimItems.FIELD_JOURNAL.getName())) {
				e.setCancelled(true);
				fieldJournal.openInventory(p);
			}
		}
	}
}