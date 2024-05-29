import java.util.Scanner;

public class Task_12_PseudoFibonacciSequenceSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int first = 0;
        int second = 1;
        int sum = first;

        for (int i = 0; i < n; i++) {
            sum += second;
            int nextNumber = first + second;
            first = second;
            second = nextNumber;
        }

        System.out.println(sum);
    }
}