import java.util.Arrays;
import java.util.Scanner;

public class Task_08_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();

        while (array.length > 1) {
            int[] condensedArray = new int[array.length - 1];
            for (int i = 0; i < array.length - 1; i++) {
                condensedArray[i] = array[i] + array[i + 1];
            }
            array = condensedArray;
        }

        System.out.println(array[0]);
    }
}