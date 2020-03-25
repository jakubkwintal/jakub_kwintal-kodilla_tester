package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    List<Order> orders = new ArrayList<>();

    //    metoda wstawiająca zamówienie
    public void addOrder(Order order) {
        this.orders.add(order);
    }

    // metoda zwracająca liczbę zamówień
    public int getSize() {
        return this.orders.size();
    }

    //    metoda sumująca wartość zamówień
    public double sumOfOrdersPrice() {
        double sum = 0;
        for (Order order : orders) sum += order.getPrice();
        return sum;
    }

//    metoda zwracająca zamówienia z zakresu dat

    public List<Order> orderListBetweenDates(LocalDate firstDate, LocalDate secondDate) {
        return orders.stream().filter(order -> order.getDate().isAfter(firstDate.minusDays(1))
                && order.getDate().isBefore(secondDate.plusDays(1))).collect(Collectors.toList());
    }

    //    metoda filtrująca zamówienia pod względem zakresu ceny
    public void orderListFromRangeOfPrices(double lowestPrice, double highestPrice) {
        double i = 0.00;
        while (lowestPrice <= highestPrice) {i++;}
    }
}