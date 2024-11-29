import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Task_06_Reverse_Lines {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("task-06-input.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("task-06-output.txt"))) {
            String line = bufferedReader.readLine();
            StringBuilder stringBuilder = new StringBuilder();

            while (line != null) {
                stringBuilder.append(line)
                        .reverse();

                bufferedWriter.write(stringBuilder.toString());
                bufferedWriter.newLine();
                stringBuilder.setLength(0);

                line = bufferedReader.readLine();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}