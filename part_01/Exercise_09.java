package Part_01;

/**
 * Part 1 Exercise 9:
 *
 *      Write the necessary code to display the area of a rectangle, as well as the perimeter of
 *      a rectangle that has a width of 2.4 and a height of 6.4
 *
 */
public class Exercise_09 {

    public static void main(String[] strings) {
        double side1=2.4;
        double side2=6.4;
        double perimeter, area;

        perimeter=2*side1 + 2*side2;
        area=side1*side2;

        System.out.println("The perimeter is: "+perimeter);
        System.out.println("The area is: "+area);
    }
}
