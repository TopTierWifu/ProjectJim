package me.josh444.projectjim;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.GameRule;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

import me.josh444.projectjim.customitems.JimItem;
import me.josh444.projectjim.customrecipes.Compress;
import me.josh444.projectjim.customrecipes.FieldJournal;
import me.josh444.projectjim.customrecipes.MagicMissileWand;
import me.josh444.projectjim.customrecipes.ZappWand;
import me.josh444.projectjim.listeners.DeathMessages;
import me.josh444.projectjim.listeners.ManaItemUse;
import me.josh444.projectjim.listeners.OpenFieldJournal;
import me.josh444.projectjim.listeners.PlayerSetup;
import me.josh444.projectjim.listeners.inventories.FieldJournalInteract;
import me.josh444.projectjim.listeners.inventories.ResearchTopicInteract;
import me.josh444.projectjim.utils.Item;

public class ProjectJim extends JavaPlugin{
	
	public static String prefix = ChatColor.GREEN + "Project Jim " + ChatColor.GRAY + "> " + ChatColor.WHITE;
	
	public void onEnable() {
		
		setupConfig();
		
		registerEvents();
		
		loadCustomRecipes();
		
		//Enabling limited crafting so custom recipes may work properly in recipe book
		getServer().getWorld("world").setGameRule(GameRule.DO_LIMITED_CRAFTING, true);
		
		//Enable message
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Project Jim has been enabled");
	}
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "Project Jim has been disabled");
	}
	
	
	public void loadCustomRecipes() {
		Compress compress = new Compress();
		
		compress.addCompressRecipe(JimItem.COMPRESSED_COBBLESTONE, Item.make(Material.COBBLESTONE));
		compress.addCompressRecipe(JimItem.DOUBLE_COMPRESSED_COBBLESTONE, JimItem.COMPRESSED_COBBLESTONE.item);
		compress.addCompressRecipe(JimItem.TRIPLE_COMPRESSED_COBBLESTONE, JimItem.DOUBLE_COMPRESSED_COBBLESTONE.item);
		
		compress.addCompressRecipe(JimItem.COMPRESSED_COAL, Item.make(Material.COAL));
		compress.addCompressRecipe(JimItem.DOUBLE_COMPRESSED_COAL, JimItem.COMPRESSED_COAL.item);
		compress.addCompressRecipe(JimItem.TRIPLE_COMPRESSED_COAL, JimItem.DOUBLE_COMPRESSED_COAL.item);
		
		compress.addCompressRecipe(JimItem.COMPRESSED_IRON, Item.make(Material.IRON_INGOT));
		compress.addCompressRecipe(JimItem.DOUBLE_COMPRESSED_IRON, JimItem.COMPRESSED_IRON.item);
		compress.addCompressRecipe(JimItem.TRIPLE_COMPRESSED_IRON, JimItem.DOUBLE_COMPRESSED_IRON.item);

		compress.addCompressRecipe(JimItem.COMPRESSED_GOLD, Item.make(Material.GOLD_INGOT));
		compress.addCompressRecipe(JimItem.DOUBLE_COMPRESSED_GOLD, JimItem.COMPRESSED_GOLD.item);
		compress.addCompressRecipe(JimItem.TRIPLE_COMPRESSED_GOLD, JimItem.DOUBLE_COMPRESSED_GOLD.item);

		compress.addCompressRecipe(JimItem.COMPRESSED_LAPIS, Item.make(Material.LAPIS_LAZULI));
		compress.addCompressRecipe(JimItem.DOUBLE_COMPRESSED_LAPIS, JimItem.COMPRESSED_LAPIS.item);
		compress.addCompressRecipe(JimItem.TRIPLE_COMPRESSED_LAPIS, JimItem.DOUBLE_COMPRESSED_LAPIS.item);

		compress.addCompressRecipe(JimItem.COMPRESSED_REDSTONE, Item.make(Material.REDSTONE));
		compress.addCompressRecipe(JimItem.DOUBLE_COMPRESSED_REDSTONE, JimItem.COMPRESSED_REDSTONE.item);
		compress.addCompressRecipe(JimItem.TRIPLE_COMPRESSED_REDSTONE, JimItem.DOUBLE_COMPRESSED_REDSTONE.item);

		compress.addCompressRecipe(JimItem.COMPRESSED_EMERALD, Item.make(Material.EMERALD));
		compress.addCompressRecipe(JimItem.DOUBLE_COMPRESSED_EMERALD, JimItem.COMPRESSED_EMERALD.item);
		compress.addCompressRecipe(JimItem.TRIPLE_COMPRESSED_EMERALD, JimItem.DOUBLE_COMPRESSED_EMERALD.item);

		compress.addCompressRecipe(JimItem.COMPRESSED_DIAMOND, Item.make(Material.DIAMOND));
		compress.addCompressRecipe(JimItem.DOUBLE_COMPRESSED_DIAMOND, JimItem.COMPRESSED_DIAMOND.item);
		compress.addCompressRecipe(JimItem.TRIPLE_COMPRESSED_DIAMOND, JimItem.DOUBLE_COMPRESSED_DIAMOND.item);

		compress.addCompressRecipe(JimItem.COMPRESSED_OBSIDIAN, Item.make(Material.OBSIDIAN));
		compress.addCompressRecipe(JimItem.DOUBLE_COMPRESSED_OBSIDIAN, JimItem.COMPRESSED_OBSIDIAN.item);
		compress.addCompressRecipe(JimItem.TRIPLE_COMPRESSED_OBSIDIAN, JimItem.DOUBLE_COMPRESSED_OBSIDIAN.item);

		FieldJournal fieldJournal = new FieldJournal(); fieldJournal.addRecipe();
		MagicMissileWand magicMissileWand = new MagicMissileWand(); magicMissileWand.addRecipe();
		ZappWand zapWand = new ZappWand(); zapWand.addRecipe();
		
	}
	
	public void registerEvents() {
		
		new OpenFieldJournal(this);
		new PlayerSetup(this);
		new DeathMessages(this);
		
		//Custom GUI interact
		new FieldJournalInteract(this);
		new ResearchTopicInteract(this);
		
		//Test
		//new UnlockTopic(this);
		new ManaItemUse(this);
	}
	
	public void setupConfig() {
		
		getConfig().options().copyDefaults(true);
		saveConfig();
		
		File file = new File("plugins/ProjectJim/PlayerData");
		
		if(file.mkdirs()) {
			System.out.println("PlayerData folder created");
		} else{
	         System.out.println("PlayerData folder couldn't be created or already exists");
	    }
	}
	
}	
