package homework_week7;

import java.util.Scanner;

public class Programme_1 {

    /**
     * Write a java program that tells us that Input number is odd or even?
     * HINT: use ternary operator (? :)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //Scanner Declaration for reading input from Console
        System.out.println("Please Enter the Number: ");
        int num = scanner.nextInt();
        isOddOrEvenNum(num);
        scanner.close();  //Scanner closing statement
    }

    // Declaration for number is Odd or Even
    public static void isOddOrEvenNum(int num) {
        String oddOrEven = (num % 2 == 0) ? "Even" : "Odd"; //Ternary Operator used in statement
        System.out.println("The " + num + " is " + oddOrEven + " number");
    }

}
