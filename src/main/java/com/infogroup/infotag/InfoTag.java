package com.infogroup.infotag;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class InfoTag extends JavaPlugin {

    Logger logger;
    public void onEnable() {
        logger = this.getLogger();


        logger.info("InfoTag has been enabled!");
    }


    public void onDisable() {


        logger.info("InfoTag has been disabled!");
    }
}
