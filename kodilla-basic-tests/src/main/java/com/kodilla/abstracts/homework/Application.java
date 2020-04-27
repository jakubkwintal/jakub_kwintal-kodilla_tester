package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        System.out.println("FIRST PART OF EXERCISE");
        System.out.println(" ");
        Shape square = new Square();
        System.out.println("SQUARE");
        System.out.println("Area of this square is: " + square.calculateArea());
        System.out.println("Perimeter of this square is: " + square.calculatePerimeter());
        System.out.println(" ");

        Shape circle = new Circle();
        System.out.println("CIRCLE");
        System.out.println("Area of this circle is: " + circle.calculateArea());
        System.out.println("Perimeter of this circle is: " + circle.calculatePerimeter());
        System.out.println(" ");

        Shape triangle = new Triangle();
        System.out.println("TRIANGLE");
        System.out.println("Area of this triangle is: " + triangle.calculateArea());
        System.out.println("Perimeter of this triangle is: " + triangle.calculatePerimeter());
        System.out.println("Lengths of the sides of this triangle: " + triangle.getWidth() +
                ", " + triangle.getHeight() + ", " + triangle.calculateHypotenuse());

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("SECOND PART OF EXERCISE");
        System.out.println(" ");

        Job doctor = new Doctor();
        Person doctor1 = new Person("Marta", 27, doctor);
        Person doctor2 = new Person("Karol", 63, doctor);

        Job mechanic = new Mechanic();
        Person mechanic1 = new Person("Marek", 42, mechanic);
        Person mechanic2 = new Person("Wojciech", 21, mechanic);
        Person mechanic3 = new Person("Paweł", 54, mechanic);

        Job musician = new Musician();
        Person musician1 = new Person("Tomasz", 39, musician);
        Person musician2 = new Person("Martyna", 39, musician);
        Person musician3 = new Person("Ewa", 30, musician);

        doctor1.employee(); // wywołanie metody z "Person" wyświetlającej info o pracownikach
        doctor2.employee();
        mechanic1.employee();
        mechanic2.employee();
        mechanic2.employee();
        musician1.employee();
        musician2.employee();
        musician3.employee();

    }
}
