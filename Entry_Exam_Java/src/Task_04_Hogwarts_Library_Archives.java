import java.util.Scanner;

public class Task_04_Hogwarts_Library_Archives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] archive = scanner.nextLine().split(", ");
        String searchingRecord = scanner.nextLine();
        int firstOccurrence = -1;
        int lastOccurrence = -1;

        for (int startIndex = 0; startIndex < archive.length; startIndex++) {
            if (archive[startIndex].equals(searchingRecord) && firstOccurrence == -1) {
                firstOccurrence = startIndex;
            }

            if (archive[archive.length - 1 - startIndex].equals(searchingRecord) && lastOccurrence == -1) {
                lastOccurrence = archive.length - 1 - startIndex;
            }
        }

        if (firstOccurrence != -1) {
            StringBuilder message = new StringBuilder();

            message.append("First Occurrence: ")
                    .append(firstOccurrence)
                    .append(System.lineSeparator())
                    .append("Last Occurrence: ")
                    .append(lastOccurrence);

            System.out.println(message);
        } else {
            System.out.println("Record not found");
        }
    }
}