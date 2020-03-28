package net.gabriel;

import net.gabriel.events.PlayerChatEvent;
import net.gabriel.listeners.TestListener;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String username = "Admin";

        Bukkit.getPluginManager().registerEvents(new TestListener());

        System.out.print("> ");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        PlayerChatEvent e = new PlayerChatEvent(username, message);
        Bukkit.getPluginManager().callEvent(e);
        if (!e.isCancelled()) {
            String print = e.getMessage().equalsIgnoreCase("message") ? "<" + username + ">" : e.getMessage();
            System.out.println(print);
        }
    }

}
