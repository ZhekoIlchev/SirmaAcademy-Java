import java.util.Scanner;

public class Task_14_Holiday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double percent;

        if (!season.equals("summer") && !season.equals("winter")) {
            System.out.println("Invalid season!");
            return;
        }

        if (10.00 <= budget && budget <= 100) {
            System.out.println("Somewhere in Bulgaria");
            percent = season.equals("summer") ? 0.3 : 0.7;
        } else if (100 < budget && budget <= 1000.00) {
            System.out.println("Somewhere in Europe");
            percent = season.equals("summer") ? 0.4 : 0.8;
        } else if (1000.00 < budget && budget <= 5000.00) {
            System.out.println("Somewhere in Asia");
            percent = 0.9;
        } else {
            System.out.println("Invalid budget!");
            return;
        }

        System.out.printf("%s - %.2f", season.equals("summer") ? "Camp" : "Hotel", budget * percent);
    }
}