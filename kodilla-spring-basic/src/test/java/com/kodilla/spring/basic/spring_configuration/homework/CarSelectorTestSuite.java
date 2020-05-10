//package com.kodilla.spring.basic.spring_configuration.homework;
//
//
//import org.junit.Test;
//import org.junit.jupiter.api.Assertions;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import java.time.LocalTime;
//
//@SpringBootTest
//public class CarSelectorTestSuite {
//
//    @Test
//    public void shouldSelectCarDependingOnSeason() {
//        //Given
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Car car = (Car) context.getBean("selectCar");
//        //When
//        String summer = "Summer";
//        CarSelector carSelector = new CarSelector();
//        carSelector.season.equals(summer);
//        String carType = car.getCarType();
//        //Then
//        Assertions.assertEquals("Cabrio", carType);
//    }
//
//
//    @Test
//    public void shouldTurnOnLigths() {
//        //Given
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Sedan sedan = context.getBean(Sedan.class);
//        //When
//        sedan.now = LocalTime.of(5, 14);
//        System.out.println(sedan.now);
//        //Then
//        Assertions.assertTrue(sedan.hasHeadlightsTurnedOn());
//    }
//}
