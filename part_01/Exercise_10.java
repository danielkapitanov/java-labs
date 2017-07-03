package Part_01;

/**
 * Part 1 Exercise 10:
 *
 *      If a runner runs 12 kilometers in 30 minutes and 30 seconds. What is his/her average speed
 *      in miles per hour. (Tip: 1 mile = 1.6 km)
 *
 */
public class Exercise_10 {

    public static void main(String[] strings) {

        double kilometers = 12.0;
        double miles=kilometers/1.6;
        double time = 1830.0/3600.0; //30 min and 30 sec are 1830 seconds, which when divided by 3600 shows what part of an hour that is
        double speed;

        speed=miles/time;

        System.out.println("The average speed of the runner is: "+speed+"mph");

    }

}
