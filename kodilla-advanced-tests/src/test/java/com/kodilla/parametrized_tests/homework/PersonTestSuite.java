//package com.kodilla.parametrized_tests.homework;
//
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.MethodSource;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class PersonTestSuite {
//
//    private Person person = new Person();
//
//    @ParameterizedTest
//    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSource#provideDatesForBmi")
//    public void shouldReturnBmiResult(double input, String expected) {
//        assertEquals(expected, input);
//    }
//
//}
