package com.kodilla.execution_model.homework;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    List<Order> orders = new ArrayList<>();
//    private ZonedDateTime firstDate;
//    private ZonedDateTime secondDate;

    public void addOrder(Order order) {
        this.orders.add(order);
    }

//    metoda filtrująca zamówienia pod wzglęsem zakresu dat
//    public void getOrderFromRangeOfTime(LocalDate dateOfOrder) {
//        if (firstDate.isBefore(ChronoZonedDateTime.from(dateOfOrder)) && secondDate.isAfter(ChronoZonedDateTime.from(dateOfOrder)));
//        {
//            return;
//        }
//    }


//    metoda filtrująca zamówienia pod względem zakresu ceny
//    public void getOrderFromRangeOfPrice(double priceOfOrder) {
//            if (priceOfOrder >= )
//        }


// metoda zwracająca liczbę zamówień
        public int numberOfOrders() {return this.orders.size();}



//    metoda sumująca wartość zamówień
//    public void sumOfOrdersPrice(Order order) {
//        for (int i = 0; i < orders.size(); i++) {
//
//
//            }

        }
