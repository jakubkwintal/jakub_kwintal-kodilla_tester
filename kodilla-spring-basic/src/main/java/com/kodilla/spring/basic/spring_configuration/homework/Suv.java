package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Suv implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalTime now = LocalTime.now();
        if (now.isAfter(LocalTime.of(6, 00)) && now.isBefore(LocalTime.of(20, 00))) {
            return false;
        }
        return true;
    }

    @Override
    public String getCarType() {
        return "Suv";
    }

}
