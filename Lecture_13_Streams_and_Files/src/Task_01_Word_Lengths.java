import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_01_Word_Lengths {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("task-01.txt")))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                lines.addAll(Arrays.stream(line.split(" ")).toList());
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<String> wordsLength = lines.stream().map(e -> String.valueOf(e.length())).toList();
        System.out.println(String.join(", ", wordsLength));
    }
}