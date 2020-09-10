import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        //calculates difference in seconds
        int diffHours = (hours2 - hours1) * 3600;
        int diffMins = (minutes2 - minutes1) * 60;
        int diffSecs = (seconds2 - seconds1);
        
        //calculates and prints output
        int outputSecs = diffHours + diffMins + diffSecs;
        System.out.print(outputSecs);

        //closing the scanner object
        scanner.close();
    }
}