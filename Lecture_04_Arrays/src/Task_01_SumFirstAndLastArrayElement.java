import java.util.Arrays;
import java.util.Scanner;

public class Task_01_SumFirstAndLastArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int firstElement = array[0];
        int lastElement = array[array.length - 1];
        int sum = firstElement + lastElement;
        System.out.println(sum);
    }
}