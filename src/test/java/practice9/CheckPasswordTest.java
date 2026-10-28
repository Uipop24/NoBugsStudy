package practice9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckPasswordTest extends CheckPasswordTestBase{
    @Test
    public void checkValidPassword(){
        boolean actual = checkPassword.isValidPassword("Password1");
        assertTrue(actual);

    }

    @Test
    public void checkInvalidPassword(){
        boolean actual = checkPassword.isValidPassword("pass");
        assertFalse(actual);

    }

    @Test
    public void checkNullPassword(){
        boolean actual = checkPassword.isValidPassword(null);
        assertFalse(actual);

    }
}
