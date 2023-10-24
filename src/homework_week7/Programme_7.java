package homework_week7;

import java.util.Scanner;

public class Programme_7 {
    /**
     * Write a java program input sales id, seller's name, sales amount, and salary basic and
     * then fined this sales
     * Commission
     * Sales amount >= 50,000 35%
     * Sales amount >= 30,000 20%
     * >= 20,000 10%
     * >= 10,000 5%
     * < 10,000 2%
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Sales ID: ");
        int salesID = scan.nextInt();
        System.out.println("Enter Sellers Name:");
        String sellerName = scan.next();
        System.out.println("Enter Sales Amount: ");
        float salesAmount = scan.nextFloat();
        System.out.println("Enter Basic Salary: ");
        float bs = scan.nextFloat();
        float com = comCal(salesAmount);
        System.out.println("Commission: " + com);
        scan.close();
    }

    public static float comCal(float saleAmount) {
        float com = 0;
        if (saleAmount >= 50_000) {
            com = ((float) 35 / 100) * saleAmount;
        } else if (saleAmount >= 30_000 && saleAmount <= 49_999) {
            com = ((float) 20 / 100) * saleAmount;
        } else if (saleAmount >= 20_000 && saleAmount <= 29_999) {
            com = ((float) 10 / 100) * saleAmount;
        } else if (saleAmount >= 10_000 && saleAmount <= 19_999) {
            com = ((float) 5 / 100) * saleAmount;
        } else if (saleAmount >= 0 && saleAmount <= 9_999){
            com = ((float) 2 / 100) * saleAmount;
        }else
        System.out.println("No Commission: ");

        return com;
    }

}
