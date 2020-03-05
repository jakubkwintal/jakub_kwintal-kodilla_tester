package com.kodilla.collections.adv.maps.complex;

import java.util.HashMap;
import java.util.Map;

public class ComplexMapExample {
    public static void main(String[] args) {
        Map<Student, Grades> school = new HashMap<>();

        Student anna = new Student("Anna", "Włodarczyk");
        Student tomasz = new Student("Tomasz", "Zawadzki");
        Student dominik = new Student("Dominik", "Kowalski");

        Grades annaGrades = new Grades(3.0, 2.5, 5.0, 3.5);
        Grades tomaszGrades = new Grades(2.5, 4.0, 2.0, 5.0);
        Grades dominikGrades = new Grades(4.0, 3.0, 3.5, 3.0);

        school.put(anna, annaGrades);
        school.put(tomasz, tomaszGrades);
        school.put(dominik, dominikGrades);

        System.out.println(school.get(anna));

        for (Map.Entry<Student, Grades> studentEntry : school.entrySet()) {
            System.out.println(studentEntry.getKey().getFirstname() + ", average: "
                    + studentEntry.getValue().getAverage());
        }
    }
}
