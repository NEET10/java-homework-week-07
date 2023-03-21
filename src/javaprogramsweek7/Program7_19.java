package javaprogramsweek7;

/**
 * Write a Java program to calculate the average value of array elements.
 */

public class Program7_19 {

        public static void main(String[] args) {
            int[] numbers = new int[]{22,-89, 234, -587,7968};//calculate sum of all array elements
            int sum = 0;
            for (int i = 0; i < numbers.length; i++)
                sum = sum + numbers[i];
            int average = sum / numbers.length;
            System.out.println("Average value of the array element is : " + average);
        }
    }





