//package com.kodilla.execution_model.homework;
//
//import java.time.LocalDate;
//import java.time.ZonedDateTime;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Shop {
//
//    List<Order> orders = new ArrayList<>();
////    private ZonedDateTime firstDate;
////    private ZonedDateTime secondDate;
//
//    //    metoda wstawiająca zamówienie
//    public void addOrder(Order order) {
//        this.orders.add(order);
//    }
//
//    // metoda zwracająca liczbę zamówień
//    public int getSize() {
//        return this.orders.size();
//    }
//
//    //    metoda sumująca wartość zamówień
//    public double sumOfOrdersPrice() {
//        double sum = 0;
//        for (Order order : orders) sum += order.getPrice();
//        return sum;
//
//    }
//
//    public List<Order> orderListBetweenDates(LocalDate firstDate, LocalDate secondDate){
//        return orders.stream().filter(order -> order.getDate().isAfter(firstDate) && order.getDate().isBefore(secondDate)).collect(Collectors.toList())
//    }
//
//
//    //    metoda filtrująca zamówienia pod wzglęsem zakresu dat
////    public void getOrderFromRangeOfTime(LocalDate dateOfOrder) {
////        if (firstDate.isBefore(ChronoZonedDateTime.from(dateOfOrder)) && secondDate.isAfter(ChronoZonedDateTime.from(dateOfOrder)));
////        {
////            return;
////
////    }
//
//
////    metoda filtrująca zamówienia pod względem zakresu ceny
////    public void getOrderFromRangeOfPrice(double priceOfOrder) {
////            if (priceOfOrder >= )
////        }
//
//
//}
