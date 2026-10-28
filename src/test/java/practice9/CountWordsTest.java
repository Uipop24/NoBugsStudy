package practice9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountWordsTest extends CountWordsTestBase {

    @Test
    public void emptyString() {
        int actual = countWords.countWords("");
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void nullString() {
        assertThrows(NullPointerException.class, () -> countWords.countWords(null));
    }

    @Test
    public void stringWithSomeSpaces() {
        int actual = countWords.countWords("Hi!   My name    is");
        int expected = 4;
        assertEquals(expected, actual);
    }


}
