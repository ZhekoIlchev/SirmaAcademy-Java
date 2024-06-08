import java.util.Scanner;

public class Task_05_Shop {
    private static final double COFFEE_PRICE = 1.50;
    private static final double WATER_PRICE = 1.00;
    private static final double COKE_PRICE = 1.40;
    private static final double SNACKS_PRICE = 2.00;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        calculateTotalPrice(product, quantity);
    }

    public static void calculateTotalPrice(String product, int quantity) {
        switch (product) {
            case "coffee" -> System.out.println(COFFEE_PRICE * quantity);
            case "water" -> System.out.println(WATER_PRICE * quantity);
            case "coke" -> System.out.println(COKE_PRICE * quantity);
            case "snacks" -> System.out.println(SNACKS_PRICE * quantity);
        }
    }
}