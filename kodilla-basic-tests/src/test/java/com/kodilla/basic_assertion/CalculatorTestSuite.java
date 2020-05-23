package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    Calculator calculator = new Calculator();
    int a = 5;
    int b = 8;

    @Test
    public void testSum() {
        int result = calculator.sum(a, b);
        assertEquals(13, result);
    }

    @Test
    public void testSubstract() {
        int result = calculator.substract(a, b);
        assertEquals(-3, result);
    }

    @Test
    public void testSquare() {
        int result = calculator.square(a);
        assertEquals(25, result);
    }

}