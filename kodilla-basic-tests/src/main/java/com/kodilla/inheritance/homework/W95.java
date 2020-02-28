package com.kodilla.inheritance.homework;

public class W95 extends OperatingSystem {

    @Override
    public void turnOn() {
        System.out.println("Rok wydania Windows 95: " + getYearIn());
    }
    public void turnOff() {
        System.out.println("Rok zakończenia wsparcia dla Windows 95: " + getYearOut());
    }
    public W95(int yearIn, int yearOut) {
        super(yearIn, yearOut);
    }
}