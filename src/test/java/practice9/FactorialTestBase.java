package practice9;

import org.junit.jupiter.api.BeforeEach;

public class FactorialTestBase {
    protected Factorial factorial;

    @BeforeEach
    protected void setUp(){
        factorial = new Factorial();
    }
}
