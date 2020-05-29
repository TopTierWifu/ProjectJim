package me.josh444.projectjim.utils;

import java.util.Arrays;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.block.Block;

public class BlockUtil {
	
	private static final List<Material> NON_SOLID = Arrays.asList(Material.AIR,
			Material.BROWN_MUSHROOM,
			Material.BLACK_BANNER,
			Material.BLUE_BANNER,
			Material.BROWN_BANNER,
			Material.CYAN_BANNER,
			Material.GRAY_BANNER,
			Material.GREEN_BANNER,
			Material.LIME_BANNER,
			Material.PINK_BANNER,
			Material.RED_BANNER,
			Material.WHITE_BANNER,
			Material.BREWING_STAND,
			Material.COCOA,
			Material.DEAD_BUSH,
			Material.DETECTOR_RAIL,
			Material.END_PORTAL,
			Material.END_ROD,
			Material.FIRE,
			Material.LAVA,
			Material.LEVER,
			Material.MELON_STEM,
			Material.NETHER_WART,
			Material.END_PORTAL,
			Material.POWERED_RAIL,
			Material.PUMPKIN_STEM,
			Material.RAIL,
			Material.REDSTONE_TORCH,
			Material.REDSTONE_WIRE,
			Material.RED_MUSHROOM,
			Material.SNOW,
			Material.STONE_BUTTON,
			Material.SUGAR_CANE,
			Material.TORCH,
			Material.TRIPWIRE,
			Material.TRIPWIRE_HOOK,
			Material.VINE,
			Material.WATER,
			Material.LILY_PAD,
			Material.COBWEB,
			Material.DANDELION);
	
	public static boolean isSolid(Block block) {
		return !NON_SOLID.contains(block.getType());
	}
	
}	