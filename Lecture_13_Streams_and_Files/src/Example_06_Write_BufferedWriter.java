import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Example_06_Write_BufferedWriter {
    public static void main(String[] args) {
//        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
//             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))) {
//
//            String line = bufferedReader.readLine();
//
//            while (line != null) {
//                bufferedWriter.write("-" + line + System.lineSeparator());
//                line = bufferedReader.readLine();
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("task-03-output.txt"));


//        List<String> lines = new ArrayList<>();
//        lines.add("Line 1");
//        lines.add("Line 2");
//        lines.add("Line 3");
//
//        try {
//            /**
//             * Или трябва да е в try with resources - > try (BufferedWriter writer = new BufferedWriter(new FileWriter("output-write"))){}...
//             * или накрая трябва да се flush and close.
//             */
//            BufferedWriter writer = new BufferedWriter(new FileWriter("output-write"));
//            writer.write(String.join(System.lineSeparator(), lines));
//
//            writer.flush();
//            writer.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


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