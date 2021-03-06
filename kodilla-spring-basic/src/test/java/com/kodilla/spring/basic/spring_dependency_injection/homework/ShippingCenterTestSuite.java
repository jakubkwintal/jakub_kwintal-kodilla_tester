package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Test
    public void shouldReturnTrue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean info = bean.deliverPackage("Radom, ul. Poziomkowa 3", 30);
        Assertions.assertTrue(info);
    }

    @Test
    public void shouldReturnFalse() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean info = bean.deliverPackage("Radom, ul. Poziomkowa 3", 31);
        Assertions.assertFalse(info);
    }

    @Test
    public void shouldReturnIfSuccess() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        NotificationService bean = context.getBean(NotificationService.class);
        String address = bean.success("Radom, ul. Poziomkowa 3");
        Assertions.assertEquals("Package delivered to: Radom, ul. Poziomkowa 3", address);
    }

    @Test
    public void shouldReturnIfFail() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        NotificationService bean = context.getBean(NotificationService.class);
        String address = bean.fail("Radom, ul. Poziomkowa 7");
        Assertions.assertEquals("Package not delivered to: Radom, ul. Poziomkowa 7", address);
    }
}
