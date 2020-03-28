package net.gabriel.managers;

import net.gabriel.models.Event;
import net.gabriel.models.EventHandler;
import net.gabriel.models.Listener;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

public class SimplePluginManager implements PluginManager {

    private List<Listener> listeners = new ArrayList<>();

    public void registerEvents(Listener listener) {
        listeners.add(listener);
    }

    public void callEvent(Event event) {
        for (Listener listener : listeners) {
            for (Method method : listener.getClass().getDeclaredMethods()) {
                if (method.getParameterCount() == 1) {
                    try {
                        if (method.isAnnotationPresent(EventHandler.class)) {
                            Parameter param = method.getParameters()[0];
                            if (param.getType().equals(event.getClass())) {
                                method.invoke(listener, event);
                            }
                        }
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}


