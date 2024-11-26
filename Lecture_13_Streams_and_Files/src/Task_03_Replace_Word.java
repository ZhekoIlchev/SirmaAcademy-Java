import java.io.*;

public class Task_03_Replace_Word {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("task-03-input.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("task-03-output.txt"))) {
            String[] pattern = bufferedReader.readLine().split(" -> ");
            String wordToReplace = pattern[0];
            String replacement = pattern[1];

            String line = bufferedReader.readLine();
            while (line != null) {
                String replacedLine = line.replaceAll(wordToReplace, replacement);
                bufferedWriter.write(replacedLine);
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}