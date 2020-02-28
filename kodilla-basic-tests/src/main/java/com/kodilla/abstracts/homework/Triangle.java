package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    @Override
    public void Surface() {
        System.out.println("Pole trójkąta wynosi x.");
    }

    @Override
    public void Circuit() {
        System.out.println("Obwód trójkąta wynosi y.");
    }
}
