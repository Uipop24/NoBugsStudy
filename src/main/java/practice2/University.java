package practice2;

public class University {
    static String universityName;
    final int studentID;
    String studentName;

    public University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    static void changeUniversityName(String newName){
        University.universityName = newName;
    }

    public void printStudentInfo(){
        System.out.println(getStudentName() + " " + studentID + " " + University.universityName);
    }

    public static void main(String[] args) {
        University uni_student_first = new University(1, "Tom");
        University uni_student_second = new University(2, "Ivan");
        University uni_student_third = new University(3, "Russo");
        changeUniversityName("МХАТ");
        uni_student_first.printStudentInfo();
        uni_student_second.printStudentInfo();
        uni_student_third.printStudentInfo();
    }
}
