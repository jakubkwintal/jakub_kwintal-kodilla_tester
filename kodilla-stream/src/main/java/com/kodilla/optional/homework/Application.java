package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Wojtek", new Teacher("Pani Rzepka"))); // tworzę obiekt teacher
        students.add(new Student("Marysia", new Teacher("Pan Domek")));
        students.add(new Student("Franek", new Teacher(null)));
        students.add(new Student("Krysia", new Teacher("Pani Kwiecień")));
        students.add(new Student("Antek", new Teacher(null)));

        for (Student student : students) { // z listy students wyświetl studentów z klasy Student.
            System.out.println("Student: " + student.getName() + " / Nauczyciel: "  + student.getTeacher());
        }
    }
}