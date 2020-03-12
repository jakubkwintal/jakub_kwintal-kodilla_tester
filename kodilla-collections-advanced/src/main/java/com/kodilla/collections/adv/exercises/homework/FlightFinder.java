package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

//3. Klasa FlightFinder z metodami:
//public List<Flight> findFlightsFrom(String departure)
//public List<Flight> findFlightsTo(String arrival)
//Metody te będą wyszukiwały loty do oraz z podanego miasta.
//
//Napisz testy do klasy FlightFinder.

public class FlightFinder {
    Map<String, List<Flight>> flightsTable = new HashMap<>();

    public void someFlight(String departure, String arrival) {
        List<Flight> flights = flightsTable.getOrDefault(departure, new ArrayList<>());
    }

    public List<Flight> findFlightsFrom(String departure) { // przekazuje miasto odlotu
        List<Flight> actualTable = new ArrayList<>(); // pusta lista wyników

        for (Flight flight : FlightRepository.getFlightsTable()) { // dla każdego lotu znajdującego się na liście flighTable
            if (flight.getDeparture().equals(departure)) // jeżeli miasto odlotu równa się miastu odlotu
                actualTable.add(flight); // dodaj do listy actualTable
        }
        return actualTable; // zwraca pełną listę z wybranym miastem
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> actualTable = new ArrayList<>();

        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival))
                actualTable.add(flight);
        }
        return actualTable;
    }

}
