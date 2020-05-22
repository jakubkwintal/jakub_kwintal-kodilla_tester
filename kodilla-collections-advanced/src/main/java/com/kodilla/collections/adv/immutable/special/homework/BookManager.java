package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {
    Set<Book> books = new HashSet<>(); // może być też w klasie BookApplication

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);
        if (books.contains(book)) {
            System.out.println("Już mam książkę " + book.getTitle() + " autorstwa " + book.getAuthor() + ". Nie potrzebuję kolejnego egzemplarza.");
        } else {
            System.out.println("Nie miałem książki " + book.getTitle() + " autorstwa " + book.getAuthor() + ". Dzięki.");
            books.add(book);
        }
        return book;
    }

    public void howManyBooks() {
        System.out.println("Aktualnie posiadam " + books.size() + " książki.");
    }

    public void myLibrary() {
        for (Book book : books) {
            System.out.println(book.getAuthor() + ", " + book.getTitle());
        }
    }
}