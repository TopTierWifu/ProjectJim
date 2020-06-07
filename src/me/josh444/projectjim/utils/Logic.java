package me.josh444.projectjim.utils;

import java.lang.reflect.Field;

import org.bukkit.inventory.ItemStack;

import me.josh444.projectjim.items.JimItem;
import me.josh444.projectjim.items.JimItems;

public class Logic {

	public static JimItem findJimItem(ItemStack item) {
		
		JimItem match = null;			
		
		for(Field f: JimItems.class.getDeclaredFields()) {
			try {
				JimItem jim = (JimItem) f.get(f.getName());
				if(item.isSimilar(jim.getItem())) {
					match = jim;
				}
			} catch (IllegalArgumentException | IllegalAccessException e1) {
				e1.printStackTrace();
			}
		}
		return match;
	}
	
}
