package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("2020/03/132"));
        warehouse.addOrder(new Order("2020/03/133"));
        warehouse.addOrder(new Order("2020/03/134"));
        warehouse.addOrder(new Order("2020/02/135"));

        try {
            warehouse.getOrder("2020/03/133");
        } catch (OrderDoesntExistException e) {
            System.out.println("Unfortunately, the order with the given number doesn't exist.");
        } finally {
            System.out.println("Have a good day!");
        }

    }
}