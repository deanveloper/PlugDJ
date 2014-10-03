package com.unon1100.PlugDJ;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class PlugDJ extends JavaPlugin{
	private static PlugDJ instance;
	public static final PlugDJ getPlugin(){
		return instance;
	}
	
	@Override
	public void onEnable(){
		instance = this;
	}
	
	@Override
	public void onDisable(){

	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("plugDJ")){
		}
		return false;
	}
	
	
	public static String getJSON(){
		return "";
	}
	
	public static boolean sendCommand(String cmd){
		return true;
	}
}
