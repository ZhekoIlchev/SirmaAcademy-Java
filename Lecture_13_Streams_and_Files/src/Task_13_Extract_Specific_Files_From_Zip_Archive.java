import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Task_13_Extract_Specific_Files_From_Zip_Archive {
    public static void main(String[] args) {
        String zipFilePath = "archive.zip";
        String outputDir = "extracted_files";

        // Create output directory if it doesn't exist
        File dir = new File(outputDir);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        // Extract only .txt files from the zip archive
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFilePath))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                // Check if the file is a .txt file
                if (entry.getName().endsWith(".txt")) {
                    File newFile = new File(outputDir, entry.getName());

                    // Create directories for nested entries if needed
                    new File(newFile.getParent()).mkdirs();

                    // Write the content of the .txt file to the output directory
                    try (FileOutputStream fos = new FileOutputStream(newFile)) {
                        byte[] buffer = new byte[1024];
                        int length;
                        while ((length = zis.read(buffer)) > 0) {
                            fos.write(buffer, 0, length);
                        }
                    }
                    System.out.println("Extracted: " + newFile.getPath());
                }
                zis.closeEntry();
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}