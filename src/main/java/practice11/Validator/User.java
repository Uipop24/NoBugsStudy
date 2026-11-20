package practice11.Validator;

public class User {
    private String name;
    private int age;
    private String email;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;


    }
}
