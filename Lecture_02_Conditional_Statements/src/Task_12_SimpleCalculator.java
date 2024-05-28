import java.util.Scanner;

public class Task_12_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());
        String operation = scanner.nextLine();

        switch (operation) {
            case "add" -> calculateSum(firstNumber, secondNumber);
            case "subtract" -> calculateDifference(firstNumber, secondNumber);
            case "divide" -> calculateQuotient(firstNumber, secondNumber);
            case "multiply" -> calculateProduct(firstNumber, secondNumber);
        }
    }

    private static void calculateProduct(double multiplicand, double multiplier) {
        System.out.printf("%.2f", multiplicand * multiplier);
    }

    private static void calculateQuotient(double dividend, double divisor) {
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed!");
            return;
        }

        System.out.printf("%.2f", dividend / divisor);
    }

    private static void calculateDifference(double minuend, double subtrahend) {
        System.out.printf("%.2f", minuend - subtrahend);
    }

    private static void calculateSum(double addend1, double addend2) {
        System.out.printf("%.2f", addend1 + addend2);
    }
}