package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Display {

    public String display(double add, double substract, double multiply, double divide) { // metoda wyświetlająca wartość na ekranie konsoli
        return "Wynik dodawania: " + add
                + ", wynik odejmowania: " + substract
                + ", wynik mnożenia: " + multiply
                + ", wynik dzielenia: " + divide;
    }
}