package practice9;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterEvenNumbersTest extends FilterEvenNumbersTestBase {

    @Test
    public void simpleList(){
        List<Integer> actual = filterEvenNumbers.filterEvenNumbers(List.of(1, 2, 3, 4, 5, 6));
        List<Integer> expected = List.of(2,4,6);
        assertEquals(expected, actual);
    }

    @Test
    public void listWithoutEvenNumbers(){
        List<Integer> actual = filterEvenNumbers.filterEvenNumbers(List.of(1, 3, 5));
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }

    @Test
    public void listWithoutElements(){
        List<Integer> actual = filterEvenNumbers.filterEvenNumbers(new ArrayList<>());
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }
}
