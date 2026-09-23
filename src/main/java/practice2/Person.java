package practice2;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    public Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void printPersonInfo(){
        System.out.println("\"Имя: " + getFirstName() + ", Фамилия: " + getLastName() + ", SSN: " + getSsn() + "\"");
    }

    public static void main(String[] args) {
        Person person_one = new Person("Tom", "Kruz", "123-45-6789");
        Person person_two = new Person("Jack", "Russal", "123-45-6999");
        person_two.setFirstName("Bob");
        person_one.printPersonInfo();
        person_two.printPersonInfo();

    }
}
