package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {
    private int speedIn;
    private int speedOut;

    public Toyota (int speedIn, int speedOut) {
        this.speedIn = speedIn;
        this.speedOut = speedOut;
    }
    public String getName() { return "Toyota"; }

    public int increaseSpeed() { return speedIn; }

    public int decreaseSpeed() { return speedOut; }

    public int getSpeed() { return 3*speedIn - 2*speedOut; }
}