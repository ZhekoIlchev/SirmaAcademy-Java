import java.util.Scanner;

public class Task_04_FaceOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figureType = scanner.nextLine();
        double area = 0;

        switch (figureType) {
            case "square" -> {
                double sideLength = Double.parseDouble(scanner.nextLine());
                area = calculateSquareArea(sideLength);
            }
            case "rectangle" -> {
                double length = Double.parseDouble(scanner.nextLine());
                double width = Double.parseDouble(scanner.nextLine());
                area = calculateRectangleArea(width, length);
            }
            case "triangle" -> {
                double length = Double.parseDouble(scanner.nextLine());
                double height = Double.parseDouble(scanner.nextLine());
                area = calculateTriangleArea(length, height);
            }
            case "circle" -> {
                double radius = Double.parseDouble(scanner.nextLine());
                area = calculateCircleArea(radius);
            }
        }

        System.out.printf("%.2f%n", area);
    }

    private static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    private static double calculateTriangleArea(double length, double height) {
        return (length * height) / 2;
    }

    private static double calculateRectangleArea(double width, double length) {
        return width * length;
    }

    private static double calculateSquareArea(double side) {
        return side * side;
    }
}