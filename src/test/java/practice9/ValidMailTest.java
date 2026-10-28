package practice9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ValidMailTest extends ValidMailTestBase {

    public static Stream<Arguments> emails(){
        return Stream.of(
                Arguments.of("test@example.com", true),
                Arguments.of("bad@.com", false),
                Arguments.of("no-at-symbol", false)
        );
    }

    @ParameterizedTest
    @MethodSource("emails")
    public void checkEmails(String email, boolean expected){
        boolean actual = validEmail.isValidEmail(email);
        assertEquals(expected, actual);
    }

    @Test
    public void nullEmail(){
        assertFalse(validEmail.isValidEmail(null));
    }
}
