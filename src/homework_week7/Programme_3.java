package homework_week7;

import java.util.Scanner;

public class Programme_3 {

    /**
     * Write a java program to input student Name, roll No, and three subjects Math, Science and
     * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
     * Input, Marks should between 0 to 100”) and find out total, percentage and result.
     * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
     * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
     *
     *
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Roll No: ");
        int roll_no = scanner.nextInt();

        System.out.println("Enter Maths marks: ");
        int maths = scanner.nextInt();
        System.out.println("Enter Science marks: ");
        int science = scanner.nextInt();
        System.out.println("Enter English Marks: ");
        int english = scanner.nextInt();
        scanner.close();

        if (maths < 0 || maths > 100 || science < 0 || science > 100 || english < 0 || english > 100) {
            System.out.println("Invalid input: marks must be between (0-100):");
        } else {
            int total = maths + science + english;
            double percent = (total / 300.0) * 100;

            String result = (percent >= 35) ? "Pass" : "Fail";
            String grade;
            if (percent >= 80) {
                grade = "A+";
            } else if (percent >= 60) {
                grade = "A";
            } else if (percent >= 50) {
                grade = "B";
            } else if (percent >= 35) {
                grade = "C";
            } else {
                grade = "NA";
            }

            System.out.println("|-------------------------------|");
            System.out.println("|       Mark Sheet              |");
            System.out.println("|-------------------------------|");
            System.out.println("|Name       : " + name + "               |");
            System.out.println("|Roll No.   : " + roll_no + "            |");
            System.out.println("|-------------------------------|");
            System.out.println("|Subjects   :     Marks         |");
            System.out.println("|-------------------------------|");
            System.out.println("|Math       :" + maths + "               |");
            System.out.println("|Science    :" + science + "             |");
            System.out.println("|English    :" + english + "             |");
            System.out.println("|-------------------------------|");
            System.out.println("|Total      : " + total + "              |");
            System.out.println("|-------------------------------|");
            System.out.println("|Percentage :"  + percent + "     |");
            System.out.println("|Result     :"   + result + "               |");
            System.out.println("|Grade      :"    + grade + "                 |");
            System.out.println("|--------------------------------|");
        }
    }
}

