package net.gabriel.events;

import net.gabriel.models.Cancellable;
import net.gabriel.models.Event;

public class PlayerChatEvent extends Event implements Cancellable {
    private boolean cancelled;
    private String player;
    private String message;

    public PlayerChatEvent(String player, String message) {
        this.player = player;
        this.message = message;
        this.cancelled = false;
    }

    public String getPlayer() {
        return player;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public void setCancelled(boolean arg) {
        this.cancelled = arg;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }
}
