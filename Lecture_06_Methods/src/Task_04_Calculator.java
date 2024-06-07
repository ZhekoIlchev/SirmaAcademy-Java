import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_04_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        switch (action) {
            case "add" -> System.out.println(calculateSum(number1, number2));
            case "multiply" -> System.out.println(calculateProduct(number1, number2));
            case "subtract" -> System.out.println(calculateDifference(number1, number2));
            case "divide" -> System.out.println(calculateQuotient(number1, number2));
        }
    }

    private static String calculateQuotient(double dividend, double divisor) {
        double quotient = dividend / divisor;

        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(quotient);
    }

    private static int calculateProduct(int multiplicand, int multiplier) {
        return Math.abs(multiplicand * multiplier);
    }

    private static int calculateDifference(int minuend, int subtrahend) {
        return Math.abs(minuend - subtrahend);
    }

    private static int calculateSum(int addend1, int addend2) {
        return Math.abs(addend1 + addend2);
    }
}