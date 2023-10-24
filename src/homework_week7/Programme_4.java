package homework_week7;

import java.util.Scanner;

public class Programme_4 {

    /**
     * Number of Days In Month
     * Write a method isLeapYear with a parameter of type int named year.
     * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
     * If the parameter is not in that range return false.
     * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
     * otherwise return false.
     * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400
     */

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (!(!(year % 400 == 0) && !((year % 4 == 0) && (year % 100 != 0)))) {
                System.out.println(year + " : Leap year ");
                return true;
            } else {
                System.out.println(year + ": not leap year");
                return false;
            }
        }
        System.out.println("Invalid input year: "+ year +" Enter a year between 1 to 9999");
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        System.out.println("Month number: " + month);
        boolean leapyear = isLeapYear(year);
        if (month >= 1 && month <= 12 && year >= 1 && year <= 9999) {
            if (leapyear) {
                return switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12 -> 31;
                    case 2 -> 29;
                    case 4, 6, 9, 11 -> 30;
                    default -> 1;
                };
            } else {
                return switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12 -> 31;
                    case 2 -> 28;
                    case 4, 6, 9, 11 -> 30;
                    default -> 1;
                };
            }
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = scanner.nextInt();
        System.out.println("Enter a month: ");
        int month = scanner.nextInt();
        int days = getDaysInMonth(month, year);
        System.out.println("number of days in a month " + month + " : " + days+ " Days ");
        scanner.close();
    }

}
