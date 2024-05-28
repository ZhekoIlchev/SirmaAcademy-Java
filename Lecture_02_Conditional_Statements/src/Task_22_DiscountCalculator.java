import java.util.Scanner;

public class Task_22_DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        String membership = scanner.nextLine();

        if (age < 0) {
            System.out.println("Age must be positive number!");
            return;
        }

        if (!membership.equals("Yes") && !membership.equals("No")) {
            System.out.println("Invalid state for membership!");
        }

        int discount;
        boolean hasMembership = membership.equals("Yes");

        if (age < 18) {
            discount = 10;
        } else if (age < 65 && hasMembership) {
            discount = 20;
        } else if (age < 65) {
            discount = 10;
        } else {
            discount = 30;
        }

        System.out.printf("%d%% discount", discount);
    }
}