//package com.kodilla.mockito.homework;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//
//import java.util.Map;
//
//public class WeatherServiceTestSuite {
//
//    WeatherService weatherService = new WeatherService();
//    Client client1 = Mockito.mock(Client.class);
//    Location location1 = Mockito.mock(Location.class);
//    Notification notification = Mockito.mock(Notification.class);
//
//    @Test
//    public void shouldAddSubscriberToOneLocation() {
//        weatherService.addSubscriberToOneLocation(location1, client1);
//        weatherService.sendWeatherNotificationForOneLocation(notification);
//        Mockito.verify(client1, Mockito.times(1)).receive(notification);
//    }
//
//    @Test
//    public void shouldRemoveSubscriberFromOneLocation() {
//        weatherService.addSubscriberToOneLocation(location1, client1);
//        weatherService.removeSubscriberFromOneLocation(location1, client1);
//        weatherService.sendWeatherNotificationForOneLocation(notification);
//        Mockito.verify(client1, Mockito.never()).receive(notification);
//    }
//
////    @Test
////    public void shouldRemoveSubscriberFromAllLocations() {
////        weatherService.removeSubscriberFromAllLocations(client);
////
////
////    }
//}