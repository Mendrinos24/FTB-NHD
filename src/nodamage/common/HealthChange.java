package nodamage.common;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
 
public class HealthChange implements Listener {
	private static final double nothing = 0;
	Player p;
	@EventHandler(priority = EventPriority.MONITOR)
	public void onEntityDamage(EntityDamageEvent event)
{
		if(event.getEntityType().equals(p)) {
			event.setDamage(nothing);
		} else {
			event.setCancelled(false);
		}
}
}
