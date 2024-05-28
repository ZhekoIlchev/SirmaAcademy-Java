import java.util.Scanner;

public class Task_09_AddressByAgeAndGender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);

        if (gender == 102) {
            if (0 < age && age < 16) {
                System.out.println("Miss");
            } else if (age >= 16) {
                System.out.println("Ms.");
            } else {
                System.out.println("Invalid state of age.");
            }
        } else if (gender == 109) {
            if (0 < age && age < 16) {
                System.out.println("Master");
            } else if (age >= 16) {
                System.out.println("Mr.");
            } else {
                System.out.println("Invalid state of age.");
            }
        } else {
            System.out.println("It is not a valid gender state.");
        }
    }
}