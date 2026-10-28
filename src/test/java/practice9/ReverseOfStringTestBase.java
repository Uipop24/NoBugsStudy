package practice9;

import org.junit.jupiter.api.BeforeEach;

public class ReverseOfStringTestBase {
    protected ReverseOfString reverseOfString;

    @BeforeEach
    protected void setUp(){
        reverseOfString = new ReverseOfString();
    }
}
