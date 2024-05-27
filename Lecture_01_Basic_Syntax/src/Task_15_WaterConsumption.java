import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_15_WaterConsumption {
    private static final int DAYS_IN_WEEK = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalWater = Integer.parseInt(scanner.nextLine());
        int peopleCount = Integer.parseInt(scanner.nextLine());

        double dailyWaterConsumptionPerPerson = totalWater * 1.0 / 7 / peopleCount;
        System.out.println(new DecimalFormat("#.00").format(dailyWaterConsumptionPerPerson));
    }
}