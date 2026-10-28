package practice9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsEvenTest extends IsEvenTestBase{
    @Test
    public void evenNumber(){
        boolean actual = isEven.isEven(2);
        assertTrue(actual);
    }

    @Test
    public void notEvenNumber(){
        boolean actual = isEven.isEven(3);
        assertFalse(actual);
    }

    @Test
    public void zeroIsEven(){
        boolean actual = isEven.isEven(0);
        assertTrue(actual);
    }

    @Test
    public void negativeNumberIsEven(){
        boolean actual = isEven.isEven(-2);
        assertTrue(actual);
    }

    @Test
    public void negativeNumberIsNotEven(){
        boolean actual = isEven.isEven(-1);
        assertFalse(actual);
    }
}
