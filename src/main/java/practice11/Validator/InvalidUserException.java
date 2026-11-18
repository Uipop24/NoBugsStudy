package practice11.Validator;

public class InvalidUserException extends IllegalArgumentException {
    public InvalidUserException(String message) {
        super(message);
    }
}
