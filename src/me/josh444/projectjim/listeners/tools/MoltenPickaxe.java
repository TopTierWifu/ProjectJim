package me.josh444.projectjim.listeners.tools;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
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

public class MoltenPickaxe implements Listener{

	public MoltenPickaxe(ProjectJim plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onMoltenPickaxeUse(BlockBreakEvent e) {
		
		Player p = e.getPlayer();
		ItemStack item = p.getInventory().getItemInMainHand();
		
		if(ItemUtil.isNullOrAir(item)) {return;}
		if(!JimItem.MOLTEN_PICKAXE.isItem(item) && !NBT.hasTag(item, "molten")) {return;}
		if(p.getGameMode() == GameMode.CREATIVE) {return;}
		
		Block b = e.getBlock();
		Material t = b.getType();
		
		switch(t) {
		  case COBBLESTONE:
			  dropLoot(Material.STONE, b, e);
			  break;
		  case IRON_ORE:
			  dropLoot(Material.IRON_INGOT, b, e);
		    break;
		  case GOLD_ORE:
			  dropLoot(Material.GOLD_INGOT, b, e);
			    break;
		  case SAND:
			  dropLoot(Material.GLASS, b, e);
			    break;
		  case OAK_LOG:
			  dropLoot(Material.CHARCOAL, b, e);
			    break;
		  case BIRCH_LOG:
			  dropLoot(Material.CHARCOAL, b, e);
			    break;
		  case SPRUCE_LOG:
			  dropLoot(Material.CHARCOAL, b, e);
			    break;
		  case DARK_OAK_LOG:
			  dropLoot(Material.CHARCOAL, b, e);
			    break;
		  case ACACIA_LOG:
			  dropLoot(Material.CHARCOAL, b, e);
			    break;
		  case JUNGLE_LOG:
			  dropLoot(Material.CHARCOAL, b, e);
			    break;
		  case CACTUS:
			  dropLoot(Material.GREEN_DYE, b, e);
			    break;
		  case NETHERRACK:
			  dropLoot(Material.NETHER_BRICK, b, e);
			    break;
		  case CLAY:
			  dropLoot(Material.TERRACOTTA, b, e);
			    break;
		  default:  
		}
		
	}
	
	private static void dropLoot(Material m, Block b, BlockBreakEvent e) {
		e.setDropItems(!ItemUtil.dropItem(b.getLocation(), Item.make(m)));
	}

}
