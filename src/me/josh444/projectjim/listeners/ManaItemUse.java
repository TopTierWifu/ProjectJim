package me.josh444.projectjim.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.items.JimItem;
import me.josh444.projectjim.utils.Mana;
import me.josh444.projectjim.utils.PlayerData;
import me.josh444.projectjim.utils.Spells;


public class ManaItemUse implements Listener{
	
	public ManaItemUse(ProjectJim plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
	
	@EventHandler
	public void onUse(PlayerInteractEvent e) {
		
		if(e.getAction().equals(Action.LEFT_CLICK_AIR)| e.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
		
			Player p = e.getPlayer();
		
			if(e.getItem() != null && !e.getItem().getType().equals(Material.AIR)) {
			
				if(e.getItem().hasItemMeta() && !e.getItem().equals(JimItem.FIELD_JOURNAL.item)) {
				
					ItemStack item = e.getItem();

					if(PlayerData.hasUnlock(p, item, JimItem.MAGIC_MISSILE_WAND)) {
						if(Mana.testXP(p, 50)) {
							Spells.useMagicMissile(p);
						}
					}
				
					if(PlayerData.hasUnlock(p, item, JimItem.ZAPP_WAND)) {
						if(Mana.testXP(p, 50)) {
							Spells.useZap(p);
						}
					}
					
					//Add more ifs here
				
				}
			}
		}
	}
}
