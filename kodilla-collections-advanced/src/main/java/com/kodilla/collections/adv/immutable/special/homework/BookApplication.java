package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        Book book1 = new BookManager().createBook("Tożsamość Bourne'a","Robert Ludlum");
        Book book2 = new BookManager().createBook("Tożsamość Bourne'a","Robert Ludlum");
        Book book3 = new BookManager().createBook("Tożsamość Bourne'a","Robert Ludlum");

        System.out.println(book1 == book2);
        System.out.println(book1 == book3);

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book1 == book3);
        System.out.println(book1 == book3);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println(book1.equals(book2));
        System.out.println(book2.equals(book3));
        System.out.println(book1.equals(book3));

    }
}
