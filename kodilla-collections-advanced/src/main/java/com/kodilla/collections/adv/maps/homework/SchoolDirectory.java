package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();

        Principal kubiak = new Principal("Magdalena Kubiak");
        Principal strzelec = new Principal("Sławomir Strzelec");
        Principal kucinska = new Principal("Magdalena Kucińska");

        School alo = new School("Akademicie Liceum Ogólnokształcące", 27, 25, 30, 27, 43, 29, 26);
        School ps = new School("Szkoły Policealne", 14, 42, 7, 53, 11, 78, 23, 34, 15, 46);
        School lo = new School("Liceum dla Dorosłych", 27, 33, 63, 68, 43, 45, 28, 44);

        schools.put(kubiak, alo);
        schools.put(strzelec, ps);
        schools.put(kucinska, lo);

        for (Map.Entry<Principal, School> schoolsEntry : schools.entrySet()) {
            System.out.println(schoolsEntry.getKey().getNameOfPrincipal() + " - "
                    + schoolsEntry.getValue().getNameOfSchool()
                    + ", liczba uczniów: " + schoolsEntry.getValue().getSum());
        }
    }
}
