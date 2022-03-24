package com.jointitle.jointitle;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class JoinTitle extends JavaPlugin {

    @Override
    public void onEnable() {
        // запуск плагина

        // создание конфига
        File config = new File(getDataFolder() + File.separator + "config.yml");
        if (!config.exists()) {
            getLogger().info("Create config");
            getConfig().options().copyDefaults(true);
            saveDefaultConfig();
        }

        this.getCommand("Config").setExecutor(new Config());
        this.getCommand("TestTitle").setExecutor(new TestTitle());
        Bukkit.getPluginManager().registerEvents(new EventEditor(), this);
        getLogger().info("Started");

    }

    @Override
    public void onDisable() {
        // выключение плагина
        getLogger().info("Stopped");
    }
}
