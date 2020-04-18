package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearIn;
    private int yearOut;

    public OperatingSystem(int yearIn, int yearOut) {
        this.yearIn = yearIn;
        this.yearOut = yearOut;
    }

    public void turnOn() {
        System.out.println("Rok wydania systemu: " + yearIn);
    }
    public void turnOff() {
        System.out.println("Rok zakończonia wsparcia dla systemu: " + yearOut);
    }

    public int getYearIn() {
        return yearIn;
    }
    public int getYearOut() {
        return yearOut;
    }
}