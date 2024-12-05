import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task_12_Serialize_Custom_Object_List {
    private static final String FILE_NAME = "people.ser";

    public static class Person implements Serializable {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return this.name + " is " + this.age + " years old";
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person boyana = new Person("Boyana", 17);
        Person diana = new Person("Diana", 21);
        Person anna = new Person("Anna", 25);

        people.add(boyana);
        people.add(diana);
        people.add(anna);

        saveList(people);

        List<Person> loadedList = loadList();
        loadedList.forEach(System.out::println);
    }

    private static void saveList(List<Person> people) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            oos.writeObject(people);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Person> loadList() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
            return (List<Person>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}