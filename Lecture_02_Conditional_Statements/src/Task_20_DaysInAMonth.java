import java.util.Scanner;

public class Task_20_DaysInAMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = Integer.parseInt(scanner.nextLine());

        int days = getDaysInMonth(month);

        if (days != 0) {
            System.out.println(days);
        } else {
            System.out.println("Month number should be between [1...12].");
        }
    }

    private static int getDaysInMonth(int month) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 0;
        };
    }
}