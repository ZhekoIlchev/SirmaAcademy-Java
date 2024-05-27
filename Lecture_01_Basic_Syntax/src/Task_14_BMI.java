import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_14_BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double bodyMassIndex = weight / Math.pow(height, 2);
        System.out.println(new DecimalFormat("#.##").format(bodyMassIndex));
    }
}