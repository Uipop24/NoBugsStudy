package practice9;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindMaxNumberTest extends FindMaxNumberTestBase {

    @Test
    public void findMaxNumberInSimpleArray() {
        int actual = findMaxNumber.findMax(new int[]{3, 5, 7, 2});
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void findMaxNumberInArrayWithOneElement() {
        int actual = findMaxNumber.findMax(new int[]{3});
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void findMaxNumberInArrayWithNegativeNumbers() {
        int actual = findMaxNumber.findMax(new int[]{-3, -5, -7, -2});
        int expected = -2;
        assertEquals(expected, actual);
    }

    @Test
    public void findMaxNumberInEmptyArray() {
        assertThrows(NoSuchElementException.class, () -> findMaxNumber.findMax(new int[]{}));
    }
}
