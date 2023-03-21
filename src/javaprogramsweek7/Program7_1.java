package javaprogramsweek7;

import java.util.Scanner;// import java util

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Program7_1 {   //class name
    public static void main(String[] args) {    //main method
        Scanner s = new Scanner(System.in);      //Scanner declaration
        System.out.println("Enter the number");  //print statement
        int number = s.nextInt();                //input data type
        s.close();                               //closing scanner
        //ternary operator to check number
        String result = number % 2 == 0 ? "Even" : "odd";
        System.out.println(number + " is " + result);
    }
}
