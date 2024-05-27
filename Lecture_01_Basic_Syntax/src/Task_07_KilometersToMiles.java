import java.util.Scanner;

public class Task_07_KilometersToMiles {
    private static final double KM_TO_MILES_CONVERSION_FACTOR = 0.621371192;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double km = Double.parseDouble(scanner.nextLine());
        double miles = km * KM_TO_MILES_CONVERSION_FACTOR;

        System.out.println(miles);
    }
}