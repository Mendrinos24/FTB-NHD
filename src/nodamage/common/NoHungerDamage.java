package nodamage.common;

import java.util.logging.Logger;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
 
public class NoHungerDamage extends JavaPlugin {
private static final double Max = 20;
public final Logger logger = Logger.getLogger("Minecraft");
 
@Override
public void onEnable()
 
{
PluginDescriptionFile pdfFile = this.getDescription();
this.logger.info(pdfFile.getName() + " Version "+ pdfFile.getVersion() + " Has Been Enabled!");
getServer().getPluginManager().registerEvents(new HealthChange(), this);
getServer().getPluginManager().registerEvents(new FoodChange(), this);
}
 
public boolean onCommand(CommandSender sender, Command cmd, String commandLable, String[] args){
 
Player player = null;
if(sender instanceof Player)
{
player = (Player)sender;
}
if(cmd.getName().equalsIgnoreCase("damage") || cmd.getName().equalsIgnoreCase("hunger")){
	sender.sendMessage(ChatColor.RED + "-------FTBHunger and FTBDamage Status----------------");
	sender.sendMessage(ChatColor.GREEN + "FTBNoDamage and FTBNoHunger is Working");
}
 
while(true){
player.setFoodLevel(20);
player.setHealth(Max);
}
}
 
}
