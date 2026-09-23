package practice2;

public class Company {
    static String companyName;
    final int employeeID;
    String employeeName;

    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    static void printCompanyName(){
        System.out.println(companyName);
    }

    public static void main(String[] args) {
        Company employee_first = new Company(1, "Tom");
        Company employee_second = new Company(2, "Ivan");
        companyName = "HP";
        printCompanyName();
        companyName = "LG";
        System.out.println(companyName + " " + employee_first.getEmployeeName());
        System.out.println(companyName + " " + employee_second.getEmployeeName());
        //employee_first.employeeID = 90;

    }
}
