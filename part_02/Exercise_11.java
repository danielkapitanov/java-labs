package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 *
 *      Calculate investment value
 *
 *      Recieved the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 *
 */

public class Exercise_11 {
    public static void main(String[] args) {
        int i=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        int inv = input.nextInt();

        System.out.print("Enter annual interest rate in percentage: ");
        double rate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double value=(double) inv;

        do {
            value = value + value * rate / 100;
            i++;
        } while (i<=years);

        System.out.println("The future value will be: "+value);
    }
}

