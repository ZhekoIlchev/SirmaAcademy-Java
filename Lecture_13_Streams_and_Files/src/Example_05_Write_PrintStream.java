import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Example_05_Write_PrintStream {
    public static void main(String[] args) {
        /**
         * Когато е в директорията на проекта, не е необходимо да задаваме целият път. Вместо това,
         * можем да напишем само името на файла.
         * <p>
         * Логината ще бъде подобна за файла, в който искаме да пишем. В случай, че искаме да е в друга директория,
         * ще бъде необходимо да посочим къде точно искаме да бъде той пример:
         * "D:\\1. Zheko\\1_Programming\\01_Java\\Lectures\\13_Streams_and_Files\\output.txt";
         */
        String path = "input.txt";

        try (FileInputStream inputStream = new FileInputStream(path);
             PrintStream printStream = new PrintStream("output.txt")) {
            int readByte = inputStream.read();
            while (readByte != -1) {

                char symbol = (char) readByte;
                printStream.print(symbol);

                readByte = inputStream.read();
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}