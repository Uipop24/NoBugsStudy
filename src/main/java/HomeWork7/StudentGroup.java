package HomeWork7;

public class StudentGroup {
    String groupName;
    int studentCount;

    public StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public void printInfo(){
        System.out.println(groupName + " " + studentCount);
    }

    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup("Механикус", 60);
        studentGroup.setStudentCount(44);
        studentGroup.printInfo();
    }
}
