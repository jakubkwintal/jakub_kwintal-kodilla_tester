package com.kodilla.stream.sii;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    public static List<Car> getCarsList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 2011));
        cars.add(new Car("Mercedes", 2018));
        cars.add(new Car("Fiat", 1990));
        cars.add(new Car("Renault", 2020));
        return cars;
    }
}