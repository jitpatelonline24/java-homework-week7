package homework_week7;

public class Programme_20 {
    /**
     * Write a Java program to test if an array contains a specific value
     */
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        System.out.println(contains(array, 14));
    }

    public static boolean contains(int[] array, int item) {
        for (int num : array) {
            if (item == num) {
                return true;}
        }
        return false;
    }
}
