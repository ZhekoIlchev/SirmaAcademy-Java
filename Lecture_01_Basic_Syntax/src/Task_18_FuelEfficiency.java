import java.util.Scanner;

public class Task_18_FuelEfficiency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = Double.parseDouble(scanner.nextLine());
        double totalFuelConsumption = Double.parseDouble(scanner.nextLine());
        double fuelEfficiency = distance / totalFuelConsumption;

        System.out.println(fuelEfficiency);
    }
}