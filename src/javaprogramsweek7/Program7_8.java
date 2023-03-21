package javaprogramsweek7;
import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

public class Program7_8 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any alphabet from \"A\" to \"F\"");
        String city = s.next();
        s.close();

        if (city.equals("A")){
            System.out.println("City is Amreli");
        } else if (city.equals("B")) {
            System.out.println("City is Bhopal");
        } else if (city.equals("C")) {
            System.out.println("City is Calcutta");
        } else if (city.equals("D")){
            System.out.println("City is Daman");
        } else if (city.equals("E")) {
            System.out.println("City is Eder");
        } else if (city.equals("F")) {
            System.out.println("City is Faridabad");
        } else {
            System.out.println("Invalid input");
        }
    }


    }
