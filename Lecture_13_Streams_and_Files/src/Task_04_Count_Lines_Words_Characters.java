import java.io.*;

public class Task_04_Count_Lines_Words_Characters {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("task-04.txt")));
        int lines = 0;
        int words = 0;
        int characters = 0;

        try {
            String readLine = bufferedReader.readLine();

            while (readLine != null) {
                lines++;
                String[] splitLine = readLine.split(" ");
                words += splitLine.length;

                for (String word : splitLine) {
                    characters += word.length();
                }

                readLine = bufferedReader.readLine();
            }

            System.out.println("Lines are: " + lines);
            System.out.println("Words are: " + words);
            System.out.println("Characters are: " + characters);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}