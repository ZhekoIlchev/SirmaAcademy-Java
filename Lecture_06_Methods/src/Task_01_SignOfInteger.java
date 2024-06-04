import java.util.Scanner;

public class Task_01_SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if (number == 0) {
            System.out.println("The number 0 is zero.");
            return;
        }

        if (isPositive(number)) {
            System.out.printf("The number %d is positive.", number);
        } else {
            System.out.printf("The number %d is negative.", number);
        }

    }

    public static boolean isPositive(int number) {
        return number > 0;
    }
}