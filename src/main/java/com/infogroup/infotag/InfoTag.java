package com.infogroup.infotag;

import com.infogroup.infotag.utils.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class InfoTag extends JavaPlugin {

    Logger logger;
    Metrics metrics;

    public void onEnable() {
        logger = this.getLogger();
        metrics = new Metrics(this);


        logger.info("InfoTag has been enabled!");
    }


    public void onDisable() {

        logger.info("InfoTag has been disabled!");
    }

    //Check if dependencies are installed
    private void dependencies(){

    }
}
