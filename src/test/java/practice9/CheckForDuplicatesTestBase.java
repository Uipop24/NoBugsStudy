package practice9;

import org.junit.jupiter.api.BeforeEach;

public class CheckForDuplicatesTestBase {
    protected CheckForDuplicates checkForDuplicates;

    @BeforeEach
    protected void setUp() {
        checkForDuplicates = new CheckForDuplicates();
    }

}