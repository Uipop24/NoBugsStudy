package practice9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckValidPhoneNumberTest extends CheckValidPhoneNumberTestBase{

    public static Stream<Arguments> invalidPhoneNumbers(){
        return Stream.of(
                Arguments.of("12345", false),
                Arguments.of("invalid", false)
        );
    }

    @Test
    public void checkCorrectNumber(){
        boolean actual = checkValidPhoneNumber.isValidPhoneNumber("+1 1234567890");
        assertTrue(actual);
    }

    @ParameterizedTest
    @MethodSource("invalidPhoneNumbers")
    public void checkNotValidNumbers(String number, boolean expected){
        boolean actual = checkValidPhoneNumber.isValidPhoneNumber(number);
        assertFalse(actual);
    }
}
