package com.kodilla.spring.basic.spring_configuration.homework;


import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class CarSelectorTestSuite {


    @ParameterizedTest
    @CsvFileSource(resources = "/carTypeTestData.csv", numLinesToSkip = 1)
    public void shouldSelectCar(String season, String time, String carType, boolean lights) {
        //given
        LocalTime timeNow = LocalTime.parse(time);
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("selectCar", season, timeNow);
        //when
        String selectedCar = car.getCarType();
        boolean checkLights = car.hasHeadlightsTurnedOn();
        System.out.println(selectedCar);
        //then
        assertEquals(carType, selectedCar);
        assertEquals(lights, checkLights);
    }


    @Test
    public void shouldSelectCar2() {
//given
        LocalTime timeNow = LocalTime.parse("12:00");
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("selectCar", "Winter", timeNow);
//when
        String selectedCar = car.getCarType();
        boolean checkLights = car.hasHeadlightsTurnedOn();
//then
        assertEquals("SUV", selectedCar);
        assertEquals(true, checkLights);

    }


}