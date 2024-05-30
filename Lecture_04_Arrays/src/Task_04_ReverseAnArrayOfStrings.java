import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task_04_ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(",");
        String[] reversedArray = new String[array.length];

        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }

        for (String element : reversedArray) {
            System.out.print(element + " ");
        }
    }
}