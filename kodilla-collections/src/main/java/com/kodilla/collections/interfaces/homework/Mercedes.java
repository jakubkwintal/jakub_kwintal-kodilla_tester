package com.kodilla.collections.interfaces.homework;

public class Mercedes implements Car {
    private String name = "Mercedes";
    private int speed;
    private int increaseSpeed;
    private int decreaseSpeed;

    public Mercedes(int speed, int increaseSpeed, int decreaseSpeed) {
        this.speed = speed;
        this.increaseSpeed = increaseSpeed;
        this.decreaseSpeed = decreaseSpeed;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
        return increaseSpeed;
    }

    @Override
    public int decreaseSpeed() {
        return decreaseSpeed;
    }
}