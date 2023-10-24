package homework_week7;

import java.util.Scanner;

public class Programme_12 {
    /**
     * Write a program that tells us input value is number or an alphabet or symbol.
     */
    public static void main(String[] args) {
        Programme_12 temp = new Programme_12();
        temp.input(); //calling instance method
    }

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number, Alphabet or Character: ");
        char ch = scan.next().charAt(0);
        if (Character.isDigit(ch)) {
            System.out.println(ch + ": is number");
        } else if (Character.isAlphabetic(ch)) {
            System.out.println(ch + ": is Alphabet");
        } else
            System.out.println(ch + ": is Symbol");
        scan.close();
    }
}
