package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
public class CarSelector {

    private Object LocalTime;

    @Bean
    public Suv selectSuv() {
        return new Suv();
    }

    @Bean
    public Car selectCar() {
        Car car;
        String season = null;
        if (season == "Winter") {
            car = new Suv();
        } else if (season == "Spring&Autumn") {
            car = new Cabrio();
        } else {
            car = new Sedan();
        }
        return car;

//        if (LocalTime > LocalTime.of(19,59) && LocalTime < LocalTime.of(6,01)){
//            car.hasHeadlightsTurnedOn();
    }
}
