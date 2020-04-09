package com.kodilla.spring.basic.spring_dependency_injection.homework;


import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void shouldReturnResults() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double add = bean.add(5, 5);
        double substract = bean.substract(5, 5);
        double multiply = bean.multiply(5, 5);
        double divide = bean.divide(5, 5);
    }

    @Test
    public void shouldDisplayResults() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display bean = context.getBean(Display.class);
        String display = bean.display(3, 0, 25, 1);

    }
}