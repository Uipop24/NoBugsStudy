package practice9;

import org.junit.jupiter.api.BeforeEach;

public class CountWordsTestBase {
    protected CountWords countWords;
    @BeforeEach
    protected void setUp(){
         countWords = new CountWords();
    }
}
