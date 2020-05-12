package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;
    private int size;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }

    public void addTransaction(int transaction) {

        this.size++;
        int[] actualCashMachine = new int[this.size];
        System.arraycopy(transactions, 0, actualCashMachine, 0, transactions.length);
        actualCashMachine[this.size - 1] = transaction;
        this.transactions = actualCashMachine;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getSize() { // liczba transakcji
        return size;
    }

    public int getSum() {
        int sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum;
    }

    public int getNumberOfWithdrawals() {
        int number = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] < 0)
                number++;
        }
        return number;
    }

    public int getNumberOfDeposits() {
        int number = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] > 0)
                number++;
        }
        return number;
    }

    public double getSumOfWithdrawals() {
        if (getNumberOfWithdrawals() == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] < 0)
                sum += this.transactions[i];
        }
        return sum;
    }

    public double getSumOfDeposits() {
        if (getNumberOfDeposits() == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] > 0)
                sum += this.transactions[i];
        }
        return sum;
    }
}