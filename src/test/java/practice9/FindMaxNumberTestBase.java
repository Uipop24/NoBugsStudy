package practice9;

import org.junit.jupiter.api.BeforeEach;

public class FindMaxNumberTestBase {
    protected FindMaxNumber findMaxNumber;

    @BeforeEach
    protected void setUp(){
        findMaxNumber = new FindMaxNumber();
    }
}
