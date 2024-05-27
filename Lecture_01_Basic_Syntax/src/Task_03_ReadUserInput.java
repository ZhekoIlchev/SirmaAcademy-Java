import java.util.Scanner;

public class Task_03_ReadUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        System.out.println(username);
    }
}