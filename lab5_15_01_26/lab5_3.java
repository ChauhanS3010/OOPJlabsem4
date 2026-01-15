import java.util.Scanner;

interface Salary {
    void earnings();
    void deductions();
    void bonus();
}

// Abstract class Manager
abstract class Manager implements Salary {
    double basic;

    Manager(double basic) {
        this.basic = basic;
    }

    // Earnings = basic + DA (80%) + HRA (15%)
    public void earnings() {
        double earnings = basic + (0.80 * basic) + (0.15 * basic);
        System.out.println("Earnings - " + earnings);
    }

    // Deduction = PF (12%)
    public void deductions() {
        double deduction = 0.12 * basic;
        System.out.println("Deduction - " + deduction);
    }
}

class Substaff extends Manager {

    Substaff(double basic) {
        super(basic);
    }

    public void bonus() {
        double bonus = 0.50 * basic;
        System.out.println("Bonus - " + bonus);
    }
}
public class lab5_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        Substaff s = new Substaff(basic);

        s.earnings();
        s.deductions();
        s.bonus();
    }
}
