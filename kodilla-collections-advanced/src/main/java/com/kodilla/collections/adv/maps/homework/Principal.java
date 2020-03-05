package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String nameOfPrincipal;
    private String nameOfSchool;

    public Principal(String nameOfPrincipal, String nameOfSchool) {
        this.nameOfPrincipal = nameOfPrincipal;
        this.nameOfSchool = nameOfSchool;
    }

    public String getNameOfPrincipal() {
        return nameOfPrincipal;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(nameOfPrincipal, principal.nameOfPrincipal) &&
                Objects.equals(nameOfSchool, principal.nameOfSchool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfPrincipal, nameOfSchool);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "nameOfPrincipal='" + nameOfPrincipal + '\'' +
                ", nameOfSchool='" + nameOfSchool + '\'' +
                '}';
    }
}
