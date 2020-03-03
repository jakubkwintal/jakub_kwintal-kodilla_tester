package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Triangle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Square;

import java.util.Random;

public class ShapeApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Shape[] shapes = new Shape[random.nextInt(20) + 1];
        for (int n = 0; n < shapes.length; n++)
            shapes[n] = drawShape();
        for (Shape shape : shapes)
            ShapeUtils.displayShapeInfo(shape);
    }

    private static Shape drawShape() {
        Random random = new Random();
        int drawnShapeKind = random.nextInt(3);
        double a = random.nextDouble() * 100 + 1;
        // dlaczego daje to wartość z zakresu 1.000 - 100.999... (w nawiasie nic nie ma)
        double b = random.nextDouble() * 100 + 1;
        double c = random.nextDouble() * 100 + 1;
        if (drawnShapeKind == 0)
            return new Circle(a);
        else if (drawnShapeKind == 1)
            return new Square(a);
        else
            return new Triangle(a, b, c);
    }
}
