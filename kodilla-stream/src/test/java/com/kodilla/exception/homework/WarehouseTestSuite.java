package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;


public class WarehouseTestSuite {

    // given
    Warehouse warehouse = new Warehouse();
    {
        warehouse.addOrder(new Order("2020/03/132"));
        warehouse.addOrder(new Order("2020/03/133"));
        warehouse.addOrder(new Order("2020/03/134"));
        warehouse.addOrder(new Order("2020/02/135"));
    }

    @Test
    public void testIsOrderExist() throws OrderDoesntExistException {
        // when

        Order isOrderExist = warehouse.getOrder("2020/03/132");
        // then
        assertTrue(true);
    }

    @Test(expected = OrderDoesntExistException.class)
    public void testIsOrderExist_withException() throws OrderDoesntExistException {
        // when
        Order isOrderExist = warehouse.getOrder("2020/03/999");
        // then
        assertFalse(false); // asercja nie zostanie wykonana - test zostanie przerwany zaraz po rzuceniu wyjątku;
    }
}