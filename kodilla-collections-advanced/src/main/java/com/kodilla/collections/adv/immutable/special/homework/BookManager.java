package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    public void createBook(String title, String author) {

//        "Zmodyfikuj klasę BookManager tak, aby podczas tworzenia obiektów klasy Book
//        klasa ta sprawdzała, czy dany obiekt klasy Book już istnieje
//        (o takim samym tytule i autorze). W tym celu musisz wyposażyć klasę BookManager
//        w kolekcję utworzonych dotychczas obiektów klasy Book." Nie łapię

        List<Book> books = new ArrayList<>();

        Book book1 = new Book("Tożsamość Bourne'a", "Robert Ludlum");
        Book book2 = new Book("Tożsamość Bourne'a", "Robert Ludlum");
        Book book3 = new Book("Tożsamość Bourne'a", "Robert Ludlum");

    }
}
