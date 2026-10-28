package practice9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckForAnagramTest extends CheckForAnagramTestBase {
    @Test
    public void stringsIsAnagram(){
        boolean actual = checkForAnagram.isAnagram("listen", "silent");
        assertTrue(actual);
    }

    @Test
    public void stringsIsNotAnagram(){
        boolean actual = checkForAnagram.isAnagram("java", "python");
        assertFalse(actual);
    }

    @Test
    public void checkNullForAnagram(){
        boolean actual = checkForAnagram.isAnagram(null, "python");
        assertFalse(actual);
    }


}
