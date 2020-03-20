package com.kodilla.exception;

public class FirstExample {
    public static void main(String[] args) {
        String username = "Willy Wonka Rules";
//String username = null;
//String username = "John";
        String[] nameParts = username.split(" ");
        System.out.println("First name: " + nameParts[0]);
        System.out.println("Last name: " + nameParts[1]);
        System.out.println("What does he usually do:" + nameParts[2]);

    }
}
