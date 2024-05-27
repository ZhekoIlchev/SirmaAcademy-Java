import java.util.Scanner;

public class Task_09_Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine());

        String convertedMinutes = convertMinutesToHoursAndMinutes(minutes);
        System.out.println(convertedMinutes);
    }

    private static String convertMinutesToHoursAndMinutes(int minutes) {
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return String.format("%02d:%02d", hours, remainingMinutes);
    }
}