package HomeWork9;

public class University {
    static String universityName;
    final int studentID;
    String studentName;

    public University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static String changeUniversityName(String newName){
        return universityName = newName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void printStudentInfo(){
        System.out.println(studentName + " " + studentID + " " + universityName);
    }

    public static void main(String[] args) {
        University student_first = new University(1, "Tom");
        University student_second = new University(2, "Tom");
        University student_third = new University(3, "Tom");
        changeUniversityName("MXAT");
        student_first.printStudentInfo();
        student_second.printStudentInfo();
        student_third.printStudentInfo();
    }
}
