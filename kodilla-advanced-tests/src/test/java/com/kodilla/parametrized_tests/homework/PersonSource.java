package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {

    private static Stream<Arguments> provideDatesForBmi() {
        return Stream.of(
                Arguments.of(new Person(1.80, 80.00), "Normal (healthy weight)"),
                Arguments.of(new Person(1.60, 90.00), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.30, 60.00), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.75, 160.00), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.83, 75.00), "Normal (healthy weight)"),
                Arguments.of(new Person(1.85, 50.00), "Very severely underweight"),
                Arguments.of(new Person(1.64, 35.00), "Very severely underweight"),
                Arguments.of(new Person(2.05, 70.00), "Severely underweight"),
                Arguments.of(new Person(1.33, 80.00), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.00, 40.00), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.50, 35.00), "Very severely underweight")
        );
    }
}
