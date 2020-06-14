package me.josh444.projectjim.listeners;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.items.JimItem;
import me.josh444.projectjim.utils.LootTable;
import me.josh444.projectjim.utils.item.ItemUtil;
import me.josh444.projectjim.utils.item.Skull;
import me.josh444.projectjim.utils.item.Texture;

public class MobDrops implements Listener{

	public MobDrops(ProjectJim plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onWitchDeath(EntityDeathEvent e) {
		if(e.getEntityType() == EntityType.WITCH) {
			LootTable lootTable = new LootTable(); lootTable.addDrop(JimItem.MAGIC_DUST.getItem(), 25D);
			ItemUtil.dropLoot(e.getEntity().getLocation(), lootTable);
		}
		if(e.getEntityType() == EntityType.SQUID) {
			ItemUtil.dropItem(e.getEntity().getLocation(), Skull.make(Texture.MONITOR, 1));
			ItemUtil.dropItem(e.getEntity().getLocation(), Skull.make(Texture.HELMET, 1));
		}
	}
}
