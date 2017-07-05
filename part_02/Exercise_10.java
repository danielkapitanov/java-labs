package Part_02;


/**
 * Part 2 Exercise 10:
 *
 *      Write a program that prints out every prime number between 1 and 100
 *
 */
public class Exercise_10 {



public static void main(String[] args) {
    System.out.println("1");
    System.out.println("2");
    for (int i = 3; i <= 1000; i++) {
        boolean prime = true;
        for (int count = 2; count < i; count++) {
            if (i % count == 0) {
                prime = false;
            }
        }
        if (prime) {
            System.out.println(i);
        }

    }
}
}
