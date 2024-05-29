import java.util.Scanner;

public class Task_09_SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += 2 * i;
        }

        System.out.println(sum);
    }
}