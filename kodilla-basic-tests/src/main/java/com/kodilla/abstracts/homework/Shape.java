package com.kodilla.abstracts.homework;

public abstract class Shape {

    private double radius;
    private double width;
    private double height;

    public Shape(double radius, double width, double height) {
        this.radius = radius;
        this.width = width;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public abstract double calculateHypotenuse();
}


