import java.util.Arrays;
import java.util.Scanner;

public class Task_12_ExtractANonDecreasingSubsequenceFromAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int currentMaxElement = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= currentMaxElement) {
                System.out.print(array[i] + " ");
                currentMaxElement = array[i];
            }
        }
    }
}