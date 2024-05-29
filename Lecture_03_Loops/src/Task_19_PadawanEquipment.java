import java.util.Scanner;

public class Task_19_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double lightsaberPricePlusTenPercent = studentsCount * lightsaberPrice * 0.1;
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        double totalSum = 0;

        for (int i = 1; i <= studentsCount; i++) {
            if (i % 6 == 0) {
                totalSum += lightsaberPrice + robePrice;
            } else {
                totalSum += lightsaberPrice + robePrice + beltPrice;
            }
        }

        totalSum += lightsaberPricePlusTenPercent;
        double difference = money - totalSum;

        if (difference >= 0) {
            System.out.printf("The money is enough - it would cost %.2flv.", Math.ceil(totalSum));
        } else {
            System.out.printf("George Lucas will need %.2flv more.", Math.ceil(Math.abs(difference)));
        }
    }
}