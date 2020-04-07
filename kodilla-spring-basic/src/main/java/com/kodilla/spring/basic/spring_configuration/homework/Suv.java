package com.kodilla.spring.basic.spring_configuration.homework;

public class Suv implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return true;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }

    @Override
    public String season() {
        return "Winter";
    }
}
