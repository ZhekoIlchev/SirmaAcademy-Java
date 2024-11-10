import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task_06_Auror_Battle_Formation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> formation = new ArrayList<>(Arrays.stream(scanner.nextLine().split(", ")).toList());
        String line = scanner.nextLine();

        while (!"end".equals(line)) {
            String[] actions = line.split("\\s+");
            String command = actions[0];

            switch (command) {
                case "destroy" -> {
                    int index = Integer.parseInt(actions[1]);
                    if (isValid(index, formation.size())) {
                        formation.remove(index);
                    } else {
                        line = scanner.nextLine();
                        continue;
                    }
                }
                case "swap" -> {
                    int index1 = Integer.parseInt(actions[1]);
                    int index2 = Integer.parseInt(actions[2]);
                    int formationSize = formation.size();

                    if(index1 == index2) {
                        line = scanner.nextLine();
                        continue;
                    }

                    if (isValid(index1, formationSize) && isValid(index2, formationSize)) {
                        String swap = formation.get(index1);
                        formation.set(index1, formation.get(index2));
                        formation.set(index2, swap);
                    } else {
                        line = scanner.nextLine();
                        continue;
                    }
                }
                case "add" -> {
                    String unit = actions[1];
                    formation.add(unit);
                }
                case "insert" -> {
                    String unit = actions[1];
                    int index = Integer.parseInt(actions[2]);
                    if(isValid(index, formation.size())) {
                        formation.add(index, unit);
                    } else {
                        line = scanner.nextLine();
                        continue;
                    }
                }
                case "center" -> {
                    int formationSize = formation.size();
                    if (formationSize % 2 != 0) {
                        System.out.printf(formation.get(formationSize / 2));
                    } else {
                        System.out.printf("%s %s%n",
                                formation.get((formationSize / 2) - 1),
                                formation.get(formationSize / 2));
                    }

                    line = scanner.nextLine();
                    continue;
                }
            }

            System.out.println(String.join(" ", formation));
            line = scanner.nextLine();
        }
    }

    private static boolean isValid(int index, int size) {
        return 0 <= index && index < size;
    }
}