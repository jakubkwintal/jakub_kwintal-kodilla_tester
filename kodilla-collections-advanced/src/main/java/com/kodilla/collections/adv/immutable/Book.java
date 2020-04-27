package com.kodilla.collections.adv.immutable;

public class Book {
    protected String author; // pola traktowane jak prywatne ale z możliwością dostępu do nich z ewentualnych klas dziedziczących z Book;
    protected String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
