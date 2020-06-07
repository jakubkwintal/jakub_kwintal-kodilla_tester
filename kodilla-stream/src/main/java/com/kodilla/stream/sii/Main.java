package com.kodilla.stream.sii;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> newCarList = Garage.getCarsList()
                .stream()
                .filter(u -> u.getYear() < 2020)
                .map(un -> un.getModel())
                .collect(Collectors.toList());
        System.out.println(newCarList);

    }

}