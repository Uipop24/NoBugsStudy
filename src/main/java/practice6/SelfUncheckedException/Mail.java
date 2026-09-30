package practice6.SelfUncheckedException;

public class Mail{

    public static void mailCheck(String mail){
        if(mail.contains("@gmail.com")){
            System.out.println("Mail correct");
        }else {
            throw new MailCheckException("Почта неверная, должная содержать @gmail.com");
        }
    }

    public static void main(String[] args) {
        try {
            mailCheck("staysoulb");
        }catch (MailCheckException e){
            System.out.println(e.getMessage());
        }
    }
}
