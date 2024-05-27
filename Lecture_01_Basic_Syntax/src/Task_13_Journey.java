import java.util.Scanner;

public class Task_13_Journey {
    private static final int FIRST_CAR_TIME = 5;
    private static final int SECOND_CAR_TIME = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstCarSpeed = Integer.parseInt(scanner.nextLine());
        int secondCarSpeed = Integer.parseInt(scanner.nextLine());

        int firstCarDistance = firstCarSpeed * FIRST_CAR_TIME;
        int secondCarDistance = secondCarSpeed * SECOND_CAR_TIME;

        int distanceBetweenCars = Math.abs(firstCarDistance - secondCarDistance);
        System.out.println(distanceBetweenCars);
    }
}