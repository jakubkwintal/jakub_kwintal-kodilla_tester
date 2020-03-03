package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("100-lecie Polski", "30x40", "nie"));
        stamps.add(new Stamp("Chopin", "45x45", "nie"));
        stamps.add(new Stamp("Mieszko I", "25x35", "tak"));
        stamps.add(new Stamp("Syrena", "30x40", "tak"));
        stamps.add(new Stamp("Bydgoszcz", "50x50", "nie"));
        stamps.add(new Stamp("Mieszko I", "25x35", "tak"));
        stamps.add(new Stamp("Chopin", "45x45", "nie"));

        System.out.println("Klaser zawiera kolekcję " + stamps.size() + " znaczków pocztowych:");
        for (Stamp stamp: stamps)
            System.out.println(stamp);

    }
}
