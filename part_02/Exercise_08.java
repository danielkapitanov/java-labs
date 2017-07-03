package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 8:
 *
 *      Receive a number between 0 and 1,000,000,000 from the user.
 *      Use while loop to find the number - when the number is found
 *      exit the loop and print the number to the console.
 *
 */
public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 1 000 000 000: ");

        int i = input.nextInt();
        int count=0;
        while (count<1000000){
            if (count == i) {
                System.out.println("The number is " + count);
                break;
            } else count++;
        }

    }
}
