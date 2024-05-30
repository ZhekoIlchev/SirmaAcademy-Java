import java.util.Arrays;
import java.util.Scanner;

public class Task_20_LongestSequenceOfIdenticalElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int element = array[0];
        int maxCount = 1;
        int currentElement = element;
        int currentMaxCount = 1;


        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] == array[i + 1]) {
                currentMaxCount++;

                if (currentMaxCount >= maxCount) {
                    element = currentElement;
                    maxCount = currentMaxCount;
                }

            } else {
                currentMaxCount = 1;
                currentElement = array[i + 1];
            }
        }

        for (int i = 0; i < maxCount; i++) {
            System.out.print(element + " ");
        }
    }
}