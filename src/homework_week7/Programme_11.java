package homework_week7;

public class Programme_11 {
    /**
     * Write a java program to print the numbers between 1 to 100 which can be divided by 3
     * and 5 separately.
     */
    public static void main(String[] args) {
        divideBy3();
        divideBy5();
    }
    public static void divideBy3() {
        // calculations
        System.out.println("Divide by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.println(i + " , ");
        }
        System.out.println();
    }

    public static void divideBy5() {
        System.out.println("Divide by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.println(i + " , ");
        }
        System.out.println();
    }
}
