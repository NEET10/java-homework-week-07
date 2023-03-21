package javaprogramsweek7;

/**
 * Write a Java program to sum values of an array.
 */

public class Program7_18 {
    public static void main(String[] args) {
        int[] numbers = new int[]{13, 32, 98, 234, 768, 980};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum +numbers[i];
        System.out.println("Sum value of an array: " + sum);
    }
}






