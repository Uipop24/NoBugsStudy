package practice11.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    private static boolean validationEnabled = false;
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[\\w.-]+@[\\w-]+\\.[a-zA-Z]{2,}$");

    public static void setValidationEnabled(boolean validationEnabled) {
        UserValidator.validationEnabled = validationEnabled;
    }

    public void validateName(User user) {
        if (validationEnabled) {
            if (user.getName() != null && !user.getName().isEmpty() && Character.isUpperCase(user.getName().charAt(0))) {
                System.out.println("Валидация имени прошла успешно");
            } else {
                throw new InvalidUserException("Валидация не прошла, имя в неверном формате");
            }
        }
    }

    public void validateAge(User user) {
        if (validationEnabled) {
            if (user.getAge() >= 18 || user.getAge() <= 100) {
                System.out.println("Валидация возраста успешна");
            } else {
                throw new InvalidUserException("Валидация не прошла, возраст не попадает в диапазон");
            }
        }
    }

    public void validateEmail(User user) {
        if (validationEnabled) {
            if (user.getEmail() == null || user.getEmail().isEmpty()) {
                throw new InvalidUserException("Валидация не прошла, почта неверная");
            } else {
                Matcher matcher = EMAIL_PATTERN.matcher(user.getEmail());
                if (matcher.matches()) {
                    System.out.println("Валидация email прошла успешно!");
                } else {
                    throw new InvalidUserException("Валидация email не прошла, email неверный");
                }
            }
        }
    }
}
