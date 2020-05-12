package com.kodilla.spring.basic.spring_configuration.homework;

public class Suv implements Car {

    private boolean lightsOn;

    public Suv(boolean lightsOn) {
        this.lightsOn = lightsOn;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return lightsOn;
    }

    @Override
    public String getCarType() {
        return "Suv";
    }
}