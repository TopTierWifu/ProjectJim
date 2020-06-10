package me.josh444.projectjim.listeners.tools;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.items.JimItems;
import me.josh444.projectjim.utils.item.ItemUtil;

public class SteelPickaxe implements Listener{

	public SteelPickaxe(ProjectJim plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onSteelPickaxeUse(BlockBreakEvent e) {
		
		Block b = e.getBlock();
		
		if(b.getType() == Material.STONE) {
			
			int r = new Random().nextInt(1000);
			Player p = e.getPlayer();
			World w = p.getWorld();
			ItemStack item = p.getInventory().getItemInMainHand();
			
			if(JimItems.STEEL_PICKAXE.isItem(item)) {
				
				if(r >= 970) {
					e.setDropItems(false);
					ItemUtil.dropItem(w, b, JimItems.COPPER_ORE.getItem());
				} else if (r >= 940) {
					e.setDropItems(false);
					ItemUtil.dropItem(w, b, JimItems.LEAD_ORE.getItem());	
				} else if (r >= 910) {
					e.setDropItems(false);
					ItemUtil.dropItem(w, b, JimItems.MAGNESIUM_ORE.getItem());
				} else if (r >= 880) {
					e.setDropItems(false);
					ItemUtil.dropItem(w, b, JimItems.COPPER_ORE.getItem());
				} else if (r >= 850) {
					e.setDropItems(false);
					ItemUtil.dropItem(w, b, JimItems.TIN_ORE.getItem());
				}
				
			} else {
				if(r >= 997) {
					e.setDropItems(false);
					ItemUtil.dropItem(w, b, JimItems.COPPER_ORE.getItem());
				} else if (r >= 994) {
					e.setDropItems(false);
					ItemUtil.dropItem(w, b, JimItems.LEAD_ORE.getItem());	
				} else if (r >= 991) {
					e.setDropItems(false);
					ItemUtil.dropItem(w, b, JimItems.MAGNESIUM_ORE.getItem());
				} else if (r >= 988) {
					e.setDropItems(false);
					ItemUtil.dropItem(w, b, JimItems.COPPER_ORE.getItem());
				} else if (r >= 985) {
					e.setDropItems(false);
					ItemUtil.dropItem(w, b, JimItems.TIN_ORE.getItem());
				}
			}
			
		}
		
	}
}
