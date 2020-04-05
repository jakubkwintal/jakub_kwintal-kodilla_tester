//package com.kodilla.mockito.homework;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//
//import java.util.Map;
//
//public class WeatherServiceTestSuite {
//
//
//
//    WeatherService weatherService = new WeatherService();
//    Client client = Mockito.mock(Client.class);
//    Notification notification = Mockito.mock(Notification.class);
//    Location location = Mockito.mock(Location.class);
//
//    @Test
//    public void shouldAddLocation() {
//        weatherService.addLocation(location);
//    }
//
//    @Test
//    public void shouldAddSubscriberToOneLocation() {
//        weatherService.addSubscriberToOneLocation(client);
//        weatherService.sendWeatherNotificationForOneLocation(notification);
//        Mockito.verify(client, Mockito.times(1)).receive(notification);
//    }
//
//    @Test
//    public void shouldRemoveSubscriberFromOneLocation() {
//        weatherService.addSubscriberToOneLocation(client);
//        weatherService.removeSubscriberFromOneLocation(client);
//        weatherService.sendWeatherNotificationForOneLocation(notification);
//        Mockito.verify(client, Mockito.never()).receive(notification);
//    }
//
//    @Test
//    public void shouldRemoveSubscriberFromAllLocations() {
//        weatherService.addSubscriberToOneLocation(client);
//
//
//    }
//}