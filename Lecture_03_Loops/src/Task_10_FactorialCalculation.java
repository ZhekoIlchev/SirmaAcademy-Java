import java.util.Scanner;

public class Task_10_FactorialCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int nFactorial = 1;

        for (int i = n; i > 0; i--) {
            nFactorial *= i;
        }

        System.out.println(nFactorial);
    }
}