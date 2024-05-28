import java.util.Scanner;

public class Task_08_AlarmAfter15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if (hour < 0 || hour > 23) {
            System.out.println("Hour should be between [0...23] inclusive.");
            return;
        }

        if (minutes < 0 || minutes > 59) {
            System.out.println("Minutes should be between [0...59] inclusive.");
            return;
        }

        System.out.println(calculateTimeAfter15Minutes(hour, minutes));
    }

    private static String calculateTimeAfter15Minutes(int hour, int minutes) {
        minutes += 15;

        if (minutes >= 60) {
            hour += 1;
            minutes -= 60;
        }

        if (hour >= 24) {
            hour -= 24;
        }

        return String.format("%d:%02d", hour, minutes);
    }
}