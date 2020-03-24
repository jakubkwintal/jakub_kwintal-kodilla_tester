package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InvoiceTestSuite {

    Invoice invoiceTest = new Invoice();
    Item wardrobe = new Item("Szafa", 1700.00);
    Item bed = new Item("Lóżko", 900.00);
    Item lamp = new Item("Lampka nocna", 230.00);

    @Test
    public void shoulAddItemsToInvoice() {
//    when
        int numberOfItems = invoiceTest.getSize();

//    then

        assertEquals(3, numberOfItems);
    }

    @Test
    public void shouldCheckItem() {
//      when
        Item someItem = invoiceTest.getItem(0);

//        then
        assertEquals("Szafa", someItem.getName());
        assertEquals(1700.00, someItem.getPrice());
    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex() {
//        when
        Item someItem = invoiceTest.getItem(5);
//        then
        assertNull(someItem);
    }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {
//        when
        Item someItem = invoiceTest.getItem(-1);

//        then
        assertNull(someItem);
    }

    @Test
    public void cleanInvoice() {
//        when
        invoiceTest.clear();

//        then
        assertEquals(0, invoiceTest.getSize());
    }

    @BeforeEach
    public void initializeInvoice() {
        invoiceTest.addItem(wardrobe);
        invoiceTest.addItem(bed);
        invoiceTest.addItem(lamp);
    }

    @AfterEach
    public void resetValues() {
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
