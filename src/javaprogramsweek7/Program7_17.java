package javaprogramsweek7;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */

public class Program7_17 {
    public static void main(String[] args) {
        int n [] ={1947, 1942,1100, 550,777,420,36,9,11};
        String name []= {"Silver", "Sugar","Sweet", "Sour", "Sip", "Strong"};
        System.out.println("Original numeric array : "+Arrays.toString(n));
        Arrays.sort(n);                                                            // sort method
        System.out.println("Sorted numeric array : "+Arrays.toString(n));
        System.out.println("Original string array : "+Arrays.toString(name));
        Arrays.sort(name);
        System.out.println("Sorted string array : "+ Arrays.toString(name));
    }
}



