package com.kodilla.collections.adv.exercises.homework;

import java.util.LinkedList;
import java.util.List;

public class FlightRepository {

    public static void getFlightsTable() {
        List<Flight> flightsTable = new LinkedList<>();
        flightsTable.add(new Flight("Warsaw", "Paris"));
        flightsTable.add(new Flight("Warsaw", "Amsterdam"));
        flightsTable.add(new Flight("Warsaw", "New York"));
        flightsTable.add(new Flight("Warsaw", "London"));
    }
}