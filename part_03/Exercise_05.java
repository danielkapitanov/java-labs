package part_03;


import java.util.Scanner;

/**
 *
 */
public class Exercise_05 {

    public static void main(String[] strings) {

        int x;
        Scanner input = new Scanner(System.in);
        do {

        System.out.println("Enter a number between 1 and 999,999,999: ");

        x = input.nextInt();
        } while (x<1 || x>999999999);
        if (x%4==0 && x%7==0)
            System.out.println("The number is divisible by both 4 and 7.");

        if (x%4==0 || x%7==0)
            System.out.println("The number is divisible by 4 or 7.");
        else
            System.out.println("The number is not divisible by either");

        if (x%4==0 ^ x%7==0)
            System.out.println("The number is divisible by 4 or 7 exclusively.");

        // read an integer from the user >=1 and <= 999,999,999


        // use the && operator to see if the user's number is divisible by both 4 and 7


        // use the || operator to see if the user's number is divisible by 4 or 7


        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively


        // print out the results
    }
}
