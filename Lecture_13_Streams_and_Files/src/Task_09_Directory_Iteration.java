import java.io.File;
import java.util.ArrayDeque;

public class Task_09_Directory_Iteration {
    public static void main(String[] args) {
        File file = new File("D:\\1. Zheko\\1_Programming\\01_Java\\Lectures\\13_Streams_and_Files\\archive");
        ArrayDeque<File> files = new ArrayDeque<>();

        System.out.println("---");
        System.out.println("Breadth-First Search (BFS) Traversal");
        System.out.println("---");
        breadthFirstSearch(files, file);

        System.out.println("---");
        System.out.println("Depth-First Search (DFS) Traversal");
        System.out.println("---");
        depthFirstSearch(files, file);

    }

    public static void breadthFirstSearch(ArrayDeque<File> files, File file) {
        files.offer(file);

        while (!files.isEmpty()) {
            File innerFile = files.poll();
            System.out.println(innerFile.getName());

            for (File currentFile : innerFile.listFiles()) {
                if (currentFile.isDirectory()) {
                    files.offer(currentFile);
                } else {
                    System.out.println(currentFile.getName());
                }
            }
        }
    }

    public static void depthFirstSearch(ArrayDeque<File> files, File file) {
        files.push(file);

        while (!files.isEmpty()) {
            File innerFile = files.pop();
            System.out.println(innerFile.getName());

            for (File currentFile : innerFile.listFiles()) {
                if (currentFile.isDirectory()) {
                    files.push(currentFile);
                } else {
                    System.out.println(currentFile.getName());
                }
            }
        }
    }
}