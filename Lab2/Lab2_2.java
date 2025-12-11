import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();
        char grade;

        if (marks >= 90 && marks <= 100) {
            grade = 'O';
        } else if (marks >= 80 && marks <= 89) {
            grade = 'E';
        } else if (marks >= 70 && marks <= 79) {
            grade = 'A';
        } else if (marks >= 60 && marks <= 69) {
            grade = 'B';
        } else if (marks >= 50 && marks <= 59) {
            grade = 'C';
        } else {
            grade = 'F';  // F for marks below 50
        }

        System.out.println("Grade: " + grade);
    }
}
