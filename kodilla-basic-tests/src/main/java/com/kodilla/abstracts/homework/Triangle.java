package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    public Triangle() {
        super(0, 3, 4);
    }

    @Override
    public double calculateArea() {
        return getWidth()*getHeight()/2;
    }

    @Override
    public double calculatePerimeter() {
        return getWidth()+getHeight()+(Math.sqrt(getWidth()*getWidth()+getHeight()*getHeight()));
    }

    public double calculateHypotenuse() {
        return Math.sqrt(getWidth()*getWidth()+getHeight()*getHeight());
    }

}