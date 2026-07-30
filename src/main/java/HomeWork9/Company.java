package HomeWork9;

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

    static void printCompanyName() {
        System.out.println(companyName);
    }

    public static void main(String[] args) {
        Company company_employeer_first = new Company(1, "Peter");
        Company company_employeer_second = new Company(2, "Ivan");
        companyName = "STILKA";
        printCompanyName();
        companyName = "RAZDAL";
        //company_employeer_first.employeeID = 5;
        System.out.println(companyName + " " + company_employeer_first.getEmployeeName());
        System.out.println(companyName + " " + company_employeer_second.getEmployeeName());


    }
}
