import java.util.Locale;
import java.util.Scanner;

public class Task_28_ClimateZoneIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double latitude = Math.abs(Double.parseDouble(scanner.nextLine()));
        String hemisphere = scanner.next();

        if (latitude < -90 || latitude > 90) {
            System.out.println("Latitude value must be [-90...90].");
            return;
        }

        if (latitude == 0) {
            System.out.println("Equator");
        } else if (latitude < 23.5) {
            System.out.println("Tropic Zone");
        } else if (latitude <= 66.5) {
            System.out.println("Temperate Zone");
        } else {
            System.out.println("Arctic Zone");
        }
    }
}