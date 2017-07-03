package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 1 000 000 000: ");

        int i = input.nextInt();

        int years;
        double days;



        years=i/(365*24*60); //get the number of years
        days=(double)i%years;

        System.out.println(years+" years and "+days+" days");
    }

}
