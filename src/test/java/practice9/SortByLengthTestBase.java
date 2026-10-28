package practice9;

import org.junit.jupiter.api.BeforeEach;

public class SortByLengthTestBase {
    protected SortByLength sortByLength;

    @BeforeEach
    protected void setUp(){
        sortByLength = new SortByLength();
    }
}