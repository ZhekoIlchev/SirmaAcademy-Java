public class Task_07_Clock {
    public static void main(String[] args) {

        for (int hour = 0; hour < 24; hour++) {
            for (int minutes = 0; minutes < 60; minutes++) {
                System.out.println(String.format("%02d:%02d", hour, minutes));
            }
        }
    }
}