package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherService {

    Map<Set<Location>, Set<Client>> oneClientToLocation = new HashMap<>();
    private Set<Location> locations = new HashSet<>();
    private Set<Client> clients = new HashSet<>();

    public void addSubscriberToOneLocation(Location location, Client client) {
        oneClientToLocation.put(locations, clients);
    }

    public void removeSubscriberFromOneLocation(Client client) {
        this.clients.remove(client);
    }

    public void removeSubscriberFromAllLocations(Client client) {
        this.clients.remove(client);
    }

    public void sendWeatherNotificationForOneLocation(Notification notification) { // jak wysłać użytkownikom z jednej lokalizacji ???? Może być tablica.
        // lokalizacja, klient, lokalizacja, klient, itd. Może: https://www.daniweb.com/programming/software-development/threads/408481/storing-multiple-objects-in-an-array
        this.clients.forEach(client -> client.receive(notification));
    }

    public void sendWeatherNotificationToAll(Notification notification) {
        this.clients.forEach(client -> client.receive(notification));
    }

    public void removeOneLocation(Location location) {
        this.locations.remove(location);
    }

}
