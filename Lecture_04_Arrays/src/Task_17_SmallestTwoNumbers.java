import java.util.Arrays;
import java.util.Scanner;

public class Task_17_SmallestTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int firstSmallestNumber = array[0];
        int secondSmallestNumber = array[1];

        for (int i = 2; i < array.length; i++) {

            if (array[i] < firstSmallestNumber && array[i] > secondSmallestNumber) {
                firstSmallestNumber = array[i];
            } else if (array[i] < secondSmallestNumber && array[i] > firstSmallestNumber) {
                secondSmallestNumber = array[i];
            }

            if (array[i] < firstSmallestNumber && array[i] < secondSmallestNumber) {
                if (firstSmallestNumber <= secondSmallestNumber) {
                    secondSmallestNumber = firstSmallestNumber;
                    firstSmallestNumber = array[i];
                } else {
                    firstSmallestNumber = array[i];
                }
            }
        }

        if (firstSmallestNumber <= secondSmallestNumber) {
            System.out.println(firstSmallestNumber + " " + secondSmallestNumber);
        } else {
            System.out.println(secondSmallestNumber + " " + firstSmallestNumber);
        }
    }
}