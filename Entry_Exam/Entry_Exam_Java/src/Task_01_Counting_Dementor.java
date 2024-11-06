import java.util.Scanner;

public class Task_01_Counting_Dementor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialCount = Integer.parseInt(scanner.nextLine());
        int increaseCount = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        int totalCount = initialCount;

        for (int i = 1; i < hours; i++) {
            initialCount += increaseCount;
            totalCount += initialCount;
        }

        System.out.println(totalCount);
    }
}