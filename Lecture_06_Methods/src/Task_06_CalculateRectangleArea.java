import java.util.Scanner;

public class Task_06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        calculateRectangleArea(width, height);
    }

    public static void calculateRectangleArea(int width, int height) {
        System.out.println(width * height);
    }
}