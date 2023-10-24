package homework_week7;

public class Programme_19 {

    /**
     * Write a Java program to calculate the average value of array elements.
     */

    public static void main(String[] args) {
        Programme_19.avg();
    }

    public static void avg() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        float average = 0;

        // average value formula
        for (int value : array) {
            sum += value;
        }

        average = sum / array.length;
        System.out.println("Average of Array Elements is " + average);
    }

}
