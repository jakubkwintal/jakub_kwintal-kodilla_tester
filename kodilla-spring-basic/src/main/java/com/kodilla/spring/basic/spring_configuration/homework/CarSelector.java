//package com.kodilla.spring.basic.spring_configuration.homework;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalTime;
//
//
//@Configuration
//public class CarSelector {
//
//    @Bean
//    public Car selectCar() {
//        Car car;
//        String season = null;
//        if (season == "Winter") {
//            car = new Suv();
//        } else if (season == "Spring&Autumn") {
//            car = new Cabrio();
//        } else {
//            car = new Sedan();
//        }
//        return car;
//    }
//
//    @Bean
//    public boolean lights(LocalTime localTime) {
//        LocalTime now = LocalTime.now();
//        LocalTime turnOnLights = LocalTime.of(19, 59);
//        LocalTime turnOffLights = LocalTime.of(6, 01);
//
//        if (now.isAfter(turnOnLights) && now.isBefore(turnOffLights)) {
//            selectCar().hasHeadlightsTurnedOn();
//        }
//        return true;
//    }
//}
