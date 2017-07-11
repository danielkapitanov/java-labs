package part_04;

import java.util.Scanner;

/**

 Here's an easy one for you.

 Create and populate an array with a length no less than 5. Use the enhanced for
 loop to iterate through the array and print out each value.

 */

public class Exercise_05 {
    public static void main(String[] args) {
        int nums[]=new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 ints pls: ");
        for (int i=0;i<10;i++){
            int x=input.nextInt();
            nums[i]=x;
        }
        System.out.println("Printing array: ");
        int x=0;

        for (int i:nums){

            System.out.println(nums[x]);
            x++;
        }

    }
}