package practice9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsEvenTest extends IsEvenTestBase {

    @Test
    public void checkEvenNumberIsTrue(){
        boolean actual = isEven.isEven(2);
        assertTrue(actual);
    }

    @Test
    public void checkEvenNumberIsFalse(){
        boolean actual = isEven.isEven(1);
        assertFalse(actual);
    }

    @Test
    public void checkZeroForEven(){
        boolean actual = isEven.isEven(0);
        assertTrue(actual);
    }

    @Test
    public void checkNegativeEvenNumberIsTrue(){
        boolean actual = isEven.isEven(-2);
        assertTrue(actual);
    }

    @Test
    public void checkNegativeOddNumberIsFalse(){
        boolean actual = isEven.isEven(-1);
        assertFalse(actual);
    }




}
