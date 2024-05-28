import java.util.Locale;
import java.util.Scanner;

public class Task_13_VegetableMarket {
    private static final double TOMATO_PRICE_WEEKDAYS = 2.50;
    private static final double ONION_PRICE_WEEKDAYS = 1.20;
    private static final double LETTUCE_PRICE_WEEKDAYS = 0.85;
    private static final double CUCUMBER_PRICE_WEEKDAYS = 1.45;
    private static final double PEPPER_PRICE_WEEKDAYS = 5.50;

    private static final double TOMATO_PRICE_WEEKEND = 2.80;
    private static final double ONION_PRICE_WEEKEND = 1.30;
    private static final double LETTUCE_PRICE_WEEKEND = 0.85;
    private static final double CUCUMBER_PRICE_WEEKEND = 1.75;
    private static final double PEPPER_PRICE_WEEKEND = 3.50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vegetable = scanner.nextLine().toUpperCase(Locale.ROOT);
        String day = scanner.nextLine().toUpperCase(Locale.ROOT);
        double quantity = Double.parseDouble(scanner.nextLine());

        if (day.equals("MONDAY") ||
                day.equals("TUESDAY") ||
                day.equals("WEDNESDAY") ||
                day.equals("THURSDAY") ||
                day.equals("FRIDAY")) {

            switch (vegetable) {
                case "TOMATO" -> System.out.printf("%.2f", TOMATO_PRICE_WEEKDAYS * quantity);
                case "ONION" -> System.out.printf("%.2f", ONION_PRICE_WEEKDAYS * quantity);
                case "LETTUCE" -> System.out.printf("%.2f", LETTUCE_PRICE_WEEKDAYS * quantity);
                case "CUCUMBER" -> System.out.printf("%.2f", CUCUMBER_PRICE_WEEKDAYS * quantity);
                case "PEPPER" -> System.out.printf("%.2f", PEPPER_PRICE_WEEKDAYS * quantity);
                default -> System.out.println("Error");
            }
        } else if (day.equals("SATURDAY") || day.equals("SUNDAY")) {
            switch (vegetable) {
                case "TOMATO" -> System.out.printf("%.2f", TOMATO_PRICE_WEEKEND * quantity);
                case "ONION" -> System.out.printf("%.2f", ONION_PRICE_WEEKEND * quantity);
                case "LETTUCE" -> System.out.printf("%.2f", LETTUCE_PRICE_WEEKEND * quantity);
                case "CUCUMBER" -> System.out.printf("%.2f", CUCUMBER_PRICE_WEEKEND * quantity);
                case "PEPPER" -> System.out.printf("%.2f", PEPPER_PRICE_WEEKEND * quantity);
                default -> System.out.println("Error");
            }
        } else {
            System.out.println("Invalid week day.");
        }
    }
}