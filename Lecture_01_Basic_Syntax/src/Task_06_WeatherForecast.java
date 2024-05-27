import java.util.Scanner;

public class Task_06_WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        int degrees = Integer.parseInt(scanner.nextLine());

        System.out.println(String.format("Today in %s it is %d degrees.", town, degrees));
    }
}