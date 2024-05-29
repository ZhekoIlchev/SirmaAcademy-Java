import java.util.Scanner;

public class Task_16_HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == 0 || i == row - 1) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == column - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
//            for (int j = 0; j < column; j++) {
//                if (j == i) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
            System.out.println();
        }
    }
}