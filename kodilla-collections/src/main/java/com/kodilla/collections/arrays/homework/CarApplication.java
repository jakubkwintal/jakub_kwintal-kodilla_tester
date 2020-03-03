package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Volkswagen;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarApplication {

    public static void main(String[] args) {
        Car[] cars = new Car[new Random().nextInt(15) + 1];
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        int drawSomeCar = new Random().nextInt(3);
        int speedIn = new Random().nextInt(41);
        int speedOut = 0; // musiałem dodać tą zmienną bo jest w klasach poszczególnych samochodów.

        if (drawSomeCar == 0) return new Toyota(speedIn, speedOut);
        else if (drawSomeCar == 1) return new Mercedes(speedIn, speedOut);
        else return new Volkswagen(speedIn, speedOut);
    }
}
