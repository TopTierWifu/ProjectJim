package me.josh444.projectjim.custominventories;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.customitems.CustomInventory;
import me.josh444.projectjim.customitems.JimItem;
import me.josh444.projectjim.utils.Item;
import me.josh444.projectjim.utils.PlayerStats;

public class FieldJournal implements Listener {
	
	private Plugin plugin = ProjectJim.getPlugin(ProjectJim.class);
		
	public void openInventory(Player p){
		
		String[] attributes = PlayerStats.attributes(p);
		
		ItemStack gl = CustomInventory.BORDER;
		ItemStack g2 = CustomInventory.NOT_UNLOCKED;
		
		ItemStack ci = CustomInventory.CRAFTING_INDEX;
		ItemStack rm = CustomInventory.RESEARCH_MATERIALS;
		ItemStack ps = Item.skull(p, 1, ChatColor.YELLOW + p.getDisplayName() + "'s Stats", attributes);
		ItemStack cd = CustomInventory.COLLECTED_DATA;
		ItemStack rt = CustomInventory.RESEARCH_TOPICS;
		
		Inventory i = plugin.getServer().createInventory(null, 54, ChatColor.stripColor(JimItem.FIELD_JOURNAL.item.getItemMeta().getDisplayName()));
		
		ItemStack[] gui = new ItemStack[] {
				gl,gl,gl,gl,gl,gl,gl,gl,gl,
				gl,gl,ci,rm,ps,cd,rt,gl,gl,
				gl,gl,gl,gl,gl,gl,gl,gl,gl,
				gl,gl,g2,g2,g2,g2,g2,gl,gl,
                gl,gl,gl,g2,g2,g2,gl,gl,gl,
				gl,gl,gl,gl,gl,gl,gl,gl,gl
		};
		
		//gl,gl,et,an,ct,ec,gs,gl,gl,
		//gl,gl,gl,ca,st,lm,gl,gl,gl,
		
		i.setContents(gui);
		
		p.openInventory(i);
	}

}