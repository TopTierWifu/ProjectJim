package me.josh444.projectjim.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.items.JimItems;
import me.josh444.projectjim.utils.Item;
import me.josh444.projectjim.utils.Mana;
import me.josh444.projectjim.utils.Spell;
import me.josh444.projectjim.utils.User;


public class ManaItemUse implements Listener{
	
	public ManaItemUse(ProjectJim plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
	
	@EventHandler
	public void onUse(PlayerInteractEvent e) {
		
		if(User.isLeftClick(e)) {
			
			Player p = e.getPlayer();
		
			ItemStack item = e.getItem();
			
			if(!Item.isNullOrAir(item)) {				

					if(User.hasUnlock(p, JimItems.MAGIC_MISSILE_WAND, item)) {
						if(Mana.testXP(p, 50)) {
							Spell.useMagicMissile(p);
						}
					}
				
					if(User.hasUnlock(p, JimItems.ZAPP_WAND, item)) {
						if(Mana.testXP(p, 50)) {
							Spell.useZap(p);
						}
					}
					
					//Add more ifs here
			}
		}
	}
}
