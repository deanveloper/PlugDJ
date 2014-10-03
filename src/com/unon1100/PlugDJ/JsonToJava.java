package com.unon1100.PlugDJ;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.libs.com.google.gson.Gson;

public class JsonToJava {  
	String prefix = ChatColor.WHITE+"["+ChatColor.GREEN+"PlugDJ"+ChatColor.WHITE+"]";
	public void jsonToJava(){  
		try {   
			// obtained a file object from json file
			File file = new File("json/student.json");

			// get json as buffer  
			BufferedReader br = new BufferedReader(new FileReader(file));

			// obtained Gson object
			Gson gson = new Gson();

			// called fromJson() method and passed incoming buffer from json file  
			// passed student class reference to convert converted result as Student object  
			JSONStorage student = gson.fromJson(br, JSONStorage.class);

			// printed student data on console  
			Bukkit.broadcastMessage(prefix+"");

		} catch (FileNotFoundException e) {  
			e.printStackTrace();  
		}  


	}  
}  
