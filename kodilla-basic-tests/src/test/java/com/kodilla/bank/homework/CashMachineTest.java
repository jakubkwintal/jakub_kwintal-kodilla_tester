package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashMachineTest {

    CashMachine cashMachine = new CashMachine();

    @BeforeEach
    public void initializeTransactions() {
        cashMachine.addTransaction(197);
        cashMachine.addTransaction(-97);
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(-17);
        cashMachine.addTransaction(-15);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(335);
    }

    @Test
    void shouldGetTransactions() {
        int[] transactions = cashMachine.getTransactions();
        for (int i = 0; i < transactions.length; i++)
            System.out.println(transactions[i]);

        assertEquals(7, transactions.length);
        assertEquals(197, transactions[0]);
        assertEquals(-97, transactions[1]);
        assertEquals(50, transactions[2]);
        assertEquals(-17, transactions[3]);
        assertEquals(-15, transactions[4]);
        assertEquals(-50, transactions[5]);
        assertEquals(335, transactions[6]);
    }

    @Test
    void getSize() {

        int numberOfTransactions = cashMachine.getSize();
        System.out.println("Number of transactions: " + numberOfTransactions);
        assertEquals(7, numberOfTransactions);
    }

    @Test
    void getSum() {

        int sumOfTransactions = cashMachine.getSum();
        System.out.println("Sum of transactions: " + sumOfTransactions);
        assertEquals(403, sumOfTransactions);
    }

    @Test
    void getNumberOfWithdrawals() {

        int numberOfWithdrawals = cashMachine.getNumberOfWithdrawals();
        System.out.println("Number of withdrawals: " + numberOfWithdrawals);
        assertEquals(4, numberOfWithdrawals);
    }

    @Test
    void getNumberOfDeposits() {

        int numberOfDeposits = cashMachine.getNumberOfDeposits();
        System.out.println("Number of deposits: " + numberOfDeposits);
        assertEquals(3, numberOfDeposits);
    }

    @Test
    void getSumOfWithdrawals() {

        double withdrawalAverage = cashMachine.getSumOfWithdrawals();
        System.out.println("Average of withdrawals is: " + withdrawalAverage);
        assertEquals(-179, withdrawalAverage);
    }

    @Test
    void getSumOfDeposits() {

        double depositAverage = cashMachine.getSumOfDeposits();
        System.out.println("Average of deposits is: " + depositAverage);
        assertEquals(582.0, depositAverage);
    }
}