package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {

    Shop shop = new Shop();
    Order order000 = new Order(000, 139.99, LocalDate.of(2020, 03, 01), "martina");
    Order order001 = new Order(001, 24.98, LocalDate.of(2020, 03, 03), "franky");
    Order order002 = new Order(002, 99.00, LocalDate.of(2020, 03, 03), "kolobolo16");
    Order order003 = new Order(003, 13.50, LocalDate.of(2020, 03, 06), "kolobolo16");
    Order order004 = new Order(004, 100.00, LocalDate.of(2020, 03, 07), "nowak135");
    Order order005 = new Order(005, 2.16, LocalDate.of(2020, 03, 11), "someone_noone");
    Order order006 = new Order(006, 238.40, LocalDate.of(2020, 03, 24), "nowak135");


    @Test
    public void shouldAddOrderToShop() {
        int numberOfOrders = shop.getSize();
        assertEquals(7, numberOfOrders);
    }

    @Test
    public void shouldReturnNumberOfOrders() {
        System.out.println("Number of orders: " + shop.getSize());
    }

    @Test
    public void shouldSumPriceOfOrders() {
        System.out.println("Sum of orders : " + shop.sumOfOrdersPrice());
    }

    @Test
    public void shouldReturnOrdersFromRangeOfDates() {
        List<Order> ordersFromRangeOfDates;
        ordersFromRangeOfDates = shop.orderListBetweenDates(LocalDate.of(2020, 03, 03), LocalDate.of(2020, 03, 07));
        assertEquals(4, ordersFromRangeOfDates);
    }

    @Test
    public void shouldReturnOrdersFromRangeOfPrices() {
        List<Order> ordersFromRangeOfPrices;
        ordersFromRangeOfPrices = shop.orderListFromRangeOfPrices(2.00, 25.00);
        assertEquals(4, ordersFromRangeOfPrices);
    }

    @BeforeEach
    public void InitializeShop() {
        shop.addOrder(order000);
        shop.addOrder(order001);
        shop.addOrder(order002);
        shop.addOrder(order003);
        shop.addOrder(order004);
        shop.addOrder(order005);
        shop.addOrder(order006);
    }

    @AfterEach
    public void resetValued() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}
