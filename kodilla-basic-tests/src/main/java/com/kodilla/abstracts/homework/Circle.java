package com.kodilla.abstracts.homework;

public class Circle extends Shape{
    @Override
    public void Surface() {
        System.out.println("Pole okręgu wynosi x.");
    }

    @Override
    public void Circuit() {
        System.out.println("Obwód okręgu wynosi y.");
    }
}
