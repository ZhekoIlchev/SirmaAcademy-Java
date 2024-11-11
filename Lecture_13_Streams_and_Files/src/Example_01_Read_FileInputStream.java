import java.io.FileInputStream;
import java.io.IOException;

public class Example_01_Read_FileInputStream {
    public static void main(String[] args) throws IOException {
        String path = "D:\\1. Zheko\\1_Programming\\01_Java\\Lectures\\13_Streams_and_Files\\example_01.txt";
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream(path);
            int readByte = inputStream.read();

            while (readByte != -1) {

                // System.out.print(readByte); -> 72
                //System.out.print(Integer.toBinaryString(readByte) + " "); -> 1001000
                System.out.print((char) readByte);
                readByte = inputStream.read();
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if(inputStream != null) {
                inputStream.close();
            }
        }
    }
}