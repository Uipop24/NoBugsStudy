package practice9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckValidPhoneNumberTest extends CheckValidPhoneNumberTestBase {

    @Test
    public void correctPhoneNumber() {
        boolean actual = checkValidPhoneNumber.isValidPhoneNumber("+1 1234567890");
        assertTrue(actual);
    }

    public static Stream<Arguments> notValidPhoneNumbers() {
        return Stream.of(
                Arguments.of("12345", false),
                Arguments.of("invalid", false)
        );
    }

    @ParameterizedTest
    @MethodSource("notValidPhoneNumbers")
    public void notValidPhoneNums(String num, boolean expected) {
        boolean actual = checkValidPhoneNumber.isValidPhoneNumber(num);
        assertEquals(expected, actual);
    }
}
