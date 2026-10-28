package practice9;

import org.junit.jupiter.api.BeforeEach;

public class MapToLengthsTestBase {
    protected MapToLengths mapToLengths;

    @BeforeEach
    protected void setUp() {
        mapToLengths = new MapToLengths();
    }
}
