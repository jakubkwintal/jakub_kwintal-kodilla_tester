package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        Order order = orders
                .stream()
                .filter(o -> o.getNumber().equals(number))
                .findFirst().orElseThrow(OrderDoesntExistException::new);
//  Alternatywy:
// .findFirst().orElseThrow(Exception::new);
// .findFirst().orElseThrow(() -> new OrderDoesntExistsException());
// .findFirst().orElseThrow(() -> new Exception("Moj blad"));

        System.out.println("Your order number: " + order.getNumber());
        return order;
    }
}