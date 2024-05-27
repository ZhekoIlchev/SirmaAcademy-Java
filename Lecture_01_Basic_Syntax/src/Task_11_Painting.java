import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_11_Painting {
    private static final int RED_PAINT_PART = 1;
    private static final int YELLOW_PAINT_PART = RED_PAINT_PART * 4;
    private static final int WHITE_PAINT_PART = YELLOW_PAINT_PART * 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPaint = Integer.parseInt(scanner.nextLine());

        double onePartOfPaint = totalPaint / (RED_PAINT_PART + YELLOW_PAINT_PART + WHITE_PAINT_PART * 1.0);
        DecimalFormat df = new DecimalFormat("#.####");

        double redPaint = RED_PAINT_PART * onePartOfPaint;
        System.out.println("Red: " + df.format(redPaint));

        double yellowPaint = YELLOW_PAINT_PART * onePartOfPaint;
        System.out.println("Yellow: " + df.format(yellowPaint));

        double whitePaint = WHITE_PAINT_PART * onePartOfPaint;
        System.out.println("White: " + df.format(whitePaint));
    }
}