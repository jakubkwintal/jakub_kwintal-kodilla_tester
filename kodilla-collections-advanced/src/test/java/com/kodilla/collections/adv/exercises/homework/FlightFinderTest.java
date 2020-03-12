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
        expectedList.add(new Flight("Paris", "Warsaw"));
        expectedList.add(new Flight("Warsaw", "Chicago"));
        expectedList.add(new Flight("Warsaw", "Amsterdam"));

        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo() {
        List<Flight> result = flightFinder.findFlightsTo("Warsaw");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Denver"));
        expectedList.add(new Flight("Moscow", "Warsaw"));
        expectedList.add(new Flight("Milan", "Warsaw"));


        assertEquals(expectedList, result);
    }

}