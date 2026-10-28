package practice9;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearTest extends LeapYearTestBase{

    public static Stream<Arguments> notLeapYears(){
        return Stream.of(
                Arguments.of(1993, false),
                Arguments.of(1991, false),
                Arguments.of(2001, false),
                Arguments.of(1700, false)
        );
    }

    public static Stream<Arguments> leapYears(){
        return Stream.of(
                Arguments.of(2020, true),
                Arguments.of(2000, true),
                Arguments.of(1600, true)
        );
    }

    public static Stream<Arguments> divisibleBy100NotBy400(){
        return Stream.of(
                Arguments.of(1900, false),
                Arguments.of(2100, false)
        );
    }

    @ParameterizedTest
    @MethodSource("notLeapYears")
    public void checkNotLeapYears(int year, boolean expected){
        boolean actual = leapYear.isLeapYear(year);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("leapYears")
    public void checkLeapYears(int year, boolean expected){
        boolean actual = leapYear.isLeapYear(year);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("divisibleBy100NotBy400")
    public void checkDivisibleBy100NotBy400(int year, boolean expected){
        boolean actual = leapYear.isLeapYear(year);
        assertEquals(expected, actual);
    }
}
