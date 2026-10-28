package practice9;

import org.junit.jupiter.api.BeforeEach;

public class JsonCheckTestBase {
    protected JsonCheck jsonCheck;

    @BeforeEach
    protected void setUp() {
        jsonCheck = new JsonCheck();
    }
}
