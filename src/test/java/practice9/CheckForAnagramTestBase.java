package practice9;

import org.junit.jupiter.api.BeforeEach;

public class CheckForAnagramTestBase {

    protected CheckForAnagram checkForAnagram;
    @BeforeEach
    protected void setUp(){
        checkForAnagram = new CheckForAnagram();
    }

}
