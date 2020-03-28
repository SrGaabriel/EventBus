package net.gabriel;

import net.gabriel.managers.PluginManager;
import net.gabriel.managers.SimplePluginManager;

public abstract class Bukkit {

    private static PluginManager pluginManager = new SimplePluginManager();

    public static PluginManager getPluginManager() {
        return pluginManager;
    }

}
