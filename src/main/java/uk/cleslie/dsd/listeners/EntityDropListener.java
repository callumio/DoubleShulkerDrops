package uk.cleslie.dsd.listeners;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class EntityDropListener implements Listener {

	@EventHandler
	public void onEntityDeath(EntityDeathEvent e) {
		if (e.getEntityType() == EntityType.SHULKER){
			e.getDrops().get(0).setAmount(2);
		}
	}
}
