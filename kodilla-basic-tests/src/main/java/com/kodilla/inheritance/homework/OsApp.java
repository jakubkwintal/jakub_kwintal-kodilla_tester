package com.kodilla.inheritance.homework;

public class OsApp {

    public static void main(String[] args) {

        W95 w95 = new W95(1995, 2001);
        w95.turnOn();
        w95.turnOff();

        W7 w7 = new W7(2009,2020);
        w7.turnOn();
        w7.turnOff();
    }
}