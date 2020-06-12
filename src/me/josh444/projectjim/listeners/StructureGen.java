package me.josh444.projectjim.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import me.josh444.projectjim.ProjectJim;

public class StructureGen implements Listener{

	public StructureGen(ProjectJim plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onHayPlace(BlockPlaceEvent e) {
		
		Block b = e.getBlock();
		
		if(b.getType() != Material.HAY_BLOCK) {return;}
		
		e.getPlayer().sendMessage("HAY");
		//Add structure generation here
		
	}
}
