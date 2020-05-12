package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankTest {

    Bank bank = new Bank();
    CashMachine cashMachine1 = new CashMachine();
    CashMachine cashMachine2 = new CashMachine();
    CashMachine cashMachine3 = new CashMachine();

    @BeforeEach
    public void addCashMachinesAndTransactions() {

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        cashMachine1.addTransaction(197);
        cashMachine1.addTransaction(-100);
        cashMachine1.addTransaction(50);
        cashMachine1.addTransaction(-20);
        cashMachine1.addTransaction(-15);
        cashMachine1.addTransaction(-50);
        cashMachine1.addTransaction(350);

        cashMachine2.addTransaction(200);
        cashMachine2.addTransaction(250);
        cashMachine2.addTransaction(-450);
        cashMachine2.addTransaction(-140);
        cashMachine2.addTransaction(35);

        cashMachine3.addTransaction(-95);
        cashMachine3.addTransaction(90);
        cashMachine3.addTransaction(-50);
        cashMachine3.addTransaction(400);
        cashMachine3.addTransaction(-25);
        cashMachine3.addTransaction(-50);
    }

    @Test
    void shouldGetListOfCashMachines() {

        CashMachine[] listOfCashMachines = bank.getListOfCashMachines();
        for (int i = 0; i < listOfCashMachines.length; i++)
            System.out.println(listOfCashMachines[i]);
        assertEquals(3, listOfCashMachines.length);
    }

    @Test
    void shouldGetListOfAllTransactions() {
        System.out.println("CashMachine 1: ");
        int[] transactions1 = cashMachine1.getTransactions();
        for (int i = 0; i < transactions1.length; i++)
            System.out.println(transactions1[i]);

        System.out.println("CashMachine 2: ");
        int[] transactions2 = cashMachine2.getTransactions();
        for (int i = 0; i < transactions2.length; i++)
            System.out.println(transactions2[i]);

        System.out.println("CashMachine 3: ");
        int[] transactions3 = cashMachine3.getTransactions();
        for (int i = 0; i < transactions3.length; i++)
            System.out.println(transactions3[i]);
    }

    @Test
    void getSumFromAllCashMachines() {
        int sumFromAllCashMachines = bank.getSumFromAllCashMachines();
        System.out.println(sumFromAllCashMachines);
        assertEquals(577, sumFromAllCashMachines);
    }

    @Test
    void getNumberOfAllWithdrawals() {
        int numberOfAllWithdrawals = bank.getNumberOfAllWithdrawals();
        System.out.println(numberOfAllWithdrawals);
        assertEquals(10, numberOfAllWithdrawals);
    }

    @Test
    void getNumberOfAllDeposits() {
        int numberOfAllDeposits = bank.getNumberOfAllDeposits();
        System.out.println(numberOfAllDeposits);
        assertEquals(8, numberOfAllDeposits);
    }

    @Test
    void getAllWithdrawalAverage() {
        double allWithdrawalAverage = bank.getAllWithdrawalAverage();
        System.out.println(allWithdrawalAverage);
        assertEquals(-99.5, allWithdrawalAverage);
    }

    @Test
    void getAllDepositAverage() {
        double allDepositAverage = bank.getAllDepositAverage();
        System.out.println(allDepositAverage);
        assertEquals(196.5, allDepositAverage);
    }
}