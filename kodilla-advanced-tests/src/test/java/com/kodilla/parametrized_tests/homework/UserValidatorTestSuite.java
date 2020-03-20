package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Marek", "mArEK", "marek", "mdo"})
    public void shouldReturnTrueIfUserNameIsOk(String text) {
        boolean result = userValidator.validateUsername(text);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Ma@rek", "md", "marek?", "", " "})
    public void shouldReturnFalseIfUserNameIsWrong(String text) {
        assertFalse(userValidator.validateUsername(text));
    }

    private UserValidator emailValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"marek.domek@wp.pl", "marek@best.artist", "m@d.p"})
    public void shouldReturnTrueIfAddressIsOk(String text) {
        assertTrue(emailValidator.validateEmail(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"marek.@wp.pl", "marek.domek@.pl", "marek.domek@pl", "@", "wp.pl", "marek.wp.pl", "marek@", "marek@wp."})
    public void shouldReturnFalseIfAddressIsWrong(String text) {
        assertFalse(emailValidator.validateEmail(text));
    }
}
