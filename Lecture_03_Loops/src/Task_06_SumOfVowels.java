import java.util.Scanner;

public class Task_06_SumOfVowels {
//    private static final char LETTER_a = 'a';
//    private static final char LETTER_e = 'e';
//    private static final char LETTER_i = 'i';
//    private static final char LETTER_o = 'o';
//    private static final char LETTER_u = 'u';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            switch (Character.toLowerCase(letter)) {
                case 'a' -> sum += 1;
                case 'e' -> sum += 2;
                case 'i' -> sum += 3;
                case 'o' -> sum += 4;
                case 'u' -> sum += 5;
            }
        }

        System.out.println(sum);
    }
}