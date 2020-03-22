package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {

    private static Stream<Arguments> provideDatesForBmi() {
        return Stream.of(
                Arguments.of(180, 80),
                Arguments.of(160, 90),
                Arguments.of(130, 60),
                Arguments.of(175, 160),
                Arguments.of(183, 75)
        );
    }
}
