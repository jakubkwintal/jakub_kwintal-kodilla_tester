package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        BookManager bookManager = new BookManager();

//        bookManager.createBook("The Bourne Legacy", "Robert Ludlum");
//        bookManager.createBook("The Bourne Legacy", "Robert Ludlum");
//        bookManager.createBook("Hobbit", "J.R.R. Tolkien");

        Book book1 = bookManager.createBook("The Bourne Legacy", "Robert Ludlum");
        Book book2 = bookManager.createBook("The Bourne Legacy", "Robert Ludlum");
        Book book3 = bookManager.createBook("Hobbit", "J.R.R. Tolkien");

        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

        bookManager.howManyBooks();
    }
}