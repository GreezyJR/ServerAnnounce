package com.gflclan.remuchu.serverannounce;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;
import java.util.logging.Logger;

public final class ServerAnnounce extends JavaPlugin {

    @Override
    public void onEnable() {
        FileConfiguration config = this.getConfig();
        config.addDefault("firstTimeUse", true);
        config.addDefault("firstBroadcast","Replace this line with your desired broadcast");
        config.addDefault("enableFirstBroadcast", false);
        config.addDefault("howOftenFirst", 0);
        config.options().copyDefaults(true);
        saveConfig();
        Logger log = Bukkit.getLogger();
        this.getConfig();
        if(config.getBoolean("firstTimeUse", true)) log.info("Please Setup the config supplied by the plugin");
        if(config.getBoolean("firstTimeUse", false)) log.info("Server Announcements has been loaded");
        if(config.getBoolean("enableFirstBroadcast", true)) log.info("The first broadcast has been enabled!");

    }




    @Override
    public void onDisable() {

    }

}
