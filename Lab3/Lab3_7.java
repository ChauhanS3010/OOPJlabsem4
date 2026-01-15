// Program to calculate area of rectangle using constructor overloading

import java.util.Scanner;

class Rectangle {
    // Data members
    double length;
    double breadth;

    // Default constructor
    Rectangle() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    double area() {
        return length * breadth;
    }
}

public class Lab3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using default constructor
        Rectangle rect1 = new Rectangle();
        System.out.println("Using default constructor:");
        System.out.println("Length = " + rect1.length + ", Breadth = " + rect1.breadth);
        System.out.println("Area of rectangle = " + rect1.area());

        // Using parameterized constructor
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double b = sc.nextDouble();

        Rectangle rect2 = new Rectangle(l, b);
        System.out.println("Using parameterized constructor:");
        System.out.println("Length = " + rect2.length + ", Breadth = " + rect2.breadth);
        System.out.println("Area of rectangle = " + rect2.area());

        sc.close();
    }
}
