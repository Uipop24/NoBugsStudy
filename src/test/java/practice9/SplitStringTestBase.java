package practice9;

import org.junit.jupiter.api.BeforeEach;

public class SplitStringTestBase {
    protected SplitString splitString;

    @BeforeEach
    protected void setup(){
        splitString = new SplitString();
    }
}