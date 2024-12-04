import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task_11_Serialize_and_Deserialize_Map {
    private static final String FILE_NAME = "map.ser";

    public static void main(String[] args) {
        Map<String, Integer> cars = new HashMap<>();
        cars.put("Mercedes", 1);
        cars.put("BMW", 3);
        cars.put("Audi", 5);

        saveMap(cars);

        Map<String, Integer> loadedMap = loadMap();

        for (Map.Entry<String, Integer> entry : loadedMap.entrySet()) {
            System.out.printf("For key: %s, value is: %d%n", entry.getKey(), entry.getValue());
        }
    }

    private static void saveMap(Map<String, Integer> map) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            oos.writeObject(map);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Map<String, Integer> loadMap() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
            return (Map<String, Integer>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}