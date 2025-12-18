import java.util.Scanner;

public class Lab3_2 {
    static int count = 0;

    // Constructor
    Lab3_2() {
        count++;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of objects to be created: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Lab3_2 obj = new Lab3_2();
        }

        System.out.println("Number of objects created = " + count);
    }
}

