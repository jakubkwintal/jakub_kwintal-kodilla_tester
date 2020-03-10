package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = new Book("Tożsamość Bourne'a", "Robert Ludlum");
        Book book2 = new Book("Tożsamość Bourne'a", "Robert Ludlum");
        Book book3 = new Book("Tożsamość Bourne'a", "Robert Ludlum");

//        "Sprawdź, czy adresy utworzonych obiektów są takie same."
//        Wydaje mi się, że jeśli to będą dokładnie takie same obiekty,
//        to adres będzie ten sam. Ale nie jest...

        System.out.println(book1 == book2);

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println(book1.equals(book2));
        System.out.println(book2.equals(book3));
        System.out.println(book1.equals(book3));

    }
}
