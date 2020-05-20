package me.Josh444.ProjectJim.Listeners.Unlocks;

import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class CompressedCobblestone implements Listener{

	@EventHandler
	public void compressedCobblestone(BlockBreakEvent e) {
		
		Player p = e.getPlayer();
		
		int test = p.getStatistic(Statistic.MINE_BLOCK);
		
	}
}
