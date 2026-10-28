package practice9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckForDuplicatesTest extends CheckForDuplicatesTestBase {
    @Test
    public void arrayWithoutDuplicates() {

        boolean actual = checkForDuplicates.hasDuplicates(new int[]{1, 2, 3, 4, 5});
        assertFalse(actual);
    }

    @Test
    public void arrayWithDuplicates() {

        boolean actual = checkForDuplicates.hasDuplicates(new int[]{1, 2, 2, 3});
        assertTrue(actual);
    }

    @Test
    public void emptyArray() {

        boolean actual = checkForDuplicates.hasDuplicates(new int[]{});
        assertFalse(actual);
    }
}