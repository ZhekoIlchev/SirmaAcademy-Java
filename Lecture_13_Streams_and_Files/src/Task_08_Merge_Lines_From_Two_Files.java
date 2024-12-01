import java.io.*;

public class Task_08_Merge_Lines_From_Two_Files {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader("task-08-input1.txt"));
             BufferedReader bufferedReader2 = new BufferedReader(new FileReader("task-08-input2.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("task-08-output.txt"))) {

            String firstFileLine = bufferedReader1.readLine();
            String secondFileLine = bufferedReader2.readLine();
            boolean flag1 = true;
            boolean flag2 = true;

            while (flag1 || flag2) {

                if (firstFileLine != null) {
                    bufferedWriter.write(firstFileLine);
                    bufferedWriter.newLine();
                } else {
                    flag1 = false;
                }

                if (secondFileLine != null) {
                    bufferedWriter.write(secondFileLine);
                    bufferedWriter.newLine();
                } else {
                    flag2 = false;
                }

                firstFileLine = bufferedReader1.readLine();
                secondFileLine = bufferedReader2.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}