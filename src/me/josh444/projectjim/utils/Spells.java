package me.josh444.projectjim.utils;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;

public class Spells {
	
	public static void useMagicMissile(Player p) {
		Location eye = p.getEyeLocation();
	    Location loc = eye.add(eye.getDirection().multiply(1.2));
	    Fireball fireball = (Fireball) loc.getWorld().spawnEntity(loc, EntityType.FIREBALL);
	    fireball.setVelocity(loc.getDirection().normalize().multiply(2));
	    fireball.setIsIncendiary(false);
	    fireball.setYield((float) 1.5);
	    fireball.setShooter(p);
	}
}
