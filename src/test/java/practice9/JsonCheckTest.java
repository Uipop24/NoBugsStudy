package practice9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JsonCheckTest extends JsonCheckTestBase {
    @Test
    public void validJson(){
        boolean actual = jsonCheck.isValidJson("{\"key\":\"value\"}");
        assertTrue(actual);
    }

    @Test
    public void invalidJson(){
        boolean actual = jsonCheck.isValidJson("invalid json");
        assertFalse(actual);
    }

    @Test
    public void nullJson(){
        boolean actual = jsonCheck.isValidJson(null);
        assertFalse(actual);
    }
}
