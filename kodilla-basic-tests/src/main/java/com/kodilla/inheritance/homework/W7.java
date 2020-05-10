package com.kodilla.inheritance.homework;

public class W7 extends OperatingSystem {

    public W7(int yearIn, int yearOut) {
        super(yearIn, yearOut);
    }

    @Override
    public void turnOn() {
        System.out.println("Rok wydania Windows 7: " + getYearIn());
    }

    @Override
    public void turnOff() {
        System.out.println("Rok zakończenia wsparcia dla Windows 7: " + getYearOut());
    }

}