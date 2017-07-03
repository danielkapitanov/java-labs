package Part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */
public class Exercise_11 {

    public static void main(String[] strings) {

        int year = 31556926; //one year has 31 556 926 seconds.
        int population = 380123456;

        for (int b=0;b<=year*3;b+=6){
            population++;
        }

        for (int d=0;d<=year*3;d+=12){
            population--;
        }

        for (int i=0;i<=year*3;i+=40){
            population++;
        }

        System.out.println("In 3 years the US population will be: "+population+" people");


    }
}
