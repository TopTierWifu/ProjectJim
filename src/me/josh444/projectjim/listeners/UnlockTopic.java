package me.josh444.projectjim.listeners;

import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerStatisticIncrementEvent;

import me.josh444.projectjim.ProjectJim;
import me.josh444.projectjim.customitems.TopicPaper;
import me.josh444.projectjim.utils.PlayerStatisticsTests;

public class UnlockTopic implements Listener{
	
	public UnlockTopic(ProjectJim plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
	
	@EventHandler
	public void onStatIncrease(PlayerStatisticIncrementEvent e) {
		
		Player p = e.getPlayer();
		Statistic statistic = e.getStatistic();
		
		if(statistic.equals(Statistic.MINE_BLOCK)) {
			Material material = e.getMaterial();
			int value = e.getNewValue();
			
			PlayerStatisticsTests.testMine(material, Material.STONE, value, 128, p, TopicPaper.COMPRESSED_COBBLESTONE);
			PlayerStatisticsTests.testMine(material, Material.STONE, value, 128, p, TopicPaper.DOUBLE_COMPRESSED_COBBLESTONE);
			PlayerStatisticsTests.testMine(material, Material.STONE, value, 128, p, TopicPaper.TRIPLE_COMPRESSED_COBBLESTONE);

			PlayerStatisticsTests.testMine(material, Material.COAL_ORE, value, 64, p, TopicPaper.COMPRESSED_COAL);
			PlayerStatisticsTests.testMine(material, Material.COAL_ORE, value, 64, p, TopicPaper.DOUBLE_COMPRESSED_COAL);
			PlayerStatisticsTests.testMine(material, Material.COAL_ORE, value, 64, p, TopicPaper.TRIPLE_COMPRESSED_COAL);

			PlayerStatisticsTests.testMine(material, Material.IRON_ORE, value, 32, p, TopicPaper.COMPRESSED_IRON);
			PlayerStatisticsTests.testMine(material, Material.IRON_ORE, value, 32, p, TopicPaper.DOUBLE_COMPRESSED_IRON);
			PlayerStatisticsTests.testMine(material, Material.IRON_ORE, value, 32, p, TopicPaper.TRIPLE_COMPRESSED_IRON);

			PlayerStatisticsTests.testMine(material, Material.GOLD_ORE, value, 32, p, TopicPaper.COMPRESSED_GOLD);
			PlayerStatisticsTests.testMine(material, Material.GOLD_ORE, value, 32, p, TopicPaper.DOUBLE_COMPRESSED_GOLD);
			PlayerStatisticsTests.testMine(material, Material.GOLD_ORE, value, 32, p, TopicPaper.TRIPLE_COMPRESSED_GOLD);

			PlayerStatisticsTests.testMine(material, Material.LAPIS_ORE, value, 128, p, TopicPaper.COMPRESSED_LAPIS);
			PlayerStatisticsTests.testMine(material, Material.LAPIS_ORE, value, 128, p, TopicPaper.DOUBLE_COMPRESSED_LAPIS);
			PlayerStatisticsTests.testMine(material, Material.LAPIS_ORE, value, 128, p, TopicPaper.TRIPLE_COMPRESSED_LAPIS);

			PlayerStatisticsTests.testMine(material, Material.REDSTONE_ORE, value, 128, p, TopicPaper.COMPRESSED_REDSTONE);
			PlayerStatisticsTests.testMine(material, Material.REDSTONE_ORE, value, 128, p, TopicPaper.DOUBLE_COMPRESSED_REDSTONE);
			PlayerStatisticsTests.testMine(material, Material.REDSTONE_ORE, value, 128, p, TopicPaper.TRIPLE_COMPRESSED_REDSTONE);

			PlayerStatisticsTests.testMine(material, Material.EMERALD_ORE, value, 32, p, TopicPaper.COMPRESSED_EMERALD);
			PlayerStatisticsTests.testMine(material, Material.EMERALD_ORE, value, 32, p, TopicPaper.DOUBLE_COMPRESSED_EMERALD);
			PlayerStatisticsTests.testMine(material, Material.EMERALD_ORE, value, 32, p, TopicPaper.TRIPLE_COMPRESSED_EMERALD);

			PlayerStatisticsTests.testMine(material, Material.DIAMOND_ORE, value, 16, p, TopicPaper.COMPRESSED_DIAMOND);
			PlayerStatisticsTests.testMine(material, Material.DIAMOND_ORE, value, 16, p, TopicPaper.DOUBLE_COMPRESSED_DIAMOND);
			PlayerStatisticsTests.testMine(material, Material.DIAMOND_ORE, value, 16, p, TopicPaper.TRIPLE_COMPRESSED_DIAMOND);

			PlayerStatisticsTests.testMine(material, Material.OBSIDIAN, value, 32, p, TopicPaper.COMPRESSED_OBSIDIAN);
			PlayerStatisticsTests.testMine(material, Material.OBSIDIAN, value, 32, p, TopicPaper.DOUBLE_COMPRESSED_OBSIDIAN);
			PlayerStatisticsTests.testMine(material, Material.OBSIDIAN, value, 32, p, TopicPaper.TRIPLE_COMPRESSED_OBSIDIAN);

		}
	}
}
