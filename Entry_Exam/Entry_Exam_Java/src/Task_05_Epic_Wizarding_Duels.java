import java.util.Scanner;
import java.util.Stack;

public class Task_05_Epic_Wizarding_Duels {
    private static final String JINX_MAGIC = "/";
    private static final String JINX_COUNTER_MAGIC = "\\";
    private static final String CURSE_MAGIC = "!";
    private static final String ANCIENT_MAGIC = "<";
    private static final String ANCIENT_COUNTER_MAGIC = ">";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] magics = scanner.nextLine().split("");
        Stack<String> duel = new Stack<>();

        for (int i = 0; i < magics.length; i++) {
            if (i == 0 || duel.isEmpty()) {
                duel.push(magics[i]);
                continue;
            }

            String previousMagic = duel.peek();
            String currentMagic = magics[i];
            if (previousMagic.equals(JINX_MAGIC) && currentMagic.equals(JINX_COUNTER_MAGIC)) {
                duel.pop();
            } else if (previousMagic.equals(CURSE_MAGIC) && currentMagic.equals(CURSE_MAGIC)) {
                duel.pop();
            } else if (previousMagic.equals(ANCIENT_MAGIC) && currentMagic.equals(ANCIENT_COUNTER_MAGIC)) {
                duel.pop();
            } else {
                duel.push(currentMagic);
            }
        }

        if (duel.isEmpty()) {
            System.out.println("Epic");
        } else {
            System.out.println("Not Epic");
        }
    }
}