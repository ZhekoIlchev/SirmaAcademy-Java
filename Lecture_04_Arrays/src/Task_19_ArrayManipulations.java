import java.util.Arrays;
import java.util.Scanner;

public class Task_19_ArrayManipulations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] commands = scanner.nextLine().split(", ");

        for (int i = 0; i < commands.length; i++) {
            String[] command = commands[i].split(" ");

            switch (command[0]) {
                case "Add" -> array = addNumberToArray(array, Integer.parseInt(command[1]));
                case "Remove" -> array = removeNumberFromArray(array, Integer.parseInt(command[1]));
                case "RemoveAt" -> array = RemoveElementAtIndex(array, Integer.parseInt(command[1]));
                case "Insert" ->
                        array = InsertElementAtIndex(array, Integer.parseInt(command[1]), Integer.parseInt(command[2]));
            }
        }

        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    private static int[] InsertElementAtIndex(int[] array, int number, int index) {
        int[] newArray = new int[array.length + 1];

        if (index == array.length - 1) {
            newArray = addNumberToArray(array, number);
        }

        if (index == 0) {
            for (int i = 1; i < newArray.length; i++) {
                newArray[i] = array[i - 1];
            }
            newArray[0] = number;
        }

        if (0 < index && index < array.length - 1) {
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }

            newArray[index] = number;

            for (int i = index + 1; i < newArray.length; i++) {
                newArray[i] = array[i - 1];
            }
        }

        return newArray;
    }

    private static int[] RemoveElementAtIndex(int[] array, int index) {
        int element = array[index];
        return removeNumberFromArray(array, element);
    }

    private static int[] removeNumberFromArray(int[] array, int number) {
        int[] newArray = new int[array.length - 1];
        int lastIndex = 0;

        for (int i = 0; i < newArray.length; i++) {
            if (array[i] != number) {
                newArray[i] = array[i];
            } else {
                break;
            }
            lastIndex++;
        }

        if (lastIndex != newArray.length) {
            for (int i = lastIndex; i < newArray.length; i++) {
                newArray[i] = array[i + 1];
            }
        }

        return newArray;
    }

    private static int[] addNumberToArray(int[] array, int number) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[newArray.length - 1] = number;
        return newArray;
    }
}