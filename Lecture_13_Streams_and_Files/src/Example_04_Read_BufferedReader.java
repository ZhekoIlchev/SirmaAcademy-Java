import java.io.*;

public class Example_04_Read_BufferedReader {
    public static void main(String[] args) {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String line = bufferedReader.readLine();
//            System.out.println(line);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        BufferedReader bufferedReader = new BufferedReader(new FileReader("task-02.txt"));


        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));) {

            String line = bufferedReader.readLine();

            while (line != null) {
                bufferedWriter.write("-" + line + System.lineSeparator());
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}