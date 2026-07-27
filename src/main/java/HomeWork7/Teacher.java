package HomeWork7;

public class Teacher {
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Tom", "Survive");
        teacher.setSubject("math");
        System.out.println(teacher.getName() + " " + teacher.getSubject());
    }
}
