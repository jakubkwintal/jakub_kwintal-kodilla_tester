package com.kodilla.abstracts.homework;

public class Person {

    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public String getFirstName() { // nie przydał się
        return firstName;
    }

    public int getAge() {  // nie przydał się
        return age;
    }

    public Job getJob() { // nie przydał się
        return job;
    }

    public void employee() {
        System.out.println(firstName + "[" + age + "]" + " is a " + job + ". "
                + firstName + "'s responsibility is " + job.getResponsibilities());
    }
}