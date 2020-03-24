package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
    private int number;
    private double price;
    private LocalDate date;
    private String login;

    public Order(int number, double price, LocalDate date, String login) {
        this.number = number;
        this.price = price;
        this.date = date;
        this.login = login;
    }

    public int getNumber() {
        return number;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number=" + number +
                ", price=" + price +
                ", date=" + date +
                ", login='" + login + '\'' +
                '}';
    }
}
