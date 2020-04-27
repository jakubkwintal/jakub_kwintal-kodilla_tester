package com.kodilla.optional.homework;

import java.util.Optional;

public class Teacher {
    String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() { // konieczne było dodanie tej metody (niezrozumiałe wyniki programu)
        // i edycji (skrócenia).
        return name;
    }
}
