package net.gabriel.listeners;

import net.gabriel.events.PlayerChatEvent;
import net.gabriel.models.EventHandler;
import net.gabriel.models.Listener;

public class TestListener implements Listener {

    @EventHandler
    public void aoFalar(PlayerChatEvent e) {
        e.setMessage("[ADMIN] " + e.getPlayer() + ": " + e.getMessage());
    }

}
