package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    public Circle() {
        super(3, 0, 0);
    }

    @Override
    public double calculateArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public double calculateHypotenuse() {
        return 0;
    }


}