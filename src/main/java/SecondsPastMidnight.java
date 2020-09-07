import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //reads int from user
        int number = scanner.nextInt();

        //calculates hours and minutes from seconds
        int hours = number / 3600;
        int minutes = number / 60;

        //prints output
        System.out.println();
        System.out.println(hours + " " + minutes);

        // closing the scanner object
        scanner.close();
    }
}