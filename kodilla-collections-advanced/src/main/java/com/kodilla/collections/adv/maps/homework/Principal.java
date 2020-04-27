package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String nameOfPrincipal;


    public Principal(String nameOfPrincipal) {
        this.nameOfPrincipal = nameOfPrincipal;
    }

    public String getNameOfPrincipal() {
        return nameOfPrincipal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(nameOfPrincipal, principal.nameOfPrincipal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfPrincipal);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "nameOfPrincipal='" + nameOfPrincipal + '\'' +
                '}';
    }
}
