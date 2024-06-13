import java.util.Scanner;

public class Task_10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int evenSum = calculateSumOfEvenPositionDigits(number);
        int oddSum = calculateSumOfOddPositionDigits(number);

        System.out.println(evenSum * oddSum);
    }

    private static int calculateSumOfOddPositionDigits(String number) {
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            if (i % 2 != 0) {
                int digit = Integer.parseInt(String.valueOf(number.charAt(i)));
                sum += digit;
            }
        }
        return sum;
    }

    private static int calculateSumOfEvenPositionDigits(String number) {
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            if (i % 2 == 0) {
                int digit = Integer.parseInt(String.valueOf(number.charAt(i)));
                sum += digit;
            }
        }
        return sum;
    }
}