import java.util.Scanner;

public class Task_23_MovieClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());

        if (age < 0) {
            System.out.println("Age must be positive number!");
            return;
        }

        if (age < 13) {
            System.out.println("U-rated movies");
        } else if (age < 18) {
            System.out.println("U and PG-13 rated movies");
        } else {
            System.out.println("All movies");
        }
    }
}