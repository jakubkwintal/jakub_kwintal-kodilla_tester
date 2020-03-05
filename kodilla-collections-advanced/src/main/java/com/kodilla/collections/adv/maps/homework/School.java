package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> numberOfStudents = new ArrayList<>();

    public School(Integer... numberOfStudents) {
        for (int studentClass : numberOfStudents) this.numberOfStudents.add(studentClass);
    }

    public Integer getSum() {
        int sum = 0;
        for (int studentClass : numberOfStudents)
            sum += studentClass;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "numberOfStudents=" + numberOfStudents +
                '}';
    }
}
