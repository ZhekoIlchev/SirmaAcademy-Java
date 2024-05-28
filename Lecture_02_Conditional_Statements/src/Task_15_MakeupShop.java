import java.util.Scanner;

public class Task_15_MakeupShop {
    private static final double POWDER_PRICE = 2.60;
    private static final double LIPSTICK_PRICE = 3.00;
    private static final double SPIRAL_PRICE = 4.10;
    private static final double SHADOWS_PRICE = 8.20;
    private static final double CONCEALER_PRICE = 2.00;
    private static final double SHOP_RENT = 0.1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double renovationPrice = Double.parseDouble(scanner.nextLine());
        int powdersCount = Integer.parseInt(scanner.nextLine());
        int lipsticksCount = Integer.parseInt(scanner.nextLine());
        int spiralsCount = Integer.parseInt(scanner.nextLine());
        int shadowsCount = Integer.parseInt(scanner.nextLine());
        int concealersCount = Integer.parseInt(scanner.nextLine());

        int makeupsCount = powdersCount + lipsticksCount + spiralsCount + shadowsCount + concealersCount;
        double discount = makeupsCount >= 50 ? 0.25 : 0;

        double totalPriceForMakeups = (powdersCount * POWDER_PRICE + lipsticksCount * LIPSTICK_PRICE +
                spiralsCount * SPIRAL_PRICE + shadowsCount * SHADOWS_PRICE + concealersCount * CONCEALER_PRICE) * (1 - discount);

        double totalProfitAfterRent = totalPriceForMakeups * (1 - SHOP_RENT);
        double profitAfterRenovation = totalProfitAfterRent - renovationPrice;

        if (profitAfterRenovation >= 0) {
            System.out.printf("Yes! %.2f lv. left", profitAfterRenovation);
        } else {
            System.out.println("Not enough money!");
            System.out.println(String.format("%.2f lv. needed.", Math.abs(profitAfterRenovation)));
        }
    }
}