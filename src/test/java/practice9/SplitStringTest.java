package practice9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class SplitStringTest extends SplitStringTestBase {
    @Test
    public void splitStringByDelimiter(){
        String[] actual = splitString.splitString("Java,Python,C++", ",");
        String[] expected = {"Java", "Python", "C++"};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void splitEmptyStringByDelimiter(){
        String[] actual = splitString.splitString("", "," );
        String[] expected = {""};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void splitStringWithOneElementByDelimiter(){
        String[] actual = splitString.splitString("word", "," );
        String[] expected = {"word"};
        assertArrayEquals(expected, actual);
    }
}
