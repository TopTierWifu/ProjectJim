package me.josh444.projectjim.utils.item;

import org.bukkit.craftbukkit.v1_15_R1.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

import net.minecraft.server.v1_15_R1.NBTTagCompound;

public class NBT {
	
	public static ItemStack addString(ItemStack item, String tag, String value) {
		net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
		NBTTagCompound t = stack.getOrCreateTag();
		t.setString(tag, value);
		stack.setTag(t);
		return CraftItemStack.asBukkitCopy(stack);
	}
	
	public static ItemStack addBoolean(ItemStack item, String tag, boolean value) {
		net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
		NBTTagCompound t = stack.getOrCreateTag();
		t.setBoolean(tag, value);
		stack.setTag(t);
		return CraftItemStack.asBukkitCopy(stack);
	}
	
	public static String getString(ItemStack item, String tag) {
		net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
		NBTTagCompound t = stack.getOrCreateTag();
		if(t.hasKey(tag)) {return t.getString(tag);}
		return null;
	}
	
	public static Boolean getBoolean(ItemStack item, String tag) {
		net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
		NBTTagCompound t = stack.getOrCreateTag();
		if(t.hasKey(tag)) {return t.getBoolean(tag);}
		return null;
	}
	
	public static boolean hasTag(ItemStack item, String tag) {
		net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
		NBTTagCompound t = stack.getOrCreateTag();
		return t.hasKey(tag);
	}
	
}
