import java.util.Arrays;
import java.util.Scanner;

public class Task_03_ReverseAnArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int[] reversedArray = new int[length];

        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = array[i];
        }

        for (int i = reversedArray.length - 1; i >= 0; i--) {
            System.out.print(reversedArray[i] + " ");
        }
    }
}