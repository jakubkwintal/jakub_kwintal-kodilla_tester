package com.kodilla.collections.interfaces.homework;

public class Mercedes implements Car{
    private int speedIn;
    private int speedOut;

    public Mercedes (int speedIn, int speedOut) {
        this.speedIn = speedIn;
        this.speedOut = speedOut;
    }

    public String getName() { return "Mercedes"; }

    public int increaseSpeed() { return speedIn; }

    public int decreaseSpeed() { return speedOut; }

    public int getSpeed() { return 3*speedIn - 2*speedOut; }
}