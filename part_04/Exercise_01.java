package part_04;

import java.util.Scanner;

/**

 Read in 10 integers from the user. Place all 10 integers into an array in the order they were received.
 Print out the second integer received, followed by the 4th, then the 6th, then the 8th, then the 10th.
 The print out the 9th, 7th, 5th, 3rd, and 1st.

 Example input: 1,2,3,4,5,6,7,8,9,10
 Example output: 2,4,6,8,10,9,7,5,3,1

 Output can be on one line or many lines. However you like.

 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input 10 ints pls: ");
        int nums[]=new int[10];
        for (int x=0; x<nums.length;x++){
            int i=input.nextInt();
            nums[x]=i;
        }

        for (int x=1; x<nums.length;x+=2){
            System.out.println(nums[x]+" ");
        }

        for (int x=nums.length-2; x>=0;x-=2){
            System.out.println(nums[x]+" ");
        }

    }
}
