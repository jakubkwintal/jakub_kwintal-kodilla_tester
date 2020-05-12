package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] listOfCashMachines;
    private int size;
    private CashMachine cashMachine;


    public Bank() {

        this.listOfCashMachines = new CashMachine[0];
        this.size = 0;
        this.cashMachine = new CashMachine();

    }

    public CashMachine[] getListOfCashMachines() { // zwraca listę bankomatów
        return listOfCashMachines;
    }

    public void addCashMachine(CashMachine cashMachine) { // dodaje bankomat do banku
        this.size++;
        CashMachine[] actualListOfCashMachines = new CashMachine[this.size];
        System.arraycopy(listOfCashMachines, 0, actualListOfCashMachines, 0, listOfCashMachines.length);
        actualListOfCashMachines[this.size - 1] = cashMachine;
        this.listOfCashMachines = actualListOfCashMachines;
    }

    public int getSumFromAllCashMachines() {
        int sum = 0;
        for (int i = 0; i < this.listOfCashMachines.length; i++) {
            sum += this.listOfCashMachines[i].getSum();
        }
        return sum;
    }

    public int getNumberOfAllWithdrawals() {
        int number = 0;
        for (int i = 0; i < this.listOfCashMachines.length; i++) {
            number += this.listOfCashMachines[i].getNumberOfWithdrawals();
        }
        return number;
    }

    public int getNumberOfAllDeposits() {
        int number = 0;
        for (int i = 0; i < this.listOfCashMachines.length; i++) {
            number += this.listOfCashMachines[i].getNumberOfDeposits();
        }
        return number;
    }

    public double getAllWithdrawalAverage() {
        double sum = 0;
        for (int i = 0; i < this.listOfCashMachines.length; i++) {
            sum += this.listOfCashMachines[i].getSumOfWithdrawals();
        }
        return sum / getNumberOfAllWithdrawals();
    }

    public double getAllDepositAverage() {
        double sum = 0;
        for (int i = 0; i < this.listOfCashMachines.length; i++) {
            sum += this.listOfCashMachines[i].getSumOfDeposits();
        }
        return sum / getNumberOfAllDeposits();
    }
}
