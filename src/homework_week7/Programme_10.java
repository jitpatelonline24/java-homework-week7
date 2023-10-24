package homework_week7;

import java.util.Scanner;

public class Programme_10 {
    /**
     * Write a java program to input any two number and ask user to enter their symbol (+, -,
     * /, *) find addition, Subtraction, multiplication and division according to their symbol
     * (using if else)
     */
    public static void main(String[] args) {
        cal();
    }
    public static void cal(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = scan.nextInt();
        System.out.println("Enter math Calculation Symbol [+, -,* /] ");
        char ch =scan.next().charAt(0);
        scan.close();

        if (ch =='+'){
            System.out.println(num1+ " + "+ num2+ " = "+(num1+num2));
        }else if(ch =='-'){
            System.out.println(num1+ " - "+num2+ " = "+(num1-num2));
        }else if (ch =='*'){
            System.out.println(num1+ " * "+num2+ " = "+(num1 * num2));
        }else if (ch =='/'){
            System.out.println(num1+ " / "+num2+ " = "+(num1/num2));
        }
        System.out.println("only calculation accepted with (+,-,*,/):");
    }
}
