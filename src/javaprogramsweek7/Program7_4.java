package javaprogramsweek7;

import java.util.Scanner;

public class Program7_4 {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            System.out.println("The parameters is not in the range(1-9999)");
            System.exit(0);
            return false;
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
            return true;
        } else {
            System.out.println(year + " is not a leap year");
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            System.out.println(month + "is invalid month, it should be between 1 to 12");
            System.exit(0);
            return -1;
        } else {
            switch (month) {
                case 1:
                    System.out.println("January month have 31 days");
                    break;
                case 2:
                    if (isLeapYear(year)) {
                        System.out.println("February month have 29 days");
                    } else {
                        System.out.println("February month have 28 days");
                    }
                        break;

                case 3:
                    System.out.println("March month have 31 days");
                    break;
                case 4:
                    System.out.println("April month have 30 days");
                    break;
                case 5:
                    System.out.println("May month have 31 days");
                    break;
                case 6:
                    System.out.println("June month have 30 days");
                    break;
                case 7:
                    System.out.println("July month have 31 days");
                    break;
                case 8:
                    System.out.println("August month have 31 days");
                    break;
                case 9:
                    System.out.println("September month have 30 days");
                    break;
                case 10:
                    System.out.println("October month have 31 days");
                    break;
                case 11:
                    System.out.println("November month have 30 days");
                    break;
                case 12:
                    System.out.println("December month have 31 days");
                    break;
            }
        }
       if (year < 1 || year > 9999) {
           System.out.println(year + "is not valid year");
          return -1;
        }
       return 1;
   }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter month no : ");
        int month = s.nextInt();
        System.out.println("Enter a year ");
        int year = s.nextInt();
        System.out.println(getDaysInMonth(month, year));
        System.out.println(isLeapYear(year));
    }
}


