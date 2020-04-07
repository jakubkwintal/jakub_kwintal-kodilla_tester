package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CarSelectorTestSuite {

    @Test
    public void testCarSelector() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Suv suv = context.getBean(Suv.class);
        //When
        String carType = suv.getCarType();
        //Then
        Assertions.assertEquals("Suv", carType);
    }

    @Test
    public void testLights() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Suv suv = context.getBean(Suv.class);
        //When
        boolean turnOnLights = suv.hasHeadlightsTurnedOn();
        //Then
        Assertions.assertEquals("SUV", turnOnLights);
    }

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
}