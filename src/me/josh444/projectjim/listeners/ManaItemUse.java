package me.josh444.projectjim.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.customitems.JimItem;
import me.josh444.projectjim.utils.Mana;
import me.josh444.projectjim.utils.PlayerData;
import me.josh444.projectjim.utils.Spells;


public class ManaItemUse implements Listener{
	
	public ManaItemUse(ProjectJim plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
	
	@EventHandler
	public void onUse(PlayerInteractEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getItem() != null && !e.getItem().getType().equals(Material.AIR)) {
			
			if(e.getItem().hasItemMeta()) {
				
				String itemName = e.getItem().getItemMeta().getDisplayName();

				if(PlayerData.hasUnlock(p, itemName, JimItem.MAGIC_MISSILE_WAND)) {
					if(Mana.testXP(p, 50)) {
						Spells.useMagicMissile(p);
					}
				}
				
				//Add more ifs here
				
			}
		}
	}
}
