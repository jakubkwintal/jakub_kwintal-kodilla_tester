package com.kodilla.collections.adv.exercises.homework;

import java.util.LinkedList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flightsTable = new LinkedList<>();
        flightsTable.add(new Flight("Warsaw", "Paris"));
        flightsTable.add(new Flight("Amsterdam", "Warsaw"));
        flightsTable.add(new Flight("Warsaw", "New York"));
        flightsTable.add(new Flight("Moscow", "Warsaw"));
        flightsTable.add(new Flight("Warsaw", "Dublin"));
        flightsTable.add(new Flight("Warsaw", "Chicago"));
        flightsTable.add(new Flight("Denver", "Warsaw"));
        flightsTable.add(new Flight("Milan", "Warsaw"));

        return flightsTable;
    }


}