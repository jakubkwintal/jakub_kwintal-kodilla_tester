package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalTime;


@Configuration
public class CarSelector {

    @Bean
    @Scope("prototype")
    public Car selectCar(String season, LocalTime time) {
        String spring = "Spring";
        String summer = "Summer";
        String autumn = "Autumn";
        String winter = "Winter";

        boolean lightsOn = time.isAfter(LocalTime.of(19, 59)) || time.isBefore(LocalTime.of(6, 00));

        if (season.equals(spring) || season.equals(autumn)) {
            return new Sedan(lightsOn);
        } else if (season.equals(summer)) {
            return new Cabrio(lightsOn);
        } else {
            return new Suv(lightsOn);
        }
    }
}