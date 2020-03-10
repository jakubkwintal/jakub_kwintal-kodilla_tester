package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test

    public void testFindFlightsFrom(String departure, String arrival) {
//        given
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.someFlight("Warsaw", "Paris");
        flightFinder.someFlight("Warsaw", "New York");
//        when
        List<Flight> result = flightFinder.findFlightsFrom("Paris");
//        then
        assertEquals(2, result.size());
    }


}