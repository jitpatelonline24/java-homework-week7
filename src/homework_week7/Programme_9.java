package homework_week7;

import java.util.Scanner;

public class Programme_9 {
    /**
     *  Same as above program-8 using switch statement.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Letter of City: ");
        char firstLetter = scan.next().charAt(0);
        switch1(firstLetter);
        scan.close();
    }
    public static void switch1(char letter){
        switch (letter){
            case 'A':
                System.out.println("Aberdeen");
                break;
            case 'B':
                System.out.println("Bristol");
                break;
            case 'C':
                System.out.println("Chelsea");
                break;
            case 'D':
                System.out.println("Delta");
                break;
            case 'E':
                System.out.println("Elenor");
                break;
            case 'F':
                System.out.println("Falkland");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
