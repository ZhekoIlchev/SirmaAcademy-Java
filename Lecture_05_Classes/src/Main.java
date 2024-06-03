import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static constants.GlobalConstants.*;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter task number [1...8].");
        int task = Integer.parseInt(new Scanner(System.in).nextLine());

        switch (task) {
            //Task 1.
            case 1 -> {
                List<String> carInfo = Files.readAllLines(Path.of(TASK_01_INPUT));
                List<Car> cars = new ArrayList<>();

                createCars(carInfo, cars);
                printCarsInfo(cars);
            }
            //Task 2.
            case 2 -> {
                List<String> carInfo = Files.readAllLines(Path.of(TASK_02_INPUT));
                List<Car> cars = new ArrayList<>();

                createCars(carInfo, cars);
                printCarsInfo(cars);
            }
            //Task 3.
            case 3 -> {
                List<String> bankAccountInfo = Files.readAllLines(Path.of(TASK_03_INPUT));
                List<BankAccount> accounts = new ArrayList<>();

                manipulateAccounts(bankAccountInfo, accounts);
            }
            //Task 4.
            case 4 -> {
                Engine engine = new Engine(550);
                Vehicle vehicle = new Vehicle("Mercedes-Benz", "S65", engine, 200);

                vehicle.drive(100);
                System.out.println(vehicle.getFuel());
            }
            //Task 5.
            case 5 -> {
                Product product1 = new Product("Cucumber", 1.50, 15);
                Product product2 = new Product("Tomato", 0.90, 25);
                Product product3 = new Product("Bread", 1.10, 8);
                Storage storage = new Storage(50);

                storage.addProduct(product1);
                storage.addProduct(product2);
                storage.addProduct(product3);

                storage.getProducts();
                System.out.println(storage.getCapacity());
                System.out.println(storage.getTotalCost());
            }
            //Task 6.
            case 6 -> {
                String[] words1 = {"Just", "have", "fun", "with", "Java"};
                String[] words2 = {"Java", "is", "one", "of", "the", "programming", "languages"};
                Random rnd = new Random();

                randomizeList(words1, rnd);
                randomizeList(words2, rnd);

                printElements(words1);
                System.out.println();
                printElements(words2);
            }
            //Task 7.
            case 7 -> {
                List<String> studentsInfo = Files.readAllLines(Path.of(TASK_07_INPUT));
                List<Student> students = new ArrayList<>();

                addStudents(studentsInfo, students);
                filterStudentsByHometown(studentsInfo.get(studentsInfo.size() - 1), students);
            }
            //Task 8.
            case 8 -> {
                List<String> commands = Files.readAllLines(Path.of(TASK_08_INPUT));
                Article article = new Article("Foundation", "Brilliant", "Isaak Asimov");
                int n = 3;

                manipulateArticle(n, article, commands);
                System.out.println(article);
            }
        }
    }

    private static void manipulateArticle(int n, Article article, List<String> commands) {

        for (int i = 0; i < n; i++) {
            String[] command = commands.get(i).split(": ");

            switch (command[0]) {
                case "Edit" -> {
                    String newContent = command[1];
                    article.editContent(newContent);
                }
                case "ChangeAuthor" -> {
                    String newAuthor = command[1];
                    article.changeAuthor(newAuthor);
                }
                case "Rename" -> {
                    String newTitle = command[1];
                    article.renameTitle(newTitle);
                }
            }
        }
    }

    private static void filterStudentsByHometown(String hometown, List<Student> students) {
        students.stream()
                .filter(e -> e.getHometown().equals(hometown))
                .forEach(System.out::println);
    }

    private static void addStudents(List<String> studentsInfo, List<Student> students) {
        for (int i = 0; i < studentsInfo.size() - 2; i++) {
            String[] info = studentsInfo.get(i).split(" ");

            String firstName = info[0];
            String lastName = info[1];
            int age = Integer.parseInt(info[2]);
            String hometown = info[3];

            Student student = new Student(firstName, lastName, age, hometown);
            students.add(student);
        }
    }

    private static void printElements(String[] array) {
        for (String element : array) {
            System.out.println(element);
        }
    }

    private static void randomizeList(String[] array, Random rnd) {
        for (int i = 0; i < array.length; i++) {
            int index1 = rnd.nextInt(array.length);
            int index2 = rnd.nextInt(array.length);
            String swap = array[index1];
            array[index1] = array[index2];
            array[index2] = swap;
        }
    }

    private static void manipulateAccounts(List<String> bankAccountInfo, List<BankAccount> accounts) {
        for (int i = 0; i < bankAccountInfo.size(); i++) {
            String[] commands = bankAccountInfo.get(i).split(" ");

            switch (commands[0]) {
                case "Create" -> {
                    BankAccount account = new BankAccount();
                    account.sendMessageForAccountCreation();
                    accounts.add(account);
                }
                case "Deposit" -> {
                    int accountId = Integer.parseInt(commands[1]);
                    double amount = Double.parseDouble(commands[2]);
                    int searchingAccountId = getSearchingAccountId(accounts, accountId);

                    if (searchingAccountId != -1) {
                        accounts.get(searchingAccountId).deposit(amount);
                    } else {
                        System.out.println("Account does not exist");
                    }
                }
                case "GetInterest" -> {
                    int accountId = Integer.parseInt(commands[1]);
                    int years = Integer.parseInt(commands[1]);
                    int searchingAccountId = getSearchingAccountId(accounts, accountId);

                    if (searchingAccountId != -1) {
                        System.out.println(accounts.get(searchingAccountId).getInterest(years));
                    } else {
                        System.out.println("Account does not exist");
                    }
                }
                case "SetInterest" -> {
                    double interestRate = Double.parseDouble(commands[1]);
                    BankAccount.setInterest(interestRate, accounts);
                }
            }
        }
    }

    private static int getSearchingAccountId(List<BankAccount> accounts, int accountId) {
        int searchingAccountId = -1;

        for (int j = 0; j < accounts.size(); j++) {
            if (accounts.get(j).getId() == accountId) {
                searchingAccountId = j;
                break;
            }
        }
        return searchingAccountId;
    }

    private static void printCarsInfo(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getCarInfo());
        }
    }

    private static void createCars(List<String> carInfo, List<Car> cars) {
        int index = 0;
        while (index < carInfo.size()) {

            if (Character.isDigit(carInfo.get(index).charAt(0))) {
                int count = Integer.parseInt((carInfo.get(index++)));
                Car car;

                for (int i = 0; i < count; i++) {

                    String[] carInformation = carInfo.get(index++).split(" ");
                    String brand = carInformation[0];

                    if (carInformation.length == 3) {

                        String model = carInformation[1];
                        int horsepower = Integer.parseInt(carInformation[2]);
                        car = new Car(brand, model, horsepower);

                    } else if (carInformation.length == 2) {

                        if (Character.isDigit(carInformation[1].charAt(0))) {
                            int horsepower = Integer.parseInt(carInformation[1]);
                            car = new Car(brand, horsepower);
                        } else {
                            String model = carInformation[1];
                            car = new Car(brand, model);
                        }

                    } else if (carInformation.length == 1) {
                        car = new Car(brand);
                    } else {
                        car = new Car();
                    }
                    cars.add(car);
                }
            }
        }
    }
}