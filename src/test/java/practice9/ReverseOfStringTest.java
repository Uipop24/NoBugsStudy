package practice9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseOfStringTest extends ReverseOfStringTestBase{

    public static Stream<Arguments> reverseStrings(){
        return Stream.of(
                Arguments.of("ashsa", "ashsa"),
                Arguments.of("12345", "54321"),
                Arguments.of("Maksim", "miskaM")
        );
    }

    @ParameterizedTest
    @MethodSource("reverseStrings")
    public void reverseString(String input, String output){
        String actual = reverseOfString.reverse(input);
        assertEquals(output, actual);
    }

    @Test
    public void reverseEmptyString(){
        String actual = reverseOfString.reverse("");
        String expected = "";
        assertEquals(expected,actual);
    }

    @Test
    public void reverseNullReturnsNull(){
        assertNull(reverseOfString.reverse(null));
    }
}
