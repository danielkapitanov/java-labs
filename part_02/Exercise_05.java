package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 5:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "nested-if" statement;
 *
 *
 */
public class Exercise_05 {

    public static void main(String[] args) throws java.io.IOException {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 10: ");

        int i = input.nextInt();

        if (i<10 && i>0){
            if (i<9){
                if (i<8){
                    if (i<7){
                        if (i<6){
                            if (i<5){
                                if (i<4){
                                    if (i<3){
                                        if (i<2){
                                            System.out.println("ONE");
                                        }
                                        else System.out.println("TWO");
                                    }
                                   else System.out.println("THREE");
                                }
                               else System.out.println("FOUR");
                            }
                            else System.out.println("FIVE");
                        }
                        else System.out.println("SIX");
                    }
                    else System.out.println("SEVEN");
                }
                else System.out.println("EIGHT");
            }
            else System.out.println("NINE");
        }
        else System.out.println("Integer entered is not in the range");

    }
}
