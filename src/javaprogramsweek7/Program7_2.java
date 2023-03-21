package javaprogramsweek7;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */

public class Program7_2 {
    public static void main(String[] args) {      //main method
        Scanner s = new Scanner(System.in);       //declaring scanner
        System.out.println("Input the year");     //print statement
        int year = s.nextInt();                   // input data type
        s.close();                                //closing scanner

        if (year % 4 == 0) {                            //if syntax with a logic
            System.out.println(year +"It is a Leap year"); //print statement in 'if body'

        } else {                                                //else statement
            System.out.println(year + "It is not a leap year"); // print statement in else body

        }

    }

}
