import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example_02_Read_Scanner_Using_FileInputStream {
    public static void main(String[] args) {
        String path = "D:\\1. Zheko\\1_Programming\\01_Java\\Lectures\\13_Streams_and_Files\\example_01.txt";
        try {
            FileInputStream inputStream = new FileInputStream(path);
            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}