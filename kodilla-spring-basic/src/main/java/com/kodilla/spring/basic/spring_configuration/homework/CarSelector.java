package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CarSelector {

    public String season;

    @Bean
    public Car selectCar() {
        String spring = "Spring";
        String summer = "Summer";
        String autumn = "Autumn";
        String winter = "Winter";

        if (season.equals(spring) || season.equals(autumn)) {
            return new Sedan();
        } else if (season.equals(summer)) {
            return new Cabrio();
        } else {
            return new Suv();
        }
    }
}