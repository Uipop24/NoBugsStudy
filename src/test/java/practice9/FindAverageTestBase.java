package practice9;

import org.junit.jupiter.api.BeforeEach;

public class FindAverageTestBase {
    protected FindAverage findAverage;

    @BeforeEach
    protected void setUp(){
        findAverage  = new FindAverage();
    }
}
