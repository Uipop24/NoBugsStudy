package practice9;

import org.junit.jupiter.api.BeforeEach;

public class CheckPasswordTestBase {
    protected CheckPassword checkPassword;
    @BeforeEach
    protected void setUp(){
        checkPassword = new CheckPassword();
    }
}
