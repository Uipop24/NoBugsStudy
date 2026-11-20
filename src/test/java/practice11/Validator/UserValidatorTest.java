package practice11.Validator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserValidatorTest extends UserValidatorBase{

    @Test
    public void checkNameIsValid(){
        UserValidator.setValidationEnabled(true);
        User user = new User("Ivan", 21, "ivan@gmail.com");
        assertDoesNotThrow(() -> userValidator.validateName(user));
    }

    @Test
    public void checkNameIsValidValidationEnabledIsFalse(){
        UserValidator.setValidationEnabled(false);
        User user = new User("Ivan", 21, "ivan@gmail.com");
        assertDoesNotThrow(() -> userValidator.validateName(user));
    }

    @Test
    public void checkEmptyNameIsInvalidValid(){
        UserValidator.setValidationEnabled(true);
        User user = new User("", 21, "ivan@gmail.com");
        assertThrows(InvalidUserException.class, () -> userValidator.validateName(user));
    }

    @Test
    public void checkNullNameIsInvalidValid(){
        UserValidator.setValidationEnabled(true);
        User user = new User(null, 21, "ivan@gmail.com");
        assertThrows(InvalidUserException.class, () -> userValidator.validateName(user));
    }

    @Test
    public void checkNullNameIsInvalidValidValidationEnabledIsFalse(){
        UserValidator.setValidationEnabled(false);
        User user = new User(null, 21, "ivan@gmail.com");
        assertDoesNotThrow(() -> userValidator.validateName(user));
    }

    @Test
    public void checkEmptyNameIsInvalidValidValidationEnabledIsFalse(){
        UserValidator.setValidationEnabled(false);
        User user = new User("", 21, "ivan@gmail.com");
        assertDoesNotThrow(() -> userValidator.validateName(user));
    }

    public static Stream<Arguments> ages(){
        return Stream.of(
                Arguments.of("Ivan", 18, "ivan@gmail.com"),
                Arguments.of("Ruslan", 100, "ruslan@gmail.com")
        );
    }

    public static Stream<Arguments> invalidateAges(){
        return Stream.of(
                Arguments.of("Ivan", 17, "ivan@gmail.com"),
                Arguments.of("Ruslan", 101, "ruslan@gmail.com")
        );
    }

    public static Stream<Arguments> validEmails(){
        return Stream.of(
                Arguments.of("Ivan", 18, "ivan@gmail.com"),
                Arguments.of("Ruslan", 100, "ruslan@gmail.com"),
                Arguments.of("Ruslan", 100, "ruslan@mail.com"),
                Arguments.of("Ruslan", 100, "ruslan123123@gmail.com")
        );
    }

    public static Stream<Arguments> invalidEmails(){
        return Stream.of(
                Arguments.of("Ivan", 18, ""),
                Arguments.of("Ruslan", 100, null),
                Arguments.of("Ruslan", 100, "ru@slan@mail.com"),
                Arguments.of("Ruslan", 100, "ruslan@@mail.com"),
                Arguments.of("Ruslan", 100, "ruslan123123@.com"),
                Arguments.of("Ruslan", 100, "ruslan@@mail.com")
        );
    }

    @ParameterizedTest
    @MethodSource("ages")
    public void checkValidAges(String name, int age, String email){
        UserValidator.setValidationEnabled(true);
        User user = new User(name, age, email);
        assertDoesNotThrow(() -> userValidator.validateAge(user));

    }

    @ParameterizedTest
    @MethodSource("invalidateAges")
    public void checkInvalidAges(String name, int age, String email){
        UserValidator.setValidationEnabled(true);
        User user = new User(name, age, email);
        assertThrows(InvalidUserException.class, () -> userValidator.validateAge(user));

    }

    @Test
    public void checkAgeIsValidValidationEnabledIsFalse(){
        UserValidator.setValidationEnabled(false);
        User user = new User("", 17, "ivan@gmail.com");
        assertDoesNotThrow(() -> userValidator.validateAge(user));
    }

    @ParameterizedTest
    @MethodSource("validEmails")
    public void checkValidEmails(String name, int age, String email){
        UserValidator.setValidationEnabled(true);
        User user = new User(name, age, email);
        assertDoesNotThrow(() -> userValidator.validateEmail(user));

    }

    @ParameterizedTest
    @MethodSource("invalidEmails")
    public void checkInvalidEmails(String name, int age, String email){
        UserValidator.setValidationEnabled(true);
        User user = new User(name, age, email);
        assertThrows(InvalidUserException.class, () -> userValidator.validateEmail(user));

    }

    @Test
    public void checkInvalidEmailsValidationEnabledIsFalse(){
        UserValidator.setValidationEnabled(false);
        User user = new User("Ivan", 17, "ivan@");
        assertDoesNotThrow(() -> userValidator.validateEmail(user));

    }

}
