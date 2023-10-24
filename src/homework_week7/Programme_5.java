package homework_week7;

import java.util.Scanner;

public class Programme_5 {
    /**
     * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
     * salary
     * HRA = basic salary 10%
     * DA = Basic salary 8%
     * TA = Basic salary 9%
     * PF= Basic salary 20%
     * Gross salary = basic salary + HRA + TA + DA –PF
     * Print in following format
     */
    // declare object
    static int empId;
    static String empName;
    static float basicSalary, HRA, DA, TA, PF, grossSalary;


    public static void main(String[] args) {
// write input statement
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        empName = scan.next();
        System.out.println("Enter Employee ID: ");
        empId = scan.nextInt();
        System.out.println("Enter Basic Salary: ");
        basicSalary = scan.nextFloat();
        setGrossSalary();
        getOutput();
        scan.close();

    }
        // displayed output declaration
    public static void setGrossSalary() {
        HRA = (float) 10 / 100 * basicSalary;
        DA = (float) 8 / 100 * basicSalary;
        TA = (float) 9 / 100 * basicSalary;
        PF = (float) 20 / 100 * basicSalary;
        grossSalary = basicSalary + HRA + DA + TA - PF;
    }

    public static void getOutput() {
        System.out.println("|-------------------------------|");
        System.out.println("|           SALARY SLIP         |");
        System.out.println("|-------------------------------|");
        System.out.println("|Employee ID  : " + empId + "            |");
        System.out.println("|Employee Name: " + empName + "          |");
        System.out.println("|------------------------------|");
        System.out.println("|Basic Salary : " + basicSalary + "        |");
        System.out.println("|HRA 10%      : " + HRA + "         |");
        System.out.println("|DA 8%        : " + DA + "         |");
        System.out.println("|TA 9%        : " + TA + "         |");
        System.out.println("|PF-20%       : " + PF + "         |");
        System.out.println("|------------------------------|");
        System.out.println("|Gross Salary : " + grossSalary + "        |");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
    }
}
