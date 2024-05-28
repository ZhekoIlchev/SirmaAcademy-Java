import java.util.Scanner;

public class Task_26_PotionBrewingDecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ingredient1 = scanner.nextLine();
        String ingredient2 = scanner.nextLine();

        if (ingredient1.equals("herbs")) {
            if (ingredient2.equals("water")) {
                System.out.println("Health potion");
            } else if (ingredient2.equals("oil")) {
                System.out.println("Stealth potion");
            } else {
                System.out.println("Minor stamina potion");
            }
        } else if (ingredient1.equals("berries")) {
            if (ingredient2.equals("sugar")) {
                System.out.println("Speed potion");
            } else {
                System.out.println("Minor energy potion");
            }
        } else {
            System.out.println("No potion");
        }
    }
}