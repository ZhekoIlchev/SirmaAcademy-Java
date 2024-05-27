import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_10_Speed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distanceInMeters = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());

        double speed = distanceInMeters / (hours * 3600D + minutes * 60 + seconds);
        DecimalFormat df = new DecimalFormat("#.######");
        System.out.println(df.format(speed));
    }
}