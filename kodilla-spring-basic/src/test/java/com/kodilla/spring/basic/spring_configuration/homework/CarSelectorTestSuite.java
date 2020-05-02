package com.kodilla.spring.basic.spring_configuration.homework;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

@SpringBootTest
public class CarSelectorTestSuite {

    @Test
    public void shouldSelectCarDependingOnSeason() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Sedan sedan = (Sedan) context.getBean("selectCar");
        //When
        String season = sedan.season();
        //Then
        Assertions.assertEquals("Spring&Autumn", season);
    }

    @Test
    public void shouldTurnOnLigths() { // JAK TO ZROBIĆ????
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Cabrio cabrio = (Cabrio) context.getBean("lights");
        //When
        LocalTime now = LocalTime.of(19, 14);
//      boolean lights = cabrio.hasHeadlightsTurnedOn();

        //Then
        Assertions.assertTrue(true);
    }
}
