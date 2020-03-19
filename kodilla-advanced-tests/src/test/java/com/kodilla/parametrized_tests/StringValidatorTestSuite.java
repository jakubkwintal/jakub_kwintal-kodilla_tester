package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringValidatorTestSuite {

    private StringValidator validator = new StringValidator();

    @ParameterizedTest
    @ValueSource(strings = {"", "   "})
    public void shouldReturnTrueIfStringIsEmpty1(String text) {
        assertTrue(validator.isBlank(text));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmpty2(String text) {
        assertTrue(validator.isBlank(text));
    }

    /*jeżeli zdarzy Ci się zapomnieć, jakie wartości przekazuje dana adnotacja,
    możesz zajrzeć do dokumentacji albo po prostu wyświetlić przekazane wartości: */
    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmpty(String text) {
        System.out.println("|" + text + "|");
        assertTrue(validator.isBlank(text));
    }
//
//    @Test
//    public void shouldReturnFalseIfStringIsNotEmpty() {
//        assertFalse(validator.isBlank("test"));
//    }
//
//    @Test
//    public void shouldReturnTrueIfStringIsEmpty() {
//        assertTrue(validator.isBlank(""));
//    }
//
//    @Test
//    public void shouldReturnTrueIfStringHasOnlySpaces() {
//        assertTrue(validator.isBlank("   "));
//    }
//
//    @Test
//    public void shouldReturnTrueIfStringIsNull() {
//        assertTrue(validator.isBlank(null));
//    }
}