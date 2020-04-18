package com.kodilla.abstracts.homework;

public class Mechanic extends Job {
    public Mechanic() {
        super("4000 zł", "repairing cars");
    }

    @Override
    public String toString() {
        return "mechanic";
    }
}
