package practice9;

import org.junit.jupiter.api.BeforeEach;

public class ValidMailTestBase {
    protected ValidEmail validEmail;

    @BeforeEach
    protected void setUp(){
        validEmail = new ValidEmail();
    }
}
