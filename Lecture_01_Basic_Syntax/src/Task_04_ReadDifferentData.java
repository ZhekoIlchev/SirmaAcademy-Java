import java.util.Scanner;

public class Task_04_ReadDifferentData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        char symbol = scanner.nextLine().charAt(0);
        int number = Integer.parseInt(scanner.nextLine());
        double realNumber = Double.parseDouble(scanner.nextLine());
    }
}