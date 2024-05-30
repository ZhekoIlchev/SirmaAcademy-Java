import java.util.Scanner;

public class Task_11_RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(",");
        int rotationCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotationCount; i++) {
            String lastElement = array[array.length - 1];
            array = rotateMiddleElements(array, lastElement);
        }

        for (String element : array) {
            System.out.print(element + " ");
        }
    }

    private static String[] rotateMiddleElements(String[] initialArray, String lastElement) {
        String[] rotatedArray = new String[initialArray.length];

        for (int i = 0; i < initialArray.length - 1; i++) {
            rotatedArray[i + 1] = initialArray[i];
        }

        rotatedArray[0] = lastElement;
        return rotatedArray;
    }
}