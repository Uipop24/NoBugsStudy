package practice11.GradeSystem;

public class InvalidGradeException extends IllegalArgumentException{
    public InvalidGradeException(String message) {
        super(message);
    }
}
