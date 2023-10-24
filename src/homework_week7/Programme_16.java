package homework_week7;

import java.util.Scanner;

public class Programme_16 {
    /** Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
    * “ZERO”
    */
    public static void main(String[] args) {
        Programme_16 obj = new Programme_16();
        obj.check();
    }
    public void check(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = scan.nextInt();
        scan.close();

        //calculations
        if(num>0){
            System.out.println(num+ " is positive number");
        }else if(num<0){
            System.out.println(num+ " is Negative number");
        }else {
            System.out.println(num+ " is Zero");
        }
    }
}
