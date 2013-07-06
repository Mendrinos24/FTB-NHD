package nodamage.common;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
 
public class FoodChange implements Listener {
	@EventHandler(priority = EventPriority.MONITOR)
	public void onFoodLevelChange(FoodLevelChangeEvent event)
{
event.setFoodLevel(20);
}
}
