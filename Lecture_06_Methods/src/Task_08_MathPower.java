import java.util.Scanner;

public class Task_08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = Double.parseDouble(scanner.nextLine());
        int exponent = Integer.parseInt(scanner.nextLine());

        raisedNumberByPower(base, exponent);
    }

    public static void raisedNumberByPower(double base, int exponent) {
        System.out.println(Math.pow(base, exponent));
    }
}