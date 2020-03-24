package com.kodilla.notification;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;

import java.util.*;

public class NotificationService {

    private Set<Client> clients = new HashSet<>();

    public void addSubscriber(Client client) {
        this.clients.add(client);
    }

    public void sendNotification(Notification notification) {
        this.clients.forEach(client -> client.receive(notification));
    }

    public void removeSubscriber(Client client) {
        this.clients.remove(client);
    }
}