package practice9;

import org.junit.jupiter.api.BeforeEach;

public class SecondMaxNumTestBase {
    protected SecondMaxNum secondMaxNum;

    @BeforeEach
    protected void setUp(){
        secondMaxNum = new SecondMaxNum();
    }
}
