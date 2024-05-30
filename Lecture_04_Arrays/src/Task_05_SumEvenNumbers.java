import java.util.Arrays;
import java.util.Scanner;

public class Task_05_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;

        for (int element : array) {
            if (element % 2 == 0) {
                evenSum += element;
            }
        }

        System.out.println(evenSum);
    }
}