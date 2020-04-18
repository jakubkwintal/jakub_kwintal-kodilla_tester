package com.kodilla.abstracts.homework;

public class Musician extends Job {
    public Musician() {
        super("3000 tys", "playing concerts");
    }

    @Override
    public String toString() {
        return "musician";
    }
}