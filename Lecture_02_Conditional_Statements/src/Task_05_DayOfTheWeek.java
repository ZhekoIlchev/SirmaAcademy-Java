import java.util.Scanner;

public class Task_05_DayOfTheWeek {
    public enum WeekDays {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if (1 <= number && number <= 7) {
            System.out.println(WeekDays.values()[number - 1]);
        } else {
            System.out.println("Error");
        }
    }
}