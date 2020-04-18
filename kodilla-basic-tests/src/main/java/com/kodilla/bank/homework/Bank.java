package com.kodilla.bank.homework;

// tablica bankomatów

// metody:

//        liczbę transakcji związanych z wypłatą,
//        liczbę transakcji związaną z wpłatą pieniędzy,
//        średnią wartość wypłaty,
//        średnią wartość wpłaty.

public class Bank {

    CashMachine[] cashMachine;

    private int[] listOfCashMachines;
    private int numberOfCashMachines;
    private CashMachine oneCashMachine;

    public Bank() {

        this.listOfCashMachines = new int[0];
        this.numberOfCashMachines = 0;
        this.oneCashMachine = new CashMachine();


    }

    public void addCashMachine(int cashMachine) { // dodaje bankomat do banku
        this.numberOfCashMachines++;
        int[] actualListOfCashMachines = new int[this.numberOfCashMachines];
        System.arraycopy(listOfCashMachines, 0, actualListOfCashMachines, 0, listOfCashMachines.length);
        actualListOfCashMachines[this.numberOfCashMachines - 1] = cashMachine;
        this.listOfCashMachines = actualListOfCashMachines;
    }

    public void addSumFromOneCashMachine(int value) { // dodaje sumę z jednego bankomatu
        if (value != 0) {
            this.oneCashMachine.addTransaction(value);
        }
    }

    public int getSBalance() { // zwraca bilans banku (sumę ze wszystkich bankomatów)
        return this.oneCashMachine.getSum();
    }

    public int[] getListOfCashMachines() { // zwraca listę bankomatów
        return listOfCashMachines;
    }




//    public int[] getNumberOfWithdrawal() {
//        for (int i = 0; i < cashMachine.length; i++) {
//            if (cashMachine[i]. < 0) {
//
//            }
//        }
//    }


}
