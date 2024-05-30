import java.util.Scanner;

public class Task_09_PrintEveryNthElementFromAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(",");
        int step = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < array.length; i += step) {
            System.out.print(array[i] + " ");
        }
    }
}