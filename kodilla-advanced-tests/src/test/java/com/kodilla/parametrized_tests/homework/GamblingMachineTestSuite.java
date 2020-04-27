package com.kodilla.parametrized_tests.homework;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();


    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineNumbersBis.csv", numLinesToSkip = 0)
    public void shouldReturnTrueIfNumbersAreOk(int input, int expected) throws InvalidNumbersException {
        Set<Integer> validNumbers = new HashSet<>();

        for (int number : validNumbers) {
            validNumbers.add(number);
            assertEquals(expected, input);
        }

        int numberOfWins = gamblingMachine.howManyWins(validNumbers);
        boolean result = numberOfWins >= 0 && numberOfWins <= 6;
        assertTrue(result);

    }

//         OD KUBY:

//    @ParameterizedTest
//    @CsvFileSource(resources = "/gamblingMachineNumbers.csv", numLinesToSkip = 0)
//    public void shouldReturnTrueIfNumbersAreOk(String string) throws InvalidNumbersException {
//        String[] splitedString = string.split(" ");
//
//        Set<Integer> validSets = new HashSet<>();
//
//        for (String number : splitedString) {
//            validSets.add(Integer.parseInt(number));
//        }
//
//        int counted = gamblingMachine.howManyWins(validSets);
//        boolean result = counted >= 0 && counted <= 6;
//        assertTrue(result);
//    }

}
