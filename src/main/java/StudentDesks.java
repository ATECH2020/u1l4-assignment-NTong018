import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //reads ints from user
        int students1 = scanner.nextInt();
        int students2 = scanner.nextInt();
        int students3 = scanner.nextInt();

        //calculates desks for each pair of students
        double desks1 = Math.ceil((double)students1 / 2);
        double desks2 = Math.ceil((double)students2 / 2);
        double desks3 = Math.ceil((double)students3 / 2);

        //calculates and prints output
        double allDesks = desks1 + desks2 + desks3;
        System.out.println();
        System.out.println((int)allDesks);

        // closing the scanner object
        scanner.close();
    }
}