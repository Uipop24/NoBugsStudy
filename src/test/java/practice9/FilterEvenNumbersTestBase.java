package practice9;

import org.junit.jupiter.api.BeforeEach;

public class FilterEvenNumbersTestBase {
    protected FilterEvenNumbers filterEvenNumbers;

    @BeforeEach
    protected void setUp(){
        filterEvenNumbers = new FilterEvenNumbers();
    }
}
