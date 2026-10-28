package practice9;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindAverageTest extends FindAverageTestBase {
    @Test
    public void findAverageInArray() {
        double actual = findAverage.findAverage(new int[]{1, 2, 3, 4, 5});
        double expected = 3.0;
        assertEquals(expected, actual);
    }

    @Test
    public void findAverageInArrayWithOneElement() {
        double actual = findAverage.findAverage(new int[]{10});
        double expected = 10.0;
        assertEquals(expected, actual);
    }

    @Test
    public void findAverageInEmptyArray() {
        assertThrows(NoSuchElementException.class, () -> findAverage.findAverage(new int[]{}));
    }
}