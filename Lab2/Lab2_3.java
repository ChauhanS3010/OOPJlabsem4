import java.util.Scanner;

public class Lab2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day number of December 2025 (1-31): ");
        int day = sc.nextInt();

        if (day < 1 || day > 31) {
            System.out.println("Invalid day number!");
            return;
        }

        // December 1, 2025 = Monday → day % 7: (1 % 7 = 1)
        int weekday = day % 7;

        switch (weekday) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
        }
    }
}
