package uk.cleslie.dsd.system;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	@Override
	public void onEnable(){
		Bukkit.getConsoleSender().sendMessage("§2DoubleShulkerDrops is §lenabled!");
	}

	@Override
	public void onDisable(){
		Bukkit.getConsoleSender().sendMessage("§4DoubleShulkerDrops is §ldisabled!");
	}
}