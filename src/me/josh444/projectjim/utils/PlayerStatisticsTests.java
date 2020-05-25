package me.josh444.projectjim.utils;

import java.io.File;

import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import me.josh444.projectjim.customitems.TopicPaper;

public class PlayerStatisticsTests {

	public static void testMine(Material material, Material test, int value, int valuetest, Player p, TopicPaper topicPaper) {
		if(material.equals(test) && value >= valuetest) {
			FileConfiguration config = PlayerData.getConfig(p);
			File file = PlayerData.getFile(p);
			
			p.sendMessage("Research avaliable for " + topicPaper.name);
			config.set("inprogress." + topicPaper.unlock.key, 1);
			PlayerData.saveConfig(config, file);
		}
	}
}
