package me.josh444.projectjim.inventories;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.items.JimItems;
import me.josh444.projectjim.utils.Item;
import me.josh444.projectjim.utils.User;

public class FieldJournal implements Listener {
	
	private Plugin plugin = ProjectJim.getPlugin(ProjectJim.class);
	
	public static String name = ChatColor.stripColor(JimItems.FIELD_JOURNAL.getName());
		
	public void openInventory(Player p){
		
		String[] attributes = User.attributes(p);
		
		ItemStack gl = Items.BORDER;
		ItemStack g2 = Items.NOT_UNLOCKED;
		ItemStack cl = Items.CLOSE;
		
		ItemStack ci = Items.ITEM_INDEX;
		ItemStack ps = Item.skull(p, 1, ChatColor.YELLOW + p.getDisplayName() + "'s Stats", attributes);
		ItemStack rt = Items.RESEARCH_TOPICS;
		
		Inventory i = plugin.getServer().createInventory(null, 27, name);
		
		ItemStack[] gui = new ItemStack[] {
				gl,gl,gl,gl,gl,gl,gl,gl,gl,
				gl,g2,g2,gl,ps,gl,rt,ci,gl,
				gl,gl,gl,gl,cl,gl,gl,gl,gl,
		};
		
		i.setContents(gui);
		
		if(User.hasUnlock(p, JimItems.PORTABLE_CRAFTING_TABLE)) {
			i.setItem(11, JimItems.PORTABLE_CRAFTING_TABLE.getItem());
		}
		
		if(User.hasUnlock(p, JimItems.PORTABLE_TRASH_CAN)) {
			i.setItem(10, JimItems.PORTABLE_TRASH_CAN.getItem());
		}
		
		p.openInventory(i);
	}

}