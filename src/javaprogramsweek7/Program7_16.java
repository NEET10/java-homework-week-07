package javaprogramsweek7;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

public class Program7_16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = s.nextInt();
        if (num > 0) {                                              //nested if else syntax
            System.out.println(num + " is POSITIVE NUMBER. ");
        } else if (num < 0) {
            System.out.println(num + " is NEGATIVE NUMBER. ");
        } else {
            System.out.println(num + " is a ZERO. ");
        }
        s.close();
    }
}
