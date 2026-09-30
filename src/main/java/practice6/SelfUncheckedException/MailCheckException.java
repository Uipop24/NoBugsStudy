package practice6.SelfUncheckedException;

public class MailCheckException extends RuntimeException{
    public MailCheckException(String message){
        super(message);
    }
}
