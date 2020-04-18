package com.kodilla.bank.homework;

// tablica ze zrealizowanymi transakcjami
// (liczbowa wartość dodatnia, jeśli użytkownik wpłacił pieniądze,
// ujemna jeśli użytkownik wypłacił pieniądze).
//
// Metody zwracające saldo bankomatu oraz liczbę wykonanych transakcji.


public class CashMachine {


    private int[] transactions;
    private int size;

    public CashMachine() {
        this.size = 0; // pozycja wyjściowa: wielkość tabeli równa 0
        this.transactions = new int[0]; // pozycja wyjściowa: tabela bez rekordów
    }

    public void addTransaction(int transaction) { // dodaje transakcję do tabeli;
        // nie jest ustalona wielkość tabeli i gdy dodaje nowy rekord, tworzy nową tabelę (bankomat)
        // i do niej kopiuje wszystkie rekordy starej t. oraz wstawia ten nowy rekord.

        this.size++;
        int[] newCashMachine = new int[this.size];
        System.arraycopy(transactions, 0, newCashMachine, 0, transactions.length);
        newCashMachine[this.size - 1] = transaction; // nowa transakcja o indeksie [this.size -1] (bo liczymy indexy od 0)
        this.transactions = newCashMachine;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getSize() { // liczba transakcji
        return size;
    }

    public double getAverage() { // średnia wartość jednej transakcji
        if (this.transactions.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum / this.transactions.length;
    }

    public int getSum() { // wartość wszystkich traksakcji z jednego bankomatu
        if (this.transactions.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum;
    }
}