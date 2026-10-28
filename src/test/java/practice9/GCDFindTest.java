package practice9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GCDFindTest {
    public static Stream<Arguments> nums(){
        return Stream.of(
                Arguments.of(24, 36, 12),
                Arguments.of(101, 103, 1),
                Arguments.of(0, 10, 10)
        );
    }


    @ParameterizedTest
    @MethodSource("nums")
    public void findGcd(int firstNum, int secondNum, int expected){
        GCDFind gcdFind = new GCDFind();
        int actual = gcdFind.gcd(firstNum,secondNum);
        assertEquals(expected, actual);
    }
}
