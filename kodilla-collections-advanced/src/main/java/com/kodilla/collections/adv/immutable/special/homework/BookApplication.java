package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        BookManager bookManager = new BookManager();

        Book book1 = bookManager.createBook("The Bourne Legacy", "Robert Ludlum");
        Book book2 = bookManager.createBook("The Bourne Legacy", "Robert Ludlum");
        Book book3 = bookManager.createBook("Hobbit", "J.R.R. Tolkien");
        Book book4 = bookManager.createBook("Mikołajek", "Rene Goscinny");

        System.out.println("--------------------------------------");
        // sprawdzenie czy adresy książek są takie same
        System.out.println("ADDRESS COMPARISON:");
        System.out.print("book1 & book2: ");
        System.out.println(book1 == book2);
        System.out.print("book1 & book3: ");
        System.out.println(book1 == book3);
        System.out.print("book1 & book4: ");
        System.out.println(book1 == book4);
        System.out.print("book2 & book3: ");
        System.out.println(book2 == book3);
        System.out.print("book2 & book4: ");
        System.out.println(book2 == book4);
        System.out.print("book3 & book4: ");
        System.out.println(book3 == book4);

        System.out.println("--------------------------------------");

        System.out.println("MOJA KOLEKCJA KSIĄŻEK");
        bookManager.myLibrary(); // wyświetla kolekcję książek (bez powtórzeń)

        System.out.println("--------------------------------------");

        bookManager.howManyBooks(); // wyświetla wielkość kolekcji

    }
}
