package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("100-lecie Polski", "30x40", false));
        stamps.add(new Stamp("Chopin", "45x45", false));
        stamps.add(new Stamp("Mieszko I", "25x35", true));
        stamps.add(new Stamp("Syrena", "30x40", true));
        stamps.add(new Stamp("Bydgoszcz", "50x50", true));
        stamps.add(new Stamp("Mieszko I", "25x35", true));
        stamps.add(new Stamp("Chopin", "45x45", false));

        System.out.println("Klaser zawiera kolekcję " + stamps.size() + " znaczków pocztowych:");
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
        System.out.println("------------------------");
        System.out.println("Znaczki nieostemplowane:");
        for (Stamp stamp : stamps) {
            if (!stamp.getStamped())
                System.out.println(stamp);
        }
        System.out.println("------------------------");
        System.out.println("Znaczki ostemplowane:");
        for (Stamp stamp : stamps) {
            if (stamp.getStamped())
                System.out.println(stamp);
        }
    }
}