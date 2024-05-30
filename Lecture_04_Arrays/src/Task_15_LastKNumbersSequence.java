import java.util.Scanner;

public class Task_15_LastKNumbersSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int previousElementsCount = Integer.parseInt(scanner.nextLine());
        int[] array = new int[length];
        int firstElement = 1;

        for (int i = 0; i < length; i++) {

            if (i == 0) {
                array[i] = firstElement;
            } else if (i + 1 <= previousElementsCount) {
                array[i] = calculateElementValue(array, i);
            } else {
                array[i] = calculateElementValue(array, i, previousElementsCount);
            }

        }

        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    private static int calculateElementValue(int[] array, int index, int previousElementsCount) {
        int sum = 0;
        for (int i = index - 1; i >= index - previousElementsCount; i--) {
            sum += array[i];
        }
        return sum;
    }

    private static int calculateElementValue(int[] array, int index) {
        int sum = 0;
        for (int i = index - 1; i >= 0; i--) {
            sum += array[i];
        }
        return sum;
    }
}