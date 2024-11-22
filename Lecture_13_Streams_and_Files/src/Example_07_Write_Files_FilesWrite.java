import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Example_07_Write_Files_FilesWrite {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Path.of("input.txt"));

        Files.write(Path.of("output-out.txt"), lines);
    }
}