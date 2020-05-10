package com.kodilla.parametrized_tests.homework;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineNumbersBis.csv", numLinesToSkip = 0)
    public void shouldReturnTrueIfNumbersAreOk(String input) throws InvalidNumbersException {
        Set<Integer> validNumbers = new HashSet<>();
        String[] splitedString = input.split(" ");
                for (String number : splitedString) {
            validNumbers.add(Integer.parseInt(number));
        }

        int numberOfWins = gamblingMachine.howManyWins(validNumbers);
        boolean result = numberOfWins >= 0 && numberOfWins <= 6;
        assertTrue(result);

    }
}
