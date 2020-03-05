package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();

        Principal kubiak = new Principal("Magdalena Kubiak", "Akademicie Liceum Ogólnokształcące");
        Principal strzelec = new Principal("Sławomir Strzelec", "Szkoły Policealne");
        Principal kucinska = new Principal("Magdalena Kucińska", "Liceum dla Dorosłych");

        School alo = new School(23, 26);
        School policealne = new School(45, 53, 11, 78, 23, 34, 15, 46);
        School lo = new School(34, 63, 68, 43, 45, 28, 44);

        schools.put(kubiak, alo);
        schools.put(strzelec, policealne);
        schools.put(kucinska, lo);

        for (Map.Entry<Principal, School> schoolsEntry : schools.entrySet()) {
            System.out.println(schoolsEntry.getKey().getNameOfPrincipal() + " - "
                    + schoolsEntry.getKey().getNameOfSchool()
                    + ", liczba uczniów: " + schoolsEntry.getValue().getSum());
        }
    }
}
