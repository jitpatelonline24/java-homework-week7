package homework_week7;

import java.util.Scanner;

public class Programme_2 {
    /**
     * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
     */
    public static void main(String[] args) {
        // if year is leap year or not via input year on console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter any year you like: ");
        int year = scan.nextInt();
        isLeapYearOrNot(year); //calling methods directly via static
        scan.close();
    }

    // method to find that year is leap year or not
    public static void isLeapYearOrNot(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + ": This is Leap Year");
        } else if (year % 400 == 0) {
            System.out.println(year + ": This is Leap Year");
        } else {
            System.out.println(year + ": This is not leap year");
        }
    }
}