import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_17_AverageSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = Integer.parseInt(scanner.nextLine());
        int time = Integer.parseInt(scanner.nextLine());

        double averageSpeed = (distance * 1.0) / time;
        System.out.println(new DecimalFormat("#.00").format(averageSpeed));
    }
}