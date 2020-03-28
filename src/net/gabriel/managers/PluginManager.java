package net.gabriel.managers;

import net.gabriel.models.Event;
import net.gabriel.models.Listener;

public interface PluginManager {

    void registerEvents(Listener listener);

    void callEvent(Event event);

}
