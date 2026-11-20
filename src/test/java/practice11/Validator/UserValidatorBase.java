package practice11.Validator;

import org.junit.jupiter.api.BeforeEach;

public class UserValidatorBase {
    protected UserValidator userValidator;

    @BeforeEach
    protected void setUp(){
        userValidator = new UserValidator();
    }
}
