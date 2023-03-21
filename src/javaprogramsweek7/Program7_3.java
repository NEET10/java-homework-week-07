package javaprogramsweek7;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * |                               |
 * | Mark Sheet                    |
 * |_______________________________|
 * | Name : Jay                    |
 * | Roll No: 08                   |
 * |_______________________________|
 * | Subjects : Marks              |
 * |_______________________________|
 * | Math : 98                     |
 * | Science : 90                  |
 * | English : 85                  |
 * |_______________________________|
 * | Total : 273                   |
 * |_______________________________|
 * | Percentage : 91.0             |
 * | Result : Pass                 |
 * | Grade : A+                    |
 * |_______________________________|
 */

public class Program7_3 {
    public static void main(String[] args) {                    //main method
        Scanner s = new Scanner(System.in);                     //scanner declaration
        System.out.println("Enter student name :");             //print statement
        String name = s.next();
        System.out.println("Enter roll No :");
        int rollNo = s.nextInt();                               //input data type
        System.out.println("Enter Maths Marks : ");
        int marks1 = s.nextInt();
        if (marks1 < 0 || marks1 > 100) {                       //if syntax with a logic
            System.out.println(marks1 + " Invalid Input, Marks should between 0 to 100");
        }
        System.out.println("Enter Science Marks : ");
        int marks2 = s.nextInt();
        if (marks2 < 0 || marks2 > 100) {
            System.out.println(marks2 + " Invalid Input, Marks should between 0 to 100");
        }
        System.out.println("Enter English Marks : ");
        int marks3 = s.nextInt();
        if (marks3 < 0 || marks3 > 100) {
            System.out.println(marks3 + " Invalid Input, Marks should between 0 to 100");
        }
            System.out.println("_____________________________");
            System.out.println("|                           |");
            System.out.println("|        Mark Sheet         |");
            System.out.println("|___________________________|");
            System.out.println("|  Name :   "+   name +"    |");
            System.out.println("|  Roll No : " + rollNo +"  |");
            System.out.println("|___________________________|");
            System.out.println("|    Subjects : Marks       |");
            System.out.println("|___________________________|");
            System.out.println("|  Maths : " + marks1 +"    |");
            System.out.println("|  Science : " + marks2 +"  |");
            System.out.println("|  English : " + marks3 +"  |");
            System.out.println("|___________________________|");

        int totalmarks = marks1+marks2+marks3;
        System.out.println("|  Total : "+ totalmarks + "      |");
        double percentage = (totalmarks/3);                         // use of primitive numeric floating data type
        System.out.println("|Percentage : "+ percentage +"    |");
        if (percentage<35 || marks1<35 || marks2<35 || marks3<35){  // if else syntax with a logic
            System.out.println("|  Result : Fail    |");
        }else{
            System.out.println("|  Result : Pass    |");
        }
        if (percentage>=80){                                        //nested if else syntax with logic
            System.out.println("| Grade : A+         |");
        } else if (percentage<80 && percentage>=60) {
            System.out.println("| Grade : A         |");

        } else if (percentage<60 && percentage>=50){
            System.out.println("| Grade : B         |");
        } else if (percentage<50 && percentage>=35) {
            System.out.println("| Grade : C         |");
        }else{
            System.out.println("| Grade : D         |");
        }
        s.close();                                                  //closing scanner

    }



    }



