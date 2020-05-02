package com.kodilla.soap.repository;

import com.kodilla.library.soap.Book;
import com.kodilla.library.soap.Genre;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class Library {
    private static final Map<String, Book> books = new HashMap<>();

    @PostConstruct
    public void someBooks() {
        Book solaris = new Book();
        solaris.setSignature("L/132");
        solaris.setTitle("Solaris");
        solaris.setAuthor("Stanisław Lem");
        solaris.setYear(1961);
        solaris.setGenre(Genre.SCI_FI);
        books.put(solaris.getSignature(), solaris);

        Book wiedzmin = new Book();
        wiedzmin.setSignature("S/32");
        wiedzmin.setTitle("Wiedźmin");
        wiedzmin.setAuthor("Andrzej Sapkowski");
        solaris.setYear(2014);
        wiedzmin.setGenre(Genre.FANTASY);
        books.put(wiedzmin.getSignature(), wiedzmin);

        Book ai = new Book();
        ai.setSignature("K/220");
        ai.setTitle("Sztuczna inteligencja");
        ai.setAuthor("Jerry Kaplan");
        ai.setYear(2019);
        ai.setGenre(Genre.TECH);
        books.put(ai.getSignature(), ai);

        Book millennium = new Book();
        wiedzmin.setSignature("L/16");
        wiedzmin.setTitle("Millennium");
        wiedzmin.setAuthor("Stieg Larsson & David Lagercrantz");
        solaris.setYear(2011);
        wiedzmin.setGenre(Genre.CRIME);
        books.put(millennium.getSignature(), millennium);

    }

    public Book findBook(String signature) {
        Assert.notNull(signature, "You have to provide a book signature:");
        return books.get(signature);
    }
}