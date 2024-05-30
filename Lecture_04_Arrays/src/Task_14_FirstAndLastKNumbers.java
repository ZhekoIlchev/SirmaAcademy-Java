import java.util.Arrays;
import java.util.Scanner;

public class Task_14_FirstAndLastKNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine());
        int[] array = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        printFirstKElements(array, k);
        System.out.println();
        printLastKElements(array, k);
    }

    private static void printLastKElements(int[] array, int k) {
        for (int i = 0;  i < k; i++) {
            System.out.print(array[array.length - k + i] + " ");
        }
    }

    private static void printFirstKElements(int[] array, int k) {
        for (int i = 0; i < k; i++) {
            System.out.print(array[i] + " ");
        }
    }
}