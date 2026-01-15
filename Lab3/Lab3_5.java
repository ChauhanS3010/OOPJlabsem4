import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;
}

public class Lab3_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] students = new Student[n];
        double minCgpa = 10.0;
        String minName = "";

        // Input student details
        for (int i = 0; i < n; i++) {
            students[i] = new Student();

            System.out.print("Enter Roll No: ");
            students[i].roll = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Name: ");
            students[i].name = sc.nextLine();

            System.out.print("Enter CGPA: ");
            students[i].cgpa = sc.nextDouble();

            if (students[i].cgpa < minCgpa) {
                minCgpa = students[i].cgpa;
                minName = students[i].name;
            }
        }

        // Display student details
        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            System.out.println(
                    "Roll No: " + students[i].roll +
                            ", Name: " + students[i].name +

                      ", CGPA: " + students[i].cgpa
            );
        }

        // Display student with lowest CGPA
        System.out.println("\nStudent with lowest CGPA: " + minName);
    }
}