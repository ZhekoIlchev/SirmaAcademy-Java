import java.util.Scanner;

public class Task_18_MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combination = 0;
        boolean flag = false;

        for (int i = firstNumber; i <= secondNumber; i++) {
            for (int j = firstNumber; j <= secondNumber; j++) {
                combination++;
                int sum = i + j;

                if (sum == magicNumber) {
                    System.out.printf("Combination %d - (%d + %d = %d)%n", combination, i, j, sum);
                    flag = true;
                }
            }
        }

        if (!flag) {
            System.out.printf("%d combinations - neither equals %d", combination, magicNumber);
        }
    }
}