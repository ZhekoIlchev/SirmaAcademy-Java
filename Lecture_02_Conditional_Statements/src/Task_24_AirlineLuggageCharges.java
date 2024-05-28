import java.util.Scanner;

public class Task_24_AirlineLuggageCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = Double.parseDouble(scanner.nextLine());
        double dimension = Double.parseDouble(scanner.nextLine());
        double luggageCharge = 0;

        if (weight > 50) {
            luggageCharge += 100;
        }

        if (dimension > 158) {
            double luggageDimensionExceeded = Math.abs(dimension - 158);

            if (luggageDimensionExceeded < 21) {
                luggageCharge += 50;
            } else if (luggageDimensionExceeded <= 50) {
                luggageCharge += 100;
            } else {
                luggageCharge += 200;
            }
        }

        if (weight > 50 && dimension > 158) {
            luggageCharge += 50;
        }

        System.out.printf("%.0f%%", luggageCharge);
    }
}