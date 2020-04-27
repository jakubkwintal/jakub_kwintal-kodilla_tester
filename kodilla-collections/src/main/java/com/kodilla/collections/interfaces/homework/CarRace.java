package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Toyota toyota = new Toyota(30,7, 12);
        doRace(toyota);

        Mercedes mercedes = new Mercedes(33,9, 14);
        doRace(mercedes);

        Volkswagen volkswagen = new Volkswagen(27,8, 13);
        doRace(volkswagen);
    }
    private static void doRace(Car car) {

        System.out.println(car.getName() + " speed: " + (car.getSpeed() + 3 * car.increaseSpeed() - 2 * car.decreaseSpeed()));
    }
}