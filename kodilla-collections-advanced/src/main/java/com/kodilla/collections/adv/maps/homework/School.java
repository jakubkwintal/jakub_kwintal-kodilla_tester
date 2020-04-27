package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private String nameOfSchool;
    private List<Integer> classes = new ArrayList<>();

    public School(String nameOfSchool, Integer... classes) {
        this.nameOfSchool = nameOfSchool;
        for (int studentClass : classes) this.classes.add(studentClass);
    }


    public Integer getSum() {
        int sum = 0;
        for (int studentInClass : classes)
            sum += studentInClass;
        return sum;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public List<Integer> getClasses() {
        return classes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(nameOfSchool, school.nameOfSchool) &&
                Objects.equals(classes, school.classes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfSchool, classes);
    }

    @Override
    public String toString() {
        return "School{" +
                "nameOfSchool='" + nameOfSchool + '\'' +
                ", classes=" + classes +
                '}';
    }
}
