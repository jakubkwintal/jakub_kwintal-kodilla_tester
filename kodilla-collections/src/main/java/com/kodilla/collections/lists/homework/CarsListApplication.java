package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Volkswagen;
import com.kodilla.collections.arrays.homework.CarUtils;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Toyota(30, 27));
        cars.add(new Mercedes(43, 28));
        cars.add(new Volkswagen(34, 26));
        Toyota toyota = new Toyota(32, 19);
        cars.add(toyota);

        System.out.println("-----------------------------------");
        System.out.println("Na początku były " + cars.size() + " samochody:");
        for (Car car : cars)
            CarUtils.describeCar(car);

        cars.remove(2);
        cars.remove(toyota);
        System.out.println("-----------------------------------");
        System.out.println("Potem zostało ich " + cars.size() + " :");
        for (Car car : cars)
            CarUtils.describeCar(car);
    }
}
