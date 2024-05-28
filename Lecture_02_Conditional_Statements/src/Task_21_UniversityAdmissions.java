import java.util.Scanner;

public class Task_21_UniversityAdmissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = Integer.parseInt(scanner.nextLine());
        int extracurriculars = Integer.parseInt(scanner.nextLine());

        if (score < 0) {
            System.out.println("Scores must be positive number!");
            return;
        }

        if (score < 80) {
            System.out.println("Not admitted");
        } else if (score < 90 && extracurriculars >= 2) {
            System.out.println("Admitted");
        } else if (score >= 90) {
            System.out.println("Admitted");
        } else {
            System.out.println("Not admitted");
        }
    }
}