import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task_02_Character_Frequency {
    public static void main(String[] args) throws FileNotFoundException {
        Map<Character, Integer> symbols = new LinkedHashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("task-02.txt"))) {
            int readByte = bufferedReader.read();
            while (readByte != -1) {
                Character symbol = (char) readByte;

                symbols.put(symbol, symbols.getOrDefault(symbol, 0) + 1);

                readByte = bufferedReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        symbols.forEach((key, value) -> System.out.printf("%c: %d%n", key, value));
    }
}