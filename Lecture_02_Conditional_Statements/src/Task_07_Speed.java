import java.util.Scanner;

public class Task_07_Speed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = Double.parseDouble(scanner.nextLine());

        if (speed <= 0) {
            System.out.println("The given speed should be greater than 0.");
            return;
        }

        if (speed <= 10) {
            System.out.println("slow");
        } else if (speed <= 60) {
            System.out.println("average");
        } else if (speed <= 120) {
            System.out.println("fast");
        } else if (speed <= 160) {
            System.out.println("super-fast");
        } else {
            System.out.println("turbo-fast");
        }
    }
}