package homework_week7;

import java.util.Arrays;

public class Programme_17 {

    /**
     * Write a Java program to sort a numeric array and a string array
     */
    public static void main(String[] args) {
        Programme_17.array();
    }
    public static void array(){
        int[] array1 = {100, 300 , 200, 500, 400, 700, 600};
        System.out.println("Original Numeric Array : "+ Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted Numeric Array : " +Arrays.toString(array1));

        String[] array2 = {"ab", "ef", "cd", "gh","kl","ij", "mn"};
        System.out.println("Original Numeric Array : "+ Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted Numeric Array : "+Arrays.toString(array2));
    }
}
