package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        BookManager bookManager = new BookManager();

        bookManager.createBook("The Bourne Legacy", "Robert Ludlum");
        bookManager.createBook("The Bourne Legacy", "Robert Ludlum");
        bookManager.createBook("Hobbit", "J.R.R. Tolkien");
        bookManager.createBook("Mikołajek", "Rene Goscinny");
        bookManager.createBook("Biuro Zarządzania Projektami", "Paweł Wyrozębski");

        System.out.println("--------------------------------------");

        bookManager.myLibrary(); // wyświetla kolekcję książek (bez powtórzeń)

        System.out.println("--------------------------------------");

        bookManager.howManyBooks(); // wyświetla wielkość kolekcji

        for (Book book : bookManager.books) { // porównuje adresy książek - i tu jest problem bo porównuje również książkę z sobą samą;
            for (Book book1 : bookManager.books)
                if (book == book1) { // == użyte do porównania adresów
                    System.out.println("\"" + book.getTitle() + "\"" + " i " + "\"" + book1.getTitle() + "\"" + " mają takie same adresy");
                } else {
                    System.out.println("\"" + book.getTitle() + "\"" + " i " + "\"" + book1.getTitle() + "\"" + " mają różne adresy");
                }
        }

        // STARA WERSJA:
//        Book book1 = bookManager.createBook("The Bourne Legacy", "Robert Ludlum");
//        Book book2 = bookManager.createBook("The Bourne Legacy", "Robert Ludlum");
//        Book book3 = bookManager.createBook("Hobbit", "J.R.R. Tolkien");
//
//        System.out.println(book1.equals(book2));
//        System.out.println(book1.hashCode());
//        System.out.println(book2.hashCode());


    }
}