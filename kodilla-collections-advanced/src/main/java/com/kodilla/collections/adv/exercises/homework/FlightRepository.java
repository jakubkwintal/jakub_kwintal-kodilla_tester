package com.kodilla.collections.adv.exercises.homework;

import java.util.LinkedList;
import java.util.List;

// "2. Klasa FlightRepository z metodą statyczną getFlightsTable(),
// która zwraca listę lotów obsługiwanych przez dane lotnisko (wypełnij tę listę przykładowymi lotami)."

public class FlightRepository {

    public static void getFlightsTable() {
        List<Flight> flightsTable = new LinkedList<>();
        flightsTable.add(new Flight("Warsaw", "Paris"));
        flightsTable.add(new Flight("Warsaw", "Amsterdam"));
        flightsTable.add(new Flight("Warsaw", "New York"));
        flightsTable.add(new Flight("Warsaw", "London"));
    }
}