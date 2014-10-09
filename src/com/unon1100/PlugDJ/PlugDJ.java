package com.unon1100.PlugDJ;

import java.util.logging.Logger;
import org.bukkit.ChatColor;
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
            Bukkit.getServer().getLogger().info("Plug.DJ Integration Enabled!");
	}
	
	@Override
	public void onDisable(){
            Bukkit.getServer().getLogger().info("Plug.DJ Integration Enabled!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("plugdj")){
                    if (!sender.hasPermission("plugdj.plugdj")) {
                        sender.sendMessage(ChatColor.RED + "You do not have permission to use this command.");
                        return false;
          }
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
