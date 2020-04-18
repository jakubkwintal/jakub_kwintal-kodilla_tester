package com.kodilla.abstracts.homework;

public class Doctor extends Job {
    public Doctor() {
        super("12000 zł", "treatment of sick people");
    }

    @Override
    public String toString() {
        return "doctor";
    }
}
