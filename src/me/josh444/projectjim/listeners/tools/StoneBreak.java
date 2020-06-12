package me.josh444.projectjim.listeners.tools;

import java.util.HashMap;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.items.JimItem;
import me.josh444.projectjim.utils.item.Item;
import me.josh444.projectjim.utils.item.ItemUtil;
import me.josh444.projectjim.utils.item.NBT;

public class StoneBreak implements Listener{

	public StoneBreak(ProjectJim plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onStoneBreak(BlockBreakEvent e) {
		
		Block b = e.getBlock();
		
		if(b.getType() != Material.STONE) {return;}
		
		Player p = e.getPlayer();
		ItemStack item = p.getInventory().getItemInMainHand();
		
		if(ItemUtil.isNullOrAir(item)) {return;}
		if(p.getGameMode() == GameMode.CREATIVE) {return;}
		if(item.getItemMeta().hasEnchant(Enchantment.SILK_TOUCH)) {return;}
					
		if(JimItem.STEEL_PICKAXE.isItem(item) && NBT.hasTag(item, "molten")) {
			dropMoltenLoot(item, 1D, b , e);
		} else if(JimItem.STEEL_PICKAXE.isItem(item)) {
			dropLoot(item, 1D, b , e);
		} else if(JimItem.MOLTEN_PICKAXE.isItem(item) || NBT.hasTag(item, "molten")) {
			dropMoltenLoot(item, .1D, b, e);
		} else {
			dropLoot(item, .1D, b , e);
		}
	}
	
	private static void dropLoot(ItemStack item, Double rate, Block b, BlockBreakEvent e) {
		HashMap<ItemStack, Double> lootTable = makeOreHashMap(rate);
		if(NBT.hasTag(item, "treasure find")) {lootTable = ItemUtil.addTreasureHashMap(lootTable);}
		e.setDropItems(!ItemUtil.dropLoot(b.getLocation(), lootTable));
	}
	
	private static void dropMoltenLoot(ItemStack item, Double rate, Block b, BlockBreakEvent e) {
		HashMap<ItemStack, Double> lootTable = makeMoltenOreHashMap(rate);
		if(NBT.hasTag(item, "treasure find")) {lootTable = ItemUtil.addTreasureHashMap(lootTable);}
		lootTable = ItemUtil.addRest(Item.make(Material.STONE), lootTable);
		e.setDropItems(!ItemUtil.dropLoot(b.getLocation(), lootTable));
	}
	
	public static HashMap<ItemStack, Double> makeOreHashMap(double rate) {
		HashMap<ItemStack, Double> lootTable = new HashMap<>();
		lootTable.put(JimItem.COPPER_ORE.getItem(), rate);
		lootTable.put(JimItem.LEAD_ORE.getItem(), rate);
		lootTable.put(JimItem.MAGNESIUM_ORE.getItem(), rate);
		lootTable.put(JimItem.SILVER_ORE.getItem(), rate);
		lootTable.put(JimItem.TIN_ORE.getItem(), rate);
		return lootTable;
	}
	
	public static HashMap<ItemStack, Double> makeMoltenOreHashMap(double rate) {
		HashMap<ItemStack, Double> lootTable = new HashMap<>();
		lootTable.put(JimItem.SILVER.getItem(), rate);
		lootTable.put(JimItem.COPPER.getItem(), rate);
		lootTable.put(JimItem.MAGNESIUM.getItem(), rate);
		lootTable.put(JimItem.TIN.getItem(), rate);
		lootTable.put(JimItem.LEAD.getItem(), rate);
		return lootTable;
	}
	
}
