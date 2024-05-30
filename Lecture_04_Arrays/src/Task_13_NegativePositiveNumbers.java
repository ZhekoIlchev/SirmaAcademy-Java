import java.util.Arrays;
import java.util.Scanner;

public class Task_13_NegativePositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] resultArray = new int[array.length];

        int startIndex = 0;
        int endIndex = array.length - 1;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] < 0) {
                resultArray[startIndex++] = array[i];
            } else {
                resultArray[endIndex--] = array[i];
            }
        }

        for (int element : resultArray) {
            System.out.println(element);
        }
    }
}