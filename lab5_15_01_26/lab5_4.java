import java.util.Scanner;

// Base interface
interface Employee {
    void getDetails();
}

// Derived interface (RENAMED)
interface ManagerIntf extends Employee {
    void getDeptDetails();
}

// Class implementing derived interface
class Head implements ManagerIntf {

    int empId;
    String empName;
    int deptId;
    String deptName;

    Scanner sc = new Scanner(System.in);

    public void getDetails() {
        System.out.print("Enter employee id - ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter employee name - ");
        empName = sc.nextLine();
    }

    public void getDeptDetails() {
        System.out.print("Enter department id - ");
        deptId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter department name - ");
        deptName = sc.nextLine();
    }

    void display() {
        System.out.println("\nEmployee id - " + empId);
        System.out.println("Employee name - " + empName);
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }
}

// Main class
public class lab5_4 {
    public static void main(String[] args) {
        Head h = new Head();
        h.getDetails();
        h.getDeptDetails();
        h.display();
    }
}
