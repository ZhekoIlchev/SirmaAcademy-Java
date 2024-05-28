import java.util.Scanner;

public class Task_19_MovieTicketPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());

        if (age < 0) {
            System.out.println("Age should be positive number!");
            return;
        }

        if (age < 13) {
            System.out.println("$5");
        } else if (age < 20) {
            System.out.println("$8");
        } else {
            System.out.println("$10");
        }
    }
}