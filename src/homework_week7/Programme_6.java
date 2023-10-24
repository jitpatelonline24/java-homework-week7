package homework_week7;

import java.util.Scanner;

public class Programme_6 {
    /**
     * Write a java program to input any number and find out if it’s odd or even
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        isEvenOrOdd(num);
        scanner.close();
    }

    public static void isEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("number is Even: " + num);
        } else {
            System.out.println("number is Odd: " + num);
        }
    }

}
