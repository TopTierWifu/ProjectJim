package me.josh444.projectjim.utils;

import java.util.Random;
import java.util.function.Predicate;

import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.Particle.DustOptions;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class Spells {
	
	public static void useMagicMissile(Player p) {
		Location eye = p.getEyeLocation();
	    Location loc = eye.add(eye.getDirection().multiply(1.2));
	    Fireball fireball = (Fireball) loc.getWorld().spawnEntity(loc, EntityType.FIREBALL);
	    fireball.setVelocity(loc.getDirection().normalize().multiply(2));
	    fireball.setIsIncendiary(false);
	    fireball.setYield((float) 0.0);
	    fireball.setShooter(p);
	}
	
	public static void useZap(Player p) {
		Location origin = p.getEyeLocation();
		Location dest = origin.clone().add(origin.getDirection().multiply(64));
		
		Vector dir = dest.toVector().subtract(origin.toVector());
        double length = dir.length();
        dir.normalize();

        double x = dir.getX();
        double y = dir.getY();
        double z = dir.getZ();

        Random rand = new Random();
        
        Predicate<Entity> predicate = (e) -> e instanceof LivingEntity;
        
        for (double i = 0.5D; i < length; i += 0.5D) {
            origin.add(x * i, y * i, z * i);

            Block b = origin.getBlock();
            
            if (!b.isEmpty()||!b.isPassable()||!b.isLiquid()) {
                origin.subtract(x * i, y * i, z * i);
            }
            
            DustOptions dustOptions = new DustOptions(Color.fromRGB(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)), 1);
            origin.getWorld().spawnParticle(Particle.REDSTONE, origin, 0, dustOptions);
            
            for(Entity e : origin.getWorld().getNearbyEntities(origin, 0.75, 0.75, 0.75, predicate)){
            	if(e.getLocation().distance(origin)<= 1.5) {
            		((LivingEntity) e).damage(15, p);
            	}
            }
            
            origin.subtract(x * i, y * i, z * i);
        }
	    
	}
	
	//More spells here
	
}
