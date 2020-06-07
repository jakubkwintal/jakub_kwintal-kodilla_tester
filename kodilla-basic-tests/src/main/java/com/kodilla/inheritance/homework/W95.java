package com.kodilla.inheritance.homework;

public class W95 extends OperatingSystem {

    public W95(int yearIn, int yearOut) {
        super(yearIn, yearOut);
    }

//    @Override
//    public void turnOn() {
//        System.out.println("Rok wydania Windows 95: " + getYearIn());
//    }

    @Override
    public void turnOff() {
        System.out.println("Rok zakończenia wsparcia dla Windows 95: " + getYearOut());
    }

}