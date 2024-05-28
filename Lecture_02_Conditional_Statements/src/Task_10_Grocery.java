import java.util.Scanner;

public class Task_10_Grocery {
    private static final double TEA_PRICE_SOFIA = 0.50;
    private static final double WATER_PRICE_SOFIA = 0.80;
    private static final double JUICE_PRICE_SOFIA = 1.20;
    private static final double SWEETS_PRICE_SOFIA = 1.45;
    private static final double CHIPS_PRICE_SOFIA = 1.60;

    private static final double TEA_PRICE_PLOVDIV = 0.40;
    private static final double WATER_PRICE_PLOVDIV = 0.70;
    private static final double JUICE_PRICE_PLOVDIV = 1.15;
    private static final double SWEETS_PRICE_PLOVDIV = 1.30;
    private static final double CHIPS_PRICE_PLOVDIV = 1.50;

    private static final double TEA_PRICE_VARNA = 0.45;
    private static final double WATER_PRICE_VARNA = 0.70;
    private static final double JUICE_PRICE_VARNA = 1.10;
    private static final double SWEETS_PRICE_VARNA = 1.35;
    private static final double CHIPS_PRICE_VARNA = 1.55;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        if (!town.equals("Sofia") && !town.equals("Plovdiv") && !town.equals("Varna")) {
            System.out.println("Invalid city!");
            return;
        }

        double totalPrice;

        switch (product) {
            case "tea" -> {
                if (town.equals("Sofia")) {
                    totalPrice = TEA_PRICE_SOFIA * quantity;
                } else if (town.equals("Plovdiv")) {
                    totalPrice = TEA_PRICE_PLOVDIV * quantity;
                } else {
                    totalPrice = TEA_PRICE_VARNA * quantity;
                }
            }
            case "water" -> {
                if (town.equals("Sofia")) {
                    totalPrice = WATER_PRICE_SOFIA * quantity;
                } else if (town.equals("Plovdiv")) {
                    totalPrice = WATER_PRICE_PLOVDIV * quantity;
                } else {
                    totalPrice = WATER_PRICE_VARNA * quantity;
                }
            }
            case "juice" -> {
                if (town.equals("Sofia")) {
                    totalPrice = JUICE_PRICE_SOFIA * quantity;
                } else if (town.equals("Plovdiv")) {
                    totalPrice = JUICE_PRICE_PLOVDIV * quantity;
                } else {
                    totalPrice = JUICE_PRICE_VARNA * quantity;
                }
            }
            case "sweets" -> {
                if (town.equals("Sofia")) {
                    totalPrice = SWEETS_PRICE_SOFIA * quantity;
                } else if (town.equals("Plovdiv")) {
                    totalPrice = SWEETS_PRICE_PLOVDIV * quantity;
                } else {
                    totalPrice = SWEETS_PRICE_VARNA * quantity;
                }
            }
            case "chips" -> {
                if (town.equals("Sofia")) {
                    totalPrice = CHIPS_PRICE_SOFIA * quantity;
                } else if (town.equals("Plovdiv")) {
                    totalPrice = CHIPS_PRICE_PLOVDIV * quantity;
                } else {
                    totalPrice = CHIPS_PRICE_VARNA * quantity;
                }
            }
            default -> {
                System.out.println("Invalid product!");
                return;
            }
        }

        System.out.printf("%.2f", totalPrice);
    }
}