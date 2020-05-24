package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    List<Book> books = new ArrayList<>();

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);
        if (books.contains(book)) {
            System.out.println("Już mam książkę " + book.getTitle() + " autorstwa " + book.getAuthor() + ". Mogę mieć kolejną.");
            books.add(book);
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