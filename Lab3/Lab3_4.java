import java.util.Scanner;

class Rectangle {
    double length, breadth;
    double area, perimeter;

    // Method to read length and breadth
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }

    // Method to calculate area and perimeter
    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    // Method to display area and perimeter
    void display() {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }
}

public class Lab3_4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.read();
        r.calculate();
        r.display();
    }
}
