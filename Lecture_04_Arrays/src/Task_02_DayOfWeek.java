import java.util.Scanner;

public class Task_02_DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int dayNumber = Integer.parseInt(scanner.nextLine());

        if (0 < dayNumber && dayNumber < 8) {
            System.out.println(weekDays[dayNumber - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}