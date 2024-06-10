import java.util.Scanner;

public class Task_07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        repeat(word, count);
    }

    public static void repeat(String word, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(word);
        }
    }
}