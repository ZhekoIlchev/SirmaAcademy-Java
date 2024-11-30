import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task_07_Count_Unique_Words {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("task-07.txt")))) {
            String line = bufferedReader.readLine();
            Set<String> uniqueWords = new HashSet<>();

            while (line != null) {
                String[] words = line.replaceAll("\\.", "").split("\\s+");

                uniqueWords.addAll(List.of(words));

                line = bufferedReader.readLine();
            }

            System.out.println("Unique words: " + uniqueWords.size());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}