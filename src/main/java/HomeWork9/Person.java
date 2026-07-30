package HomeWork9;

public class Person {

    private String firstName;
    private String lastName;
    private final String ssn;


    public Person(String ssn, String lastName, String firstName) {
        this.ssn = ssn;
        this.lastName = lastName;
        this.firstName = firstName;
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
        System.out.println("\"Имя: " + firstName + ", Фамилия: " + lastName + ", SSN: " + ssn + "\"");
    }

    public static void main(String[] args) {
        Person person_one = new Person("123-45-6789", "Ruz", "Lan");
        Person person_two = new Person("123-45-6781", "Ivan", "Lan");
        person_one.setFirstName("Chao");
        person_one.printPersonInfo();
        person_two.printPersonInfo();
    }

}
