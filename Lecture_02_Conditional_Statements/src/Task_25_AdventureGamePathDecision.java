import java.util.Scanner;

public class Task_25_AdventureGamePathDecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item1 = scanner.nextLine();
        String item2 = scanner.nextLine();

        if (item1.equals("sword")) {
            if (item2.equals("shield")) {
                System.out.println("Path to the castle");
            } else {
                System.out.println("Path to the forest");
            }
        } else if (item1.equals("map")) {
            if (item2.equals("coins")) {
                System.out.println("Go to the town");
            } else {
                System.out.println("Camp");
            }
        } else {
            System.out.println("Wander aimlessly");
        }
    }
}