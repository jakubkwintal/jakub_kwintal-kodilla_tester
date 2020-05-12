package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherService {

    Map<Set<Location>, Set<Client>> oneClientToOneLocation = new HashMap<>();
    private Set<Location> locations = new HashSet<>();
    private Set<Client> clients = new HashSet<>();

    public void addSubscriberToOneLocation(Location location, Client client) {
        oneClientToOneLocation.put(locations, clients);
    }

    public void removeSubscriberFromOneLocation(Location location, Client client) {
        oneClientToOneLocation.remove(locations, clients);
    }

    public void removeSubscriberFromAllLocations(Notification notification, Location location) { // jak to zrobić???
        oneClientToOneLocation.forEach(u -> u.remove(clients));
    }

    public void sendWeatherNotificationForOneLocation(Notification notification) {  // jak wysłać klientom z jednej tylko lokalizacji????
        Set<Client> clientsInOneLocation = new HashSet<>();
        clientsInOneLocation.forEach(client -> client.receive(notification));
    }

    public void sendWeatherNotificationToAll(Notification notification) {
        clients.forEach(client -> client.receive(notification));
    }

    public void removeOneLocation(Location location) {
        this.locations.remove(location);
    }

}
