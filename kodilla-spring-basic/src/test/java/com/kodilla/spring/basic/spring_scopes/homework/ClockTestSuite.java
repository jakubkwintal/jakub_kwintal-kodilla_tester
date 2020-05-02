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
        Clock clock1 = context.getBean(Clock.class);
        Clock clock2 = context.getBean(Clock.class);
        Clock clock3 = context.getBean(Clock.class);

        LocalTime time1 = clock1.getTime();
        LocalTime time2 = clock2.getTime();
        LocalTime time3 = clock3.getTime();

//        Assertions.assertNotEquals(time1, time2);
//        Assertions.assertNotEquals(time2, time3);
        Assertions.assertNotEquals(time1, time3);

//        System.out.println(time1 + ",");
    }
}