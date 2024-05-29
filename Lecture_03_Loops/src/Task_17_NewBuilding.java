import java.util.Scanner;

public class Task_17_NewBuilding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floorCount = Integer.parseInt(scanner.nextLine());
        int roomsCount = Integer.parseInt(scanner.nextLine());

        for (int i = floorCount; i > 0; i--) {
            for (int j = 0; j < roomsCount; j++) {
                if (i == floorCount) {
                    System.out.printf("L%d%d ", i, j);
                } else {
                    if (i % 2 == 0) {
                        System.out.printf("O%d%d ", i, j);
                    } else {
                        System.out.printf("A%d%d ", i, j);
                    }
                }
            }
            System.out.println();
        }
    }
}