package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 4:
 *
 *      Pounds to kilos
 *
 *      One pound is 0.454 kilograms.
 *
 *
 */
public class Exercise_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilos;

        System.out.print("Enter pounds: ");
        double pounds = input.nextDouble();

        kilos=pounds*0.454;

        System.out.println(pounds+" pounds are "+kilos+" kilos.");
    }
}
