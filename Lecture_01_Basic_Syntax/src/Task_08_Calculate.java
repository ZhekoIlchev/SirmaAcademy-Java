import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_08_Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int sum = calculateSum(firstNumber, secondNumber);
        System.out.println("The sum is: " + sum);

        int difference = calculateDifference(firstNumber, secondNumber);
        System.out.println("The difference is: " + difference);

        int product = calculateProduct(firstNumber, secondNumber);
        System.out.println("The product is: " + product);

        String average = calculateAverage(firstNumber, secondNumber);
        System.out.println("The average is: " + average);
    }

    private static String calculateAverage(int firstNumber, int secondNumber) {
        double average = (firstNumber + secondNumber) / 2D;

        DecimalFormat df = new DecimalFormat("#.000000");
        return df.format(average);
    }

    private static int calculateProduct(int multiplicand, int multiplier) {
        return Math.abs(multiplicand * multiplier);
    }

    private static int calculateDifference(int addend1, int addend2) {
        return Math.abs(addend1 - addend2);
    }

    private static int calculateSum(int minuend, int subtrahend) {
        return Math.abs(minuend + subtrahend);
    }
}