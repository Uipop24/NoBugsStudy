package practice9;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondMaxNumTest extends SecondMaxNumTestBase {

    @Test
    public void simpleArray() {
        int actual = secondMaxNum.findSecondMax(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void arrayWithSameNumbers() {
        assertThrows(NoSuchElementException.class, () -> secondMaxNum.findSecondMax(new int[]{2, 2, 2, 2}));
    }

    @Test
    public void arrayWithOneElement() {
        assertThrows(IllegalArgumentException.class, () -> secondMaxNum.findSecondMax(new int[]{1}));
    }
}
