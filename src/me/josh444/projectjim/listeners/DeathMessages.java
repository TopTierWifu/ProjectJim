package me.josh444.projectjim.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.customitems.JimItem;
import me.josh444.projectjim.utils.Mana;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;

public class DeathMessages implements Listener{
	
	public DeathMessages(ProjectJim plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
	
	@EventHandler
	public void onDeathMessage(PlayerDeathEvent e) {
		String message = e.getDeathMessage();
		final ChatColor AQUA = ChatColor.AQUA;
		String nl = " \n";

		if(message.contains(JimItem.ZAPP_WAND.item.getItemMeta().getDisplayName())) {
			
			String newMessage = message.replace("slain", "zapped");
			
			String name = JimItem.ZAPP_WAND.item.getItemMeta().getDisplayName();
			String lore1 = ChatColor.GRAY + "Shoots laser in your line of sight";
			String lore2 = Mana.prefix + ChatColor.DARK_PURPLE + "50 xp";
			String hover = name + nl + lore1 + nl + lore2;
			
			ComponentBuilder builder = new ComponentBuilder("Rename");
			
			BaseComponent[] weapon = new ComponentBuilder(AQUA + "[" + JimItem.ZAPP_WAND.item.getItemMeta().getDisplayName() + AQUA + "]")
	                .event(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(hover).create()))
	                .create();

			String[] parts = newMessage.split(" ");
			for (int i=0; i<parts.length; i++) {
			    if (i == parts.length - 1) {
			    	builder.append(weapon);
			    } else {
			    	builder.append(parts[i]);
			    }
			}
			
			e.setDeathMessage(message + weapon);
		}
	}
}