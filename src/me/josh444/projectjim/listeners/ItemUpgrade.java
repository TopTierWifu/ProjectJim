package me.josh444.projectjim.listeners;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.items.JimItem;
import me.josh444.projectjim.utils.Upgrade;
import me.josh444.projectjim.utils.item.ItemUtil;
import me.josh444.projectjim.utils.item.NBT;

public class ItemUpgrade implements Listener{

	public ItemUpgrade(ProjectJim plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onItemUpgrade(InventoryClickEvent e) {
		
		ItemStack upgrade = e.getCursor();
		ItemStack pickaxe = e.getCurrentItem();
		Player p = (Player) e.getWhoClicked();
		
		if(e.getClickedInventory() == null) {return;}
		if(ItemUtil.isNullOrAir(upgrade)) {return;}
		if(!ItemUtil.isPickaxe(pickaxe)) {return;}		
		
		if(addUpgrade(p, upgrade, JimItem.MOLTEN_CORE, pickaxe, e, Upgrade.MOLTEN)) {return;}
		if(addUpgrade(p, upgrade, JimItem.TREASURE_CORE, pickaxe, e, Upgrade.TREASURE)) {return;}

	}
	
	private static ItemStack addUpgradeLore(ItemStack item, Upgrade u) {
		List<String> newLore = new ArrayList<String>();
		List<String> itemLore = item.getItemMeta().getLore();
		
		if(item.hasItemMeta()) {
			if(item.getItemMeta().hasLore()) {
				itemLore.remove(0);
			}
		}
		newLore.add("");
		newLore.add(u.getLore());
		
		if(item.hasItemMeta()) {
			if(item.getItemMeta().hasLore()) {
				if(!NBT.hasTag(item, "upgrade")) {
					newLore.add("");
				}
				for(String s: itemLore) {
					newLore.add(s);
				}
			}
		}
		return ItemUtil.setLore(item, newLore);
	}
		
	private static boolean addUpgrade(Player p, ItemStack upgrade, JimItem jim, ItemStack item, InventoryClickEvent e, Upgrade u) {
		if(jim.isItem(upgrade)) {
			if(p.getGameMode() == GameMode.CREATIVE) {p.sendMessage(ChatColor.RED + "You must be in survival to upgrade an item"); return false;}
			if(NBT.hasTag(item, u.getKey())) {
				p.sendMessage(ChatColor.RED + "You already have " + ChatColor.RESET + u.getLore() + ChatColor.RED + " on this item");
				return false;
			} else if(upgrade.getAmount() != 1) {
				p.sendMessage(ChatColor.RED + "Unstack the upgrade before upgrading");
				return false;
			}
			ItemStack newItem = NBT.addBoolean(NBT.addBoolean(addUpgradeLore(item, u), u.getKey(), true), "upgrade", true);
			e.setCurrentItem(newItem);
			p.setItemOnCursor(null);
			p.sendMessage(ChatColor.GREEN + "Successfully added " + ChatColor.RESET + u.getLore());
			return true;
		}
		return false;
	}
	
}
