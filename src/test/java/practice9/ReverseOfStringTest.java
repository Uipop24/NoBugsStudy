package practice9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseOfStringTest extends ReverseOfStringTestBase {

    public static Stream<Arguments> simpleStrings(){
        return Stream.of(
                Arguments.of("12345","54321"),
                Arguments.of("Maskim","miksaM"),
                Arguments.of("1a2b3c","c3b2a1")
        );
    }

    @ParameterizedTest
    @MethodSource("simpleStrings")
    public void reverseStrings(String input, String expected){
        String actual = reverseOfString.reverse(input);
        assertEquals(expected,actual);
    }

    @Test
    public void emptyString(){
        String actual = reverseOfString.reverse("");
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    public void reverseNullReturnsNull(){
        assertNull(reverseOfString.reverse(null));
    }

}
