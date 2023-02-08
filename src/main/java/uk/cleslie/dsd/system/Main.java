package uk.cleslie.dsd.system;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import uk.cleslie.dsd.listeners.EntityDropListener;

public class Main extends JavaPlugin {
	@Override
	public void onEnable(){
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new EntityDropListener(), this);


		Bukkit.getConsoleSender().sendMessage("§2DoubleShulkerDrops is §lenabled!");
	}

	@Override
	public void onDisable(){
		Bukkit.getConsoleSender().sendMessage("§4DoubleShulkerDrops is §ldisabled!");
	}
}