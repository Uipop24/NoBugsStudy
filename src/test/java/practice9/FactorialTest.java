package practice9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest extends FactorialTestBase{

    public static Stream<Arguments> smallNumbers(){
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(5, 120),
                Arguments.of(7, 5040)
        );
    }


    @Test
    public void factorialZero(){
        int actual = factorial.factorial(0);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("smallNumbers")
    public void factorialOfSmallNumbers(int num, int expected){
        int actual = factorial.factorial(num);
        assertEquals(expected, actual);

    }

    @Test
    public void negativeNumberGivesException(){
        assertThrows(IllegalArgumentException.class, () -> factorial.factorial(-1));
    }

}
