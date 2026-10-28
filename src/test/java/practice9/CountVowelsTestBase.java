package practice9;

import org.junit.jupiter.api.BeforeEach;

public class CountVowelsTestBase {
    protected CountVowels countVowels;
    @BeforeEach
    protected void setUp(){
        countVowels = new CountVowels();
    }
}
