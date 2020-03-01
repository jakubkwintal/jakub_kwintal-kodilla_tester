package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Volkswagen;
import com.kodilla.collections.interfaces.homework.Toyota;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------------------------");
        System.out.println("Auto: " + getCarName(car));
        System.out.println("Prędkość: " + car.increaseSpeed());
            }
    public static String getCarName(Car car) {
        if (car instanceof Toyota)
            return "Toyota";
        else if (car instanceof Mercedes)
            return "Mercedes";
        else if (car instanceof Volkswagen)
            return "Volkswagen";
        else
            return "I think it's a bike.";
    }
}