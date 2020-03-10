package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {
    Map<String, List<Flight>> flightsTable = new HashMap<>();

    public void someFlight(String departure, String arrival) {
        List<Flight> flights = flightsTable.getOrDefault(departure, new ArrayList<>());
    }

    public List<Flight> findFlightsFrom(String departure) {
        return flightsTable.getOrDefault(departure, Collections.emptyList());
    }

    public List<Flight> findFlightsTo(String arrival) {
        return flightsTable.getOrDefault(arrival, Collections.emptyList());
    }

}
