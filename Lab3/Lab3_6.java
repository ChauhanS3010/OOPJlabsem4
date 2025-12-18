// Lab3_6.java
// Program to overload subtract method with various parameters

import java.util.Scanner;

class Calculator {

    // Subtract two integers
    void subtract(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction of two integers: " + result);
    }

    // Subtract three integers
    void subtract(int a, int b, int c) {
        int result = a - b - c;
        System.out.println("Subtraction of three integers: " + result);
    }

    // Subtract two doubles
    void subtract(double a, double b) {
        double result = a - b;
        System.out.println("Subtraction of two doubles: " + result);
    }

    // Subtract from a single integer (from 100 as example)
    void subtract(int a) {
        int result = 100 - a;
        System.out.println("Subtracting from 100: " + result);
    }
}

public class Lab3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        // Subtract two integers
        System.out.print("Enter two integers to subtract: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        calc.subtract(x, y);

        // Subtract three integers
        System.out.print("Enter three integers to subtract: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        calc.subtract(a, b, c);

        // Subtract two doubles
        System.out.print("Enter two doubles to subtract: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        calc.subtract(d1, d2);

        // Subtract single integer from 100
        System.out.print("Enter an integer to subtract from 100: ");
        int n = sc.nextInt();
        calc.subtract(n);

        sc.close();
    }
}
