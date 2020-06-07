package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherServiceTestSuite {

    WeatherService weatherService = new WeatherService();
    Client client1 = Mockito.mock(Client.class);
    Client client2 = Mockito.mock(Client.class);
    Client client3 = Mockito.mock(Client.class);
    Location location1 = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);
    Location location3 = Mockito.mock(Location.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void shouldAddSubscriberOnlyOneTimeToOneLocationAndSendNotificationForThisLocation() {
        weatherService.addClientToOneLocation(client1, location1);
        weatherService.addClientToOneLocation(client1, location1);
        weatherService.sendWeatherNotificationForOneLocation(notification, location1);
        Mockito.verify(client1, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldRemoveClientFromOneLocation() {
        weatherService.addClientToOneLocation(client1, location1);
        weatherService.removeClientFromOneLocation(client1, location1);
        weatherService.sendWeatherNotificationForOneLocation(notification, location1);
        Mockito.verify(client1, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldRemoveClientFromAllLocations() {
        weatherService.addClientToOneLocation(client1, location1);
        weatherService.addClientToOneLocation(client1, location2);
        weatherService.addClientToOneLocation(client1, location3);
        weatherService.removeClientFromAllLocations(client1);
        weatherService.sendWeatherNotificationForOneLocation(notification, location1);
        weatherService.sendWeatherNotificationForOneLocation(notification, location2);
        weatherService.sendWeatherNotificationForOneLocation(notification, location3);
        Mockito.verify(client1, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldSendNotificationToAll() {
        weatherService.addClientToOneLocation(client1, location1);
        weatherService.addClientToOneLocation(client2, location1);
        weatherService.addClientToOneLocation(client3, location1);
        weatherService.addClientToOneLocation(client1, location2);
        weatherService.addClientToOneLocation(client2, location2);
        weatherService.addClientToOneLocation(client3, location2);
        weatherService.sendNotificationToAll(notification);
        Mockito.verify(client1, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
        Mockito.verify(client3, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldRemoveLocation() {
        weatherService.addClientToOneLocation(client1, location2);
        weatherService.removeOneLocation(location2);
        weatherService.sendWeatherNotificationForOneLocation(notification, location2);
        Mockito.verify(client1, Mockito.times(0)).receive(notification);
    }
}