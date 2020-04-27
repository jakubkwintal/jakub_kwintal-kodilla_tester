package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.LinkedList;
import java.util.List;

public class GeneralShapesListApplication {
    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();

        Square square = new Square(10.0); //utworzenie nowego obiektu i zapisanie go do zmiennej square
        shapes.add(square); // dodanie obiektu square do kolekcji
        shapes.add(new Circle(7.0));
        shapes.add(new Triangle(10.0, 4.0, 10.77));

        shapes.remove(1); // usuwanie okręgu
        shapes.remove(square); // usuwanie kwadratu za pomocą nazwy zmiennej square
        Triangle triangle = new Triangle(10.0, 4.0, 10.77); // utworzenie nowego obiektu, takiego Triangle jak wcześniej
        shapes.remove(triangle); // usunięcie triangle z kolekcji za pomocą nazwy nowo utworzonego obiektu (usuwa wszystkie takie same obiekty)
        // wymaga to jednak w klasie tego obiektu (tutaj Triangle) wygenerowanie metod equals i hashcode
        // obiekt można stworzyć i usunąć z kolekcji za jednym razem: shapes.remove(new Triangle(10.0, 4.0, 10.77));

        System.out.println(shapes.size()); // wyświetlenie rozmiaru kolekcji
        for (Shape shape: shapes) { // wyświetlenie aktualnej zawartości kolekcji
            System.out.println(shape + ", area: " + shape.getArea() + ", perimeter: " + shape.getPerimeter());
        }
    }
}
