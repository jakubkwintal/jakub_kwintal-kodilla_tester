package com.kodilla.parametrized_tests.homework;

        import org.junit.jupiter.params.ParameterizedTest;
        import org.junit.jupiter.params.provider.CsvFileSource;

        import java.util.Set;

        import static org.junit.jupiter.api.Assertions.assertEquals;

public class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineCorrectNumbers.csv", numLinesToSkip = 1)
    public void shouldReturnTrueIfNumbersAreOk(Set<Integer> input, int expected) throws InvalidNumbersException {
        assertEquals(expected, gamblingMachine.howManyWins(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineIncorrectNumbers.csv", numLinesToSkip = 1)
    public void shouldReturnFalseIfNumbersAreWrong(Set<Integer> input, int expected) throws InvalidNumbersException {
        assertEquals(expected, gamblingMachine.howManyWins(input));
    }
}
