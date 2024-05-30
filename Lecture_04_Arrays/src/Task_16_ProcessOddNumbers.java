import java.util.Arrays;
import java.util.Scanner;

public class Task_16_ProcessOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        for (int i = array.length - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                System.out.print(array[i] * 2 + " ");
            }
        }
    }
}