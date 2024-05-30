import java.util.Arrays;
import java.util.Scanner;

public class Task_18_ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = scanner.nextLine().split(", ");
        Arrays.sort(products);

        for (int i = 0; i < products.length; i++) {
            System.out.println(String.format("%d.%s", i + 1, products[i]));
        }
    }
}