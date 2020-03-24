package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherService {

    private Set<Location> locations = new HashSet<>();

    private Set<Client> clients = new HashSet<>();

    public void addLocation(Location location) {this.locations.add(location);}

    public void addSubscriberToOneLocation(Client client, Location location) {
        this.clients.add(client);
        this.locations.add(location);
    }

    public void removeSubscriberFromOneLocation(Client client, Location location) {
        this.clients.remove(client);
        this.locations.remove(location);
    }

    public void removeSubscriberFromAllLocation(Client client) {
        this.clients.remove(client);
    }

    public void sendWeatherNotificationForOneLocation(Notification notification) {
        this.clients.forEach(client -> client.receive(notification));

    }

    public void sendWeatherNotificationToAll(Notification notification) {
        this.clients.forEach(client -> client.receive(notification));
    }

    public void removeOneLocation(Location location) {
        this.locations.remove(location);
    }

}
