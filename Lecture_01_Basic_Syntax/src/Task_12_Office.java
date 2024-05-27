import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_12_Office {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstCabinetPrice = Double.parseDouble(scanner.nextLine());

        double secondCabinetPrice = (1 - 0.2) * firstCabinetPrice;
        double thirdCabinetPrice = (1 + 0.15) * (firstCabinetPrice + secondCabinetPrice);
        double totalPrice = firstCabinetPrice + secondCabinetPrice + thirdCabinetPrice;

        System.out.println(new DecimalFormat("#.000").format(totalPrice));
    }
}