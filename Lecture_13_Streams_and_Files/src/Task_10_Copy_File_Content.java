import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task_10_Copy_File_Content {
    public static void main(String[] args) {

        // Define file paths
        String inputFile = "task-10-input.txt";
        String outputFile = "task-10-output.txt";

        // Try-with-resources to automatically close resources
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(inputFile));
             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outputFile))) {

            // Buffer to hold data
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read and write data in chunks
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
}