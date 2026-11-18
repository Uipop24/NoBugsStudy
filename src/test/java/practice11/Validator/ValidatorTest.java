package practice11.Validator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidatorTest {
    @Test
    public void checkNameIsValid() {
        UserValidator userValidator = new UserValidator();
        UserValidator.setValidationEnabled(true);
        User user = new User("Петр", 21, "email@email.com");
        assertDoesNotThrow(() -> userValidator.validateName(user));
    }

    @Test
    public void checkNameIsValidValidationEnabledFalse() {
        UserValidator userValidator = new UserValidator();
        UserValidator.setValidationEnabled(false);
        User user = new User("Петр", 21, "email@email.com");
        assertDoesNotThrow(() -> userValidator.validateName(user));
    }

    @Test
    public void checkNameIsInvalid() {
        UserValidator userValidator = new UserValidator();
        UserValidator.setValidationEnabled(true);
        User user = new User("петр", 21, "email@email.com");
        assertThrows(InvalidUserException.class, () -> userValidator.validateName(user));
    }

    @Test
    public void checkNameIsInvalidValidationEnabledFalse() {
        UserValidator userValidator = new UserValidator();
        UserValidator.setValidationEnabled(false);
        User user = new User("петр", 21, "email@email.com");
        assertDoesNotThrow(() -> userValidator.validateName(user));
    }

    @Test
    public void checkNameIsEmpty() {
        UserValidator userValidator = new UserValidator();
        UserValidator.setValidationEnabled(true);
        User user = new User("", 21, "email@email.com");
        assertThrows(InvalidUserException.class, () -> userValidator.validateName(user));
    }

    @Test
    public void checkNameIsNull() {
        UserValidator userValidator = new UserValidator();
        UserValidator.setValidationEnabled(true);
        User user = new User(null, 21, "email@email.com");
        assertThrows(InvalidUserException.class, () -> userValidator.validateName(user));
    }

    public static Stream<Arguments> ages() {
        return Stream.of(
                Arguments.of("Петр", 18, "email@email.com"),
                Arguments.of("Петр", 100, "email@email.com")

        );
    }
    @ParameterizedTest
    @MethodSource("ages")
    public void checkAgeIsValid(String name, int age, String email) {
        UserValidator userValidator = new UserValidator();
        UserValidator.setValidationEnabled(true);
        User user = new User(name, age, email);
        assertDoesNotThrow(() -> userValidator.validateAge(user));
    }

    @Test
    public void checkAgeIsValidValidationEnabledFalse() {
        UserValidator userValidator = new UserValidator();
        UserValidator.setValidationEnabled(false);
        User user = new User("Петр", 18, "email@email.com");
        assertDoesNotThrow(() -> userValidator.validateAge(user));
    }
    public static Stream<Arguments> invalidAges() {
        return Stream.of(
                Arguments.of("Петр", 17, "email@email.com"),
                Arguments.of("Петр", 101, "email@email.com"),
                Arguments.of("Петр", 0, "email@email.com")

        );
    }
    @ParameterizedTest
    @MethodSource("invalidAges")
    public void checkAgeIsInvalid(String name, int age, String email) {
        UserValidator userValidator = new UserValidator();
        UserValidator.setValidationEnabled(true);
        User user = new User(name, age, email);
        assertThrows(InvalidUserException.class, () -> userValidator.validateAge(user));
    }

    @Test
    public void checkAgeIsInvalidValidationEnabledFalse() {
        UserValidator userValidator = new UserValidator();
        UserValidator.setValidationEnabled(false);
        User user = new User("петр", 17, "email@email.com");
        assertDoesNotThrow(() -> userValidator.validateAge(user));
    }

    @Test
    public void checkAgeIsNegative() {
        UserValidator userValidator = new UserValidator();
        UserValidator.setValidationEnabled(true);
        User user = new User("Петр", -1, "email@email.com");
        assertThrows(InvalidUserException.class, () -> userValidator.validateAge(user));
    }

    @Test
    public void checkEmailIsValid() {
        UserValidator userValidator = new UserValidator();
        UserValidator.setValidationEnabled(true);
        User user = new User("Петр", 21, "email@email.com");
        assertDoesNotThrow(() -> userValidator.validateEmail(user));
    }

    @Test
    public void checkEmailIsValidValidationEnabledFalse() {
        UserValidator userValidator = new UserValidator();
        UserValidator.setValidationEnabled(false);
        User user = new User("Петр", 21, "email@email.com");
        assertDoesNotThrow(() -> userValidator.validateEmail(user));
    }

    @Test
    public void checkEmailIsInvalid() {
        UserValidator userValidator = new UserValidator();
        UserValidator.setValidationEnabled(true);
        User user = new User("Петр", 21, "email@@email.com");
        assertThrows(InvalidUserException.class, () -> userValidator.validateEmail(user));
    }

    @Test
    public void checkEmailIsInvalidValidationEnabledFalse() {
        UserValidator userValidator = new UserValidator();
        UserValidator.setValidationEnabled(false);
        User user = new User("петр", 21, "email@@email.com");
        assertDoesNotThrow(() -> userValidator.validateEmail(user));
    }

    @Test
    public void checkEmailIsEmpty() {
        UserValidator userValidator = new UserValidator();
        UserValidator.setValidationEnabled(true);
        User user = new User("Петр", 21, "");
        assertThrows(InvalidUserException.class, () -> userValidator.validateEmail(user));
    }

    @Test
    public void checkEmailIsNull() {
        UserValidator userValidator = new UserValidator();
        UserValidator.setValidationEnabled(true);
        User user = new User("Петр", 21, null);
        assertThrows(InvalidUserException.class, () -> userValidator.validateEmail(user));
    }
}
