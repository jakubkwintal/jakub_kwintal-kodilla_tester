package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Toyota toyota = new Toyota(30, 40);
        doCar(toyota);

        Mercedes mercedes = new Mercedes(40, 45);
        doCar(mercedes);

        Volkswagen volkswagen = new Volkswagen(35, 50);
        doCar(volkswagen);
    }
    private static void doCar(Car car) {
        System.out.println(car.getName() + ": " + car.getSpeed());
    }
}
