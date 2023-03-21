package javaprogramsweek7;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

public class Program7_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter sales id : ");
        int id = s.nextInt();
        System.out.println("Enter seller's name : ");
        String name = s.next();
        System.out.println("Enter sales_amount : ");
        double sales_amount = s.nextDouble();
        System.out.println("Enter the basic_salary : ");
        double basic_salary = s.nextDouble();

        if (sales_amount >= 50000) {
            double ans = ((35 / 100.0 * sales_amount)+ basic_salary);
            System.out.println("Sales Commission :  " + (35 / 100.0 * sales_amount));
            System.out.println("Total Salary :" +ans);
        } else if (sales_amount >= 30000) {
            double ans = ((20 / 100.0 * sales_amount)+ basic_salary);
            System.out.println("Sales Commission :  " + (20 / 100.0 * sales_amount));
            System.out.println("Total Salary :" +ans);
        } else if (sales_amount >= 20000) {
            double ans = ((10 / 100.0 * sales_amount)+ basic_salary);
            System.out.println("Sales Commission :  " + (10 / 100.0 * sales_amount));
            System.out.println("Total Salary :" +ans);
        } else if (sales_amount >= 10000) {
            double ans = ((5 / 100.0 * sales_amount)+ basic_salary);
            System.out.println("Sales Commission :  " + (5 / 100.0 * sales_amount));
            System.out.println("Total Salary :" +ans);
        } else if (sales_amount < 10000) {
            double ans = ((2 / 100.0 * sales_amount)+ basic_salary);
            System.out.println("Sales Commission :  " + (2 / 100.0 * sales_amount));
            System.out.println("Total Salary :" +ans);
        }
        s.close();

    }
}

