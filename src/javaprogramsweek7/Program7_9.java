package javaprogramsweek7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use switch statement) if
 * any other alphabet should be invalid entry
 */

public class Program7_9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);                //Scanner ddeclaration
        System.out.println("Enter any alphabet from A to F");//For user to read
        String letter = s.next();                          //User input data type
   /*
   letter.toUpperCase(Locale.forLanguageTag(letter));
   System.out.println(letter);
   */
        s.close();                            //Scanner closing
        switch (letter.toUpperCase()) {         //Switch statement converting in upper if input in lowercase
            case "A":
                System.out.println("Your city name is Ahmedabad");
                break;
            case "B":
                System.out.println("Your city name is Baroda");
                break;
            case "C":
                System.out.println("Your city name is Colcatta");
                break;
            case "D":
                System.out.println("Your city name is Daman");
                break;
            case "E":
                System.out.println("Your city is Edar");
                break;
            case "F":
                System.out.println("Your city is Faridabad");
                break;
            default:             //For all other inputs
                System.out.println("Invalid input");
        }
    }
}