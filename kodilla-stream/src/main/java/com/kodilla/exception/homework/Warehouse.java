package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws Exception {
        Order order = orders
                .stream()
                .filter(o -> o.getNumber().equals(number))
// .findFirst().orElseThrow(OrderDoesntExistsException::new);
// .findFirst().orElseThrow(() -> new OrderDoesntExistsException());
// .findFirst().orElseThrow(() -> new Exception("Moj blad"));
                .findFirst().orElseThrow(Exception::new);


        System.out.println("Your order number: " + order.getNumber());
        return order;
    }
}


//package com.kodilla.exception.homework;
//
//        import java.util.ArrayList;
//        import java.util.List;
//
//public class Warehouse {
//    List<Order> orders = new ArrayList<>();
//
//    public void addOrder(Order order) {
//        orders.add(order);
//    }
//
//    public Order getOrder(String number) throws Exception {
//        return orders
//                .stream()
//                .filter(o -> o.getNumber().equals(number))
//// .findFirst().orElseThrow(OrderDoesntExistsException::new);
//// .findFirst().orElseThrow(() -> new OrderDoesntExistsException());
//// .findFirst().orElseThrow(() -> new Exception("Moj blad"));
//                .findFirst().orElseThrow(Exception::new);
//
//
//// System.out.println("Your order number: " + order.getNumber());
//// return order;
//    }
//}