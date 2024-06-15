import java.util.Scanner;

public class Task_12_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        validatePassword(password);

    }

    private static void validatePassword(String password) {
        StringBuilder sb = new StringBuilder();
        boolean isAlphanumeric = true;
        int digitsCount = 0;

        if (password.length() < 6 || password.length() > 10) {
            sb.append("Password must be between 6 and 10 characters.")
                    .append(System.lineSeparator());
        }

        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);

            if (!Character.isLetter(symbol) && !Character.isDigit(symbol)) {
                isAlphanumeric = false;
            }

            if (Character.isDigit(symbol)) {
                digitsCount++;
            }
        }

        if (!isAlphanumeric) {
            sb.append("Password must contain only letters and digits.")
                    .append(System.lineSeparator());
        }

        if (digitsCount < 2) {
            sb.append("Password must have at least 2 digits.")
                    .append(System.lineSeparator());
        }

        if (sb.isEmpty()) {
            System.out.println("Password is valid.");
        } else {
            System.out.println(sb.toString().trim());
        }
    }
}