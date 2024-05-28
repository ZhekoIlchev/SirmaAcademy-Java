import java.util.Scanner;

public class Task_02_LargerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int largerNumber = findLargerNumber(firstNumber, secondNumber);
        System.out.println(largerNumber);
    }

    private static int findLargerNumber(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) {
            return firstNumber;
        }

        return secondNumber;
    }
}