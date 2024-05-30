import java.util.Arrays;
import java.util.Scanner;

public class Task_07_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArray = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        if (firstArray.length != secondArray.length) {
            System.out.println("Arrays are not identical.");
            return;
        }

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == secondArray[i]) {
                sum += firstArray[i];
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index", i);
                return;
            }
        }

        System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}