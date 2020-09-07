import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //reads ints from user
        int degreesHour = scanner.nextInt() % 360;

        //calculates degrees of minute hand
        int degreesMinute = (degreesHour % 30) * 12;

        //prints output
        System.out.println();
        System.out.println(degreesMinute);

        // closing the scanner object
        scanner.close();
    }
}