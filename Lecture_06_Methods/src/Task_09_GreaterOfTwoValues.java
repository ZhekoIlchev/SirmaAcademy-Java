import java.util.Objects;
import java.util.Scanner;

public class Task_09_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        switch (Objects.requireNonNull(checkType(str1))) {
            case "Integer" -> {
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                System.out.println(getMax(num1, num2));
            }
            case "Character" -> {
                char symbol1 = str1.charAt(0);
                char symbol2 = str2.charAt(0);
                System.out.println(getMax(symbol1, symbol2));
            }
            case "String" -> System.out.println(getMax(str1, str2));
        }
    }

    public static String getMax(String str1, String str2) {
        if (str1.equals(str2)) {
            return str1;
        }

        int result = str1.compareTo(str2);
        return result > 0 ? str1 : str2;
    }

    public static char getMax(char char1, char char2) {
        return char1 >= char2 ? char1 : char2;
    }

    public static int getMax(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static String checkType(String value) {

        if (isInteger(value)) {
            return "Integer";
        } else if (isCharacter(value)) {
            return "Character";
        } else {
            return "String";
        }
    }

    private static boolean isCharacter(String value) {
        return value.length() == 1;
    }

    private static boolean isInteger(String value) {
        try {
            Integer.parseInt(value);
            return true;

        } catch (NumberFormatException e) {
            return false;
        }
    }
}