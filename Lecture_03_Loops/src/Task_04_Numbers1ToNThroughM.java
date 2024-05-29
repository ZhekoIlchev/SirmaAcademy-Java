import java.util.Scanner;

public class Task_04_Numbers1ToNThroughM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int endNumber = Integer.parseInt(scanner.nextLine());
        int step = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < endNumber; i += step) {
            System.out.println(i);
        }
    }
}