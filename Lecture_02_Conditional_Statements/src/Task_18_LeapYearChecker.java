import java.util.Scanner;

public class Task_18_LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.nextLine());

        if (isLeapYear(year)) {
            System.out.println("It's a leap year!");
        } else {
            System.out.println("It's not a leap year.");
        }

    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}