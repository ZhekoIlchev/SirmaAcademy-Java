import java.util.Scanner;

public class Task_17_GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int percentage = Integer.parseInt(scanner.nextLine());

        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid input.");
            return;
        }

        if (percentage < 60) {
            System.out.println("F");
        } else if (percentage < 70) {
            System.out.println("D");
        } else if (percentage < 80) {
            System.out.println("C");
        } else if (percentage < 90) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
}