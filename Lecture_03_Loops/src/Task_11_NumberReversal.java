import java.util.Scanner;

public class Task_11_NumberReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberAsString = scanner.nextLine();
        int numberLength = numberAsString.length() - 1;
        int parsedNumber = Integer.parseInt(numberAsString);
        int reversedNumber = 0;

        while (parsedNumber > 0) {
            int lastDigit = parsedNumber % 10;
            reversedNumber += Math.pow(10, numberLength--) * lastDigit;

            parsedNumber /= 10;
        }

        System.out.println(reversedNumber);
    }
}