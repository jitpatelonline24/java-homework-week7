package homework_week7;

import java.util.Scanner;

public class Programme_8 {
    /**
     * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
     * any other alphabet should be invalid entry
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First letter of City: ");
        char firstLetter = scan.next().charAt(0);
        ifStatement(firstLetter);
        scan.close();
    }

    public static void ifStatement(char letter) {
        if (letter == 'A') {
            System.out.println("Aberdeen");
        } else if (letter == 'B') {
            System.out.println("Bristol");
        } else if (letter == 'C') {
            System.out.println("Chelsea");
        } else if (letter == 'D') {
            System.out.println("Delta");
        } else if (letter == 'E') {
            System.out.println("Elenor");
        } else if (letter == 'F') {
            System.out.println("Falkland");
        } else {
            System.out.println("Invalid Entry");

        }
    }
}
