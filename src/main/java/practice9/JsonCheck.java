package practice9;


import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonCheck {
    public boolean isValidJson(String json) {
        try {
            new ObjectMapper().readTree(json);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
