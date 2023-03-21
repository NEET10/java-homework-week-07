package javaprogramsweek7;

/**
 * Write a Java program to test if an array contains a specific value.
 */

public class Program7_20 {
    public static void main(String[] args) {                        // main method
        int[] array = {1010, 1100, 0111, 1000, 1011, 0101, 0001};
        System.out.println(contains(array,1010));
        System.out.println(contains(array,0010));
    }
    public static boolean contains(int[] arr, int item) {       //with returns with parameters
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
}


