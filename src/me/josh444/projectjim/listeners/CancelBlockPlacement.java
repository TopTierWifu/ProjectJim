package me.josh444.projectjim.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.items.JimItem;
import me.josh444.projectjim.items.JimItem.Type;
import me.josh444.projectjim.utils.item.ItemUtil;

public class CancelBlockPlacement implements Listener{

	public CancelBlockPlacement(ProjectJim plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onJimPlace(BlockPlaceEvent e) {
		
		JimItem jim = ItemUtil.findJimItem(e.getItemInHand());
		
		if(jim != null) {
			
			Type t = jim.getType();
			if(t == Type.COMPRESSED || t == Type.ORE) {
				e.setCancelled(true);
				e.getPlayer().sendMessage("You cannot place " + jim.getName());
			}
		}
	}
	
}
