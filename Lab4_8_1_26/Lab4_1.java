import java.util.Scanner;

class TwoD {
    double length, breadth;
    final double costPerSqFt = 40;

    void get2DDimensions() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of sheet: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth of sheet: ");
        breadth = sc.nextDouble();
    }

    double calculate2DCost() {
        double area = length * breadth;
        return area * costPerSqFt;
    }
}

// 3D class inheriting from 2D
class ThreeD extends TwoD {
    double height;
    final double costPerCubicFt = 60;

    void get3DDimensions() {
        get2DDimensions();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of box: ");
        height = sc.nextDouble();
    }

    double calculate3DCost() {
        double volume = length * breadth * height;
        return volume * costPerCubicFt;
    }
}

// Main class
public class Lab4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. 2D Sheet");
        System.out.println("2. 3D Box");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            TwoD sheet = new TwoD();
            sheet.get2DDimensions();
            System.out.println("Cost of plastic sheet: Rs " + sheet.calculate2DCost());
        }
        else if (choice == 2) {
            ThreeD box = new ThreeD();
            box.get3DDimensions();
            System.out.println("Cost of plastic box: Rs " + box.calculate3DCost());
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}
