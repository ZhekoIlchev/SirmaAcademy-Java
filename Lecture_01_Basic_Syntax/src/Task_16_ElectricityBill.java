import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_16_ElectricityBill {
    private static final double FIXED_CHARGE = 10.00;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfUnits = Integer.parseInt(scanner.nextLine());
        double ratePerUnit = Double.parseDouble(scanner.nextLine());

        double totalBill = numberOfUnits * ratePerUnit + FIXED_CHARGE;
        System.out.println(new DecimalFormat("#.00").format(totalBill));
    }
}