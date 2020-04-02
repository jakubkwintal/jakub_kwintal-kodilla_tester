package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherService {

    private Set<Location> locations = new HashSet<>();

    private Set<Client> clients = new HashSet<>();

    public void addLocation(Location location) {
        this.locations.add(location);}

    public void addSubscriberToOneLocation(Client client) {
        this.clients.add(client);
    }

    public void removeSubscriberFromOneLocation(Client client) {
        this.clients.remove(client);
    }

    public void removeSubscriberFromAllLocations(Client client) {
        this.clients.remove(client);
    }

    public void sendWeatherNotificationForOneLocation(Notification notification) { // jak wysłać użytkownikom z jednej lokalizacji ????
        this.clients.forEach(client -> client.receive(notification));
    }

    public void sendWeatherNotificationToAll(Notification notification) {
        this.clients.forEach(client -> client.receive(notification));
    }

    public void removeOneLocation(Location location) {
        this.locations.remove(location);
    }

}
