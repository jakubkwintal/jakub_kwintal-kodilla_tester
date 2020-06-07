package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherService {

    private Map<Client, Set<Location>> clientAndLocations = new HashMap<>();

    public void addClientToOneLocation(Client client, Location location) { // TEST

        clientAndLocations.computeIfAbsent(client, u -> new HashSet<>()).add(location);
    }

    public void removeClientFromOneLocation(Client client, Location location) { //TEST
        this.clientAndLocations.entrySet()
                .stream()
                .filter(u -> u.getKey().equals(client))
                .forEach(u -> u.getValue().remove(location));
    }

    public void removeClientFromAllLocations(Client client) { //TEST
        this.clientAndLocations.remove(client);
    }

    public void removeOneLocation(Location location) {
        this.clientAndLocations.entrySet()
                .stream()
                .filter(u -> u.getValue().contains(location))
                .forEach(u -> u.getValue().remove(location));
    }

    public void sendWeatherNotificationForOneLocation(Notification notification, Location location) { //TEST
        this.clientAndLocations.entrySet()
                .stream()
                .filter(u -> u.getValue().contains(location))
                .forEach(u -> u.getKey().receive(notification));
    }

    public void sendNotificationToAll(Notification notification) {
        this.clientAndLocations.entrySet()
                .forEach(u -> u.getKey().receive(notification));
    }
}
