import java.util.Arrays;
import java.util.Scanner;

public class Task_10_AddAndRemoveElementsFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] commands = scanner.nextLine().split(",");
        int[] array = new int[1];
        int initialValue = 1;

        for (int i = 0; i < commands.length; i++) {

            if (commands[i].equals("add") && i == 0) {
                array[0] = initialValue++;
            }

            if (commands[i].equals("add") && i != 0) {
                int[] currentArray = new int[array.length + 1];
                copyElementsFromAnArray(currentArray, array, commands[i]);
                currentArray[currentArray.length - 1] = initialValue++;
                array = currentArray;
            }

            if (commands[i].equals("remove") && array.length > 0) {
                int[] currentArray = new int[array.length - 1];
                copyElementsFromAnArray(currentArray, array, commands[i]);
                array = currentArray;
            }
        }

        if (array.length == 0) {
            System.out.println("Empty");
        } else {
            Arrays.stream(array).forEach(e -> System.out.print(e + " "));
        }
    }

    private static void copyElementsFromAnArray(int[] toArray, int[] fromArray, String command) {
        if (command.equals("add")) {
            for (int i = 0; i < fromArray.length; i++) {
                toArray[i] = fromArray[i];
            }
        } else {
            for (int i = 0; i < toArray.length; i++) {
                toArray[i] = fromArray[i];
            }
        }
    }
}