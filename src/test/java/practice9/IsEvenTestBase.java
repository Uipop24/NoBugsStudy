package practice9;

import org.junit.jupiter.api.BeforeEach;

public class IsEvenTestBase {
    protected IsEven isEven;

    @BeforeEach
    protected void setUp(){
        isEven = new IsEven();
    }
}
