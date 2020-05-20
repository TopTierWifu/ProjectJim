package me.Josh444.ProjectJim.CustomInventories;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import me.Josh444.ProjectJim.ProjectJim;
import me.Josh444.ProjectJim.Utils.Item;

public class UnansweredQuestions implements Listener {
	
	private Plugin plugin = ProjectJim.getPlugin(ProjectJim.class);
	
	public static String inventoryName = "Unanswered Questions";
		
	public void unansweredQuestionsInventory(Player p){		
		
		ItemStack n = null;
		ItemStack g = Item.make(Material.BLACK_STAINED_GLASS_PANE, 1, " ");
		ItemStack x = Item.make(Material.RED_STAINED_GLASS_PANE, 1, " ");
		ItemStack y = Item.make(Material.GREEN_STAINED_GLASS_PANE, 1, " ");
		
		Inventory i = plugin.getServer().createInventory(null, 54, inventoryName);
		
		ItemStack[] uqGUI = new ItemStack[] {
				g,g,g,g,g,g,g,g,g,
				g,n,n,n,n,n,n,n,g,
				g,n,n,n,n,n,n,n,g,
				g,n,n,n,n,n,n,n,g,
				g,n,n,n,n,n,n,n,g,
				g,g,g,g,g,g,g,g,g,
		};
		
		i.setContents(uqGUI);
		i.addItem(x);
		i.addItem(y);
		
		p.openInventory(i);
	}

}