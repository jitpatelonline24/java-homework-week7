package homework_week7;

public class Programme_18 {
    /**
     * Write a Java program to sort a numeric array and a string array
     */
    public static void main(String[] args) {
        sum();
    }

    public static void sum() {
        int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        int sum = 0;
        for (int s : array)
            sum += s;
        System.out.println("The sum of Array is " + sum);
    }
}
