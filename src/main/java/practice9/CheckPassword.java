package practice9;

public class CheckPassword {
    public boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) return false;
        return password.matches("^(?=.*[A-Z])(?=.*\\d).+$");
    }
}
