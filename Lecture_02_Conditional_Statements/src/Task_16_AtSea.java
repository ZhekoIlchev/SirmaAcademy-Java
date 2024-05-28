import java.util.Scanner;

public class Task_16_AtSea {
    private static final double SINGLE_ROOM_PRICE = 25.00;
    private static final double APARTMENT_PRICE = 50.00;
    private static final double PRESIDENTIAL_APARTMENT_PRICE = 100.00;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());

        if (days < 0 || days > 365) {
            System.out.println("Invalid count of days!");
            return;
        }

        String roomType = scanner.nextLine();

        if (!roomType.equals("single room") && !roomType.equals("apartment") && !roomType.equals("presidential")) {
            System.out.println("Invalid type of room!");
            return;
        }

        String assessment = scanner.nextLine();

        if (!assessment.equals("positive") && !assessment.equals("negative")) {
            System.out.println("Invalid type of assessment!");
            return;
        }

        double discount;
        double pricePerNight;
        int nights = days - 1;

        switch (roomType) {
            case "apartment" -> {
                if (nights < 10) {
                    discount = 0.3;
                } else if (nights <= 15) {
                    discount = 0.35;
                } else {
                    discount = 0.5;
                }

                pricePerNight = APARTMENT_PRICE;
            }
            case "presidential" -> {
                if (nights < 10) {
                    discount = 0.1;
                } else if (nights <= 15) {
                    discount = 0.15;
                } else {
                    discount = 0.2;
                }

                pricePerNight = PRESIDENTIAL_APARTMENT_PRICE;
            }
            default -> {
                discount = 0;
                pricePerNight = SINGLE_ROOM_PRICE;
            }
        }

        double totalPriceAfterDiscount = nights * pricePerNight * (1 - discount);
        double totalPriceAfterAssessment = assessment.equals("positive") ? totalPriceAfterDiscount * (1 + 0.25)
                : totalPriceAfterDiscount * (1 - 0.1);

        System.out.printf("%.2f", totalPriceAfterAssessment);
    }
}