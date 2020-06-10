package me.josh444.projectjim.listeners.tools;

import java.util.HashMap;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.items.JimItem;
import me.josh444.projectjim.utils.item.ItemUtil;

public class SteelPickaxe implements Listener{

	public SteelPickaxe(ProjectJim plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onSteelPickaxeUse(BlockBreakEvent e) {
		
		Block b = e.getBlock();
		
		if(b.getType() != Material.STONE) {return;}
		
		Player p = e.getPlayer();
		ItemStack item = p.getInventory().getItemInMainHand();
		
		if(p.getGameMode() == GameMode.CREATIVE) {return;}
		if(item.getItemMeta().hasEnchant(Enchantment.SILK_TOUCH)) {return;}
		
		World w = p.getWorld();
			
		if(JimItem.STEEL_PICKAXE.isItem(item)) {
			HashMap<ItemStack, Double> lootTable = new HashMap<>();
			lootTable.put(JimItem.COPPER_ORE.getItem(), 3D);
			lootTable.put(JimItem.LEAD_ORE.getItem(), 3D);
			lootTable.put(JimItem.MAGNESIUM_ORE.getItem(), 3D);
			lootTable.put(JimItem.SILVER_ORE.getItem(), 3D);
			lootTable.put(JimItem.TIN_ORE.getItem(), 3D);
			e.setDropItems(!ItemUtil.dropLoot(w, b, lootTable));
		} else {
			HashMap<ItemStack, Double> lootTable = new HashMap<>();
			lootTable.put(JimItem.COPPER_ORE.getItem(), .3D);
			lootTable.put(JimItem.LEAD_ORE.getItem(), .3D);
			lootTable.put(JimItem.MAGNESIUM_ORE.getItem(), .3D);
			lootTable.put(JimItem.SILVER_ORE.getItem(), .3D);
			lootTable.put(JimItem.TIN_ORE.getItem(), .3D);
			e.setDropItems(!ItemUtil.dropLoot(w, b, lootTable));
		}
		
		
	}
}
