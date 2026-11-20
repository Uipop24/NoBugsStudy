package practice11.GradeSystem;

public class StudentGrade <T extends Number>{
    private String name;
    private String subject;
    private T grade;

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public T getGrade() {
        return grade;
    }

    public StudentGrade(String name, String subject, T grade) {
        this.name = name;
        this.subject = subject;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentGrade{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", grade=" + grade +
                '}';
    }
}
