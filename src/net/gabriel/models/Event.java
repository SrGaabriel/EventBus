package net.gabriel.models;

public abstract class Event {

    public String getName() {
        return this.getClass().getSimpleName();
    }

}
