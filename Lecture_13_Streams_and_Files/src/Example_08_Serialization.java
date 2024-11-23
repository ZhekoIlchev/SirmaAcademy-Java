import java.io.*;

public class Example_08_Serialization {

    public static class Cube implements Serializable {
        String name;
        Double width;
        Double height;
        Double length;

        public Cube(String name, Double width, Double height, Double length) {
            this.name = name;
            this.width = width;
            this.height = height;
            this.length = length;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(String.format("Cube name: %s", this.name));
            stringBuilder.append(System.lineSeparator())
                    .append(String.format("with width: %.2f", this.width))
                    .append(System.lineSeparator())
                    .append(String.format("with height: %.2f", this.height))
                    .append(System.lineSeparator())
                    .append(String.format("with length: %.2f", this.length));

            return stringBuilder.toString();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cube cube = new Cube("iCube", 5d, 7d, 9d);
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("objectFile.txt"));
        outputStream.writeObject(cube);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("objectFile.txt"));
        Cube readCube = (Cube) objectInputStream.readObject();
        System.out.println(readCube);
    }
}