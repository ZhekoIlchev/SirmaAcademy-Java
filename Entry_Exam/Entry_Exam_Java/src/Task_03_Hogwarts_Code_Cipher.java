import java.util.Scanner;

public class Task_03_Hogwarts_Code_Cipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine();
        int secretCode = Integer.parseInt(scanner.nextLine());
        StringBuilder decryptedMessage = new StringBuilder();

        if ((1 <= encryptedMessage.length() && encryptedMessage.length() <= 100) && (1 <= secretCode && secretCode <= 25)) {
            for (int i = 0; i < encryptedMessage.length(); i++) {
                int letterAsciiCode = encryptedMessage.charAt(i);
                char decryptedLetter = (char) (letterAsciiCode - secretCode);
                decryptedMessage.append(decryptedLetter);
            }

            System.out.println(decryptedMessage);
        } else {
            System.out.println("Invalid message or code!");
        }
    }
}