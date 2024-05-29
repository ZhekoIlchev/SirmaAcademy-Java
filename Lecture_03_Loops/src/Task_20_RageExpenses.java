import java.util.Scanner;

public class Task_20_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGameCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double trashedKeyboardCount = 0;
        double totalAmount = 0;

        for (int i = 1; i <= lostGameCount; i++) {
            if (i % 2 == 0) {
                totalAmount += headsetPrice;
            }

            if (i % 3 == 0) {
                totalAmount += mousePrice;
            }

            if (i % 2 == 0 && i % 3 == 0) {
                totalAmount += keyboardPrice;
                trashedKeyboardCount++;
            }

            if (trashedKeyboardCount == 2) {
                totalAmount += displayPrice;
                trashedKeyboardCount = 0;
            }
        }

        System.out.printf("Rage expenses: %.2f lv.", totalAmount);
    }
}