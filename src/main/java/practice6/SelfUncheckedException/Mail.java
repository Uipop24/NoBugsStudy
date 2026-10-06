package practice6.SelfUncheckedException;

import java.util.regex.Pattern;

public class Mail {
    private static Pattern pattern = Pattern.compile("[a-zA-Z0-9._-]+@gmail\\.com");

    public static void mailCheck(String mail) {

        if (pattern.matcher(mail).matches()) {
            System.out.println("Mail correct");
        } else {
            throw new MailCheckException("Mail incorrect");
        }
    }

    public static void main(String[] args) {
        try {
            mailCheck("pVz@12gmail.com");
        } catch (MailCheckException e) {
            System.out.println(e.getMessage());
        }
    }
}
