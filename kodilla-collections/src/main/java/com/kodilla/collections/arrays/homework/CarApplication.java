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
        Random random = new Random();
        int drawSomeCar = random.nextInt(3);
        int randomSpeed = random.nextInt(21);

        if (drawSomeCar == 0) return new Toyota(0, randomSpeed, 0);
        else if (drawSomeCar == 1) return new Mercedes(0, randomSpeed, 0);
        else return new Volkswagen(0, randomSpeed, 0);
    }
}