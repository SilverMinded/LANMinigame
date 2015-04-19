package com.silverminded.lanminigame;

import net.amigocraft.mglib.api.Minigame;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by J0QUE on 19/04/2015.
 */

public class Main extends JavaPlugin{
	//Maak een object voor een Minigame (Static zodat je hem overal kan callen)
	public static Minigame mg;
	
	public void onEnable(){
		//Registreer de plugin als een Minigame
		mg = Minigame.registerPlugin(this);
	}

}
