package practice9;

import org.junit.jupiter.api.BeforeEach;

public class CheckValidPhoneNumberTestBase {
    protected CheckValidPhoneNumber checkValidPhoneNumber;
    @BeforeEach
    protected void setUp(){
        checkValidPhoneNumber = new CheckValidPhoneNumber();
    }
}
