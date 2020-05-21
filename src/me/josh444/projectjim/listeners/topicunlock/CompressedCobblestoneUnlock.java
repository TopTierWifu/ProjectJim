package me.josh444.projectjim.listeners.topicunlock;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.customitems.CustomItem;

public class CompressedCobblestoneUnlock implements Listener{

	private JavaPlugin plugin = ProjectJim.getPlugin(ProjectJim.class);
	
	public CompressedCobblestoneUnlock(ProjectJim plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
	
	@EventHandler
	public void unlock(PlayerInteractEvent e) {
		
		Player p = e.getPlayer();
		Block b = e.getClickedBlock();
		
		if(b.getType().equals(Material.LAPIS_ORE)) {
			p.discoverRecipe(new NamespacedKey(plugin, CustomItem.COMPRESSED_COBBLESTONE.getType().name().toString()));
		}
	}
}
