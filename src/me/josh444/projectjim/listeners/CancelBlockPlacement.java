package me.josh444.projectjim.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.items.JimItem;
import me.josh444.projectjim.utils.item.ItemUtil;

public class CancelBlockPlacement implements Listener{

	public CancelBlockPlacement(ProjectJim plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onJimPlace(BlockPlaceEvent e) {
		
		ItemStack item = e.getItemInHand();
		
		if(ItemUtil.isNullOrAir(item)) {return;}
		
		if(JimItem.isJim(item)) {
			e.setCancelled(true);
			e.getPlayer().sendMessage("You cannot place " + ItemUtil.getName(item));
		}
	}
	
}
