import java.util.Scanner;

public class Task_14_ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberAsString = scanner.nextLine();
        int parsedNumber = Integer.parseInt(numberAsString);
        int numberLength = numberAsString.length();
        int sum = 0;

        while (parsedNumber > 0) {
            int lastDigit = parsedNumber % 10;
            sum += Math.pow(lastDigit, numberLength);
            parsedNumber /= 10;
        }


        if (sum == Integer.parseInt(numberAsString)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}