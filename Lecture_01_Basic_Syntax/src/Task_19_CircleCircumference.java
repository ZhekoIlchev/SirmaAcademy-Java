import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_19_CircleCircumference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = Double.parseDouble(scanner.nextLine());

        double circumference = 2 * Math.PI * radius;
        System.out.println(new DecimalFormat("#.##").format(circumference));
    }
}