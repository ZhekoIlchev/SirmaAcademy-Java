import java.util.Scanner;

public class Task_29_ArchitecturalEraIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.nextLine());
        String material = scanner.nextLine();

        if (year < 500 && material.equals("stone")) {
            System.out.println("Ancient");
        } else if (year <= 1500 && material.equals("stone")) {
            System.out.println("Medieval");
        } else if (year <= 1800 && material.equals("wood")) {
            System.out.println("Colonial");
        } else if (year <= 1900 && material.equals("steel")) {
            System.out.println("Industrial");
        } else if (year > 1900 && material.equals("steel")) {
            System.out.println("Modern");
        } else {
            System.out.println("Uncertain");
        }
    }
}