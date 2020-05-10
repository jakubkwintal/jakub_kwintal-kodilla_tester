package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square() {
        super(0, 7, 0);
    }

    @Override
    public double calculateArea() {
        return 4 * getWidth();
    }

    @Override
    public double calculatePerimeter() {
        return getWidth() * getWidth();
    }

    @Override
    public double calculateHypotenuse() {
        return 0;
    }


}