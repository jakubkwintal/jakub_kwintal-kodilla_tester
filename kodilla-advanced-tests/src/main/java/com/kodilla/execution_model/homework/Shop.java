package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }    //  metoda wstawiająca zamówienie

    public int getSize() {
        return this.orders.size();
    }     //  metoda zwracająca liczbę zamówień

    public double sumOfOrdersPrice() {    //  metoda sumująca wartość zamówień
        double sum = 0;
        for (Order order : orders) sum += order.getPrice();
        return sum;
    }

    public List<Order> orderListBetweenDates(LocalDate firstDate, LocalDate secondDate) {    //  metoda zwracająca zamówienia z zakresu dat
        return orders.stream().filter(order -> order.getDate().isAfter(firstDate.minusDays(1))
                && order.getDate().isBefore(secondDate.plusDays(1))).collect(Collectors.toList());
    }

    public List<Order> orderListFromRangeOfPrices(double lowestPrice, double highestPrice) {     //  metoda filtrująca zamówienia pod względem zakresu ceny
        return orders.stream().filter(order -> (order.getPrice() >= lowestPrice && order.getPrice() <= highestPrice)).collect(Collectors.toList());

    }
}