package com.kodilla.inheritance.homework;

public class OsApp {

    public static void main(String[] args) {
        W95 w95 = new W95(1995, 2001);
        W7 w7 = new W7(2009, 2020);

        displayAll(w95);
        displayAll(w7);
    }

    public static void displayAll(OperatingSystem operatingSystem) {
        operatingSystem.turnOn();
        operatingSystem.turnOff();
    }
}