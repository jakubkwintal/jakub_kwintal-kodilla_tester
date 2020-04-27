package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

@SpringBootTest
public class ClockTestSuite {

    @Test
    public void shouldReturnActualTime() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstTime = context.getBean(Clock.class);
        Clock secondTime = context.getBean(Clock.class);
        Clock thirdTime = context.getBean(Clock.class);

        LocalTime time1 = firstTime.getTime();
        LocalTime time2 = secondTime.getTime();
        LocalTime time3 = thirdTime.getTime();

        Assertions.assertEquals(firstTime, secondTime);
        Assertions.assertEquals(secondTime, thirdTime);
        Assertions.assertEquals(firstTime, thirdTime);

    }
}