package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {
    private FlightFinder flightFinder = new FlightFinder();

    @Test
    public void testFindFlightsFrom() {
        List<Flight> result = flightFinder.findFlightsFrom("Warsaw");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Chicago"));
        expectedList.add(new Flight("Warsaw", "Paris"));
        expectedList.add(new Flight("Warsaw", "New York"));
        expectedList.add(new Flight("Warsaw", "Dublin"));


        assertEquals(4, result.size()); // czy to o to chodziło w tym teście?
    }

    @Test
    public void testFindFlightsTo() {
        List<Flight> result = flightFinder.findFlightsTo("Warsaw");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Moscow", "Warsaw"));
        expectedList.add(new Flight("Milan", "Warsaw"));
        expectedList.add(new Flight("Amsterdam", "Warsaw"));
        expectedList.add(new Flight("Denver", "Warsaw"));

        assertEquals(4, result.size()); // czy to o to chodziło w tym teście?
    }

}