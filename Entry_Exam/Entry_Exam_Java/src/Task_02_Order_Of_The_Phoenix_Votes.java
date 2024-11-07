import java.util.Scanner;

public class Task_02_Order_Of_The_Phoenix_Votes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] votes = scanner.nextLine().split(", ");
        int finalDecision = 0;
        boolean isEveryoneAbstained = true;


        for (int i = 0; i < votes.length; i++) {
            if (votes[i].equals("Yes")) {
                finalDecision++;
                isEveryoneAbstained = false;
            } else if (votes[i].equals("No")) {
                finalDecision--;
                isEveryoneAbstained = false;
            }
        }

        if (isEveryoneAbstained) {
            System.out.println("Abstain");
            return;
        }

        if (finalDecision > 0) {
            System.out.println("Yes");
        } else if (finalDecision < 0) {
            System.out.println("No");
        } else {
            System.out.println("Tie");
        }
    }
}