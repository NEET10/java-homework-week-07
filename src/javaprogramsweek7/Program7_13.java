package javaprogramsweek7;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

public class Program7_13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int day = s.nextInt();
        System.out.println(getDayName(day));
        s.close();
    }
    public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Week contains 1 to 7 days";
        }
        return dayName;

    }
}


