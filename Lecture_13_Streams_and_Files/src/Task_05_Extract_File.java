import java.io.File;

public class Task_05_Extract_File {
    public static void main(String[] args) {
        File file = new File("D:\\1. Zheko\\1_Programming\\01_Java\\Lectures\\13_Streams_and_Files\\13. Streams & Files - Exercise.docs");
        int dotIndex = file.getName().lastIndexOf(".");
        String fileName = file.getName().substring(0, dotIndex);
        long fileSize = file.length();
        String fileExtension = file.getName().substring(dotIndex + 1);

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);
        System.out.println("File size: " + fileSize);
    }
}