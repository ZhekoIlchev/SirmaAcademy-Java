import java.util.Scanner;

public class Task_05_Printing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        System.out.println(text);

        char symbol = scanner.nextLine().charAt(0);
        System.out.println(symbol);

        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(number);

        double realNumber = Double.parseDouble(scanner.nextLine());
        System.out.println(realNumber);
    }
}