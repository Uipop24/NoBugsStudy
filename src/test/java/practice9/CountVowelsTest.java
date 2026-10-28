package practice9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountVowelsTest extends CountVowelsTestBase{

    public static Stream<Arguments> validStringsToCountVowels() {
        return Stream.of(
                Arguments.of("hello", 2),
                Arguments.of("java", 2),
                Arguments.of("AEIOU", 5),
                Arguments.of("", 0),
                Arguments.of("12345", 0),
                Arguments.of("1e2d3a", 2)
        );
    }


    @ParameterizedTest
    @MethodSource("validStringsToCountVowels")
    public void countVowelsOfSomeStrings(String input, int expectedCount) {
        int actual = countVowels.countVowels(input);

        assertEquals(expectedCount, actual);
    }

    @Test
    public void noVowelsInput() {
        int expected = 0;
        int actual = countVowels.countVowels("SDFG");
        assertEquals(expected, actual);
    }

    @Test
    public void throwsExceptionOnNullInput() {
        assertThrows(IllegalArgumentException.class, () -> countVowels.countVowels(null));
    }


}
