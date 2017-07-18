package part_08;

/**
 * Created by daniel on 18.07.17.
 */
import java.util.Scanner;

public class Stack {

    // these members are now private
    private char s[]; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    Stack( int size){
        s = new char[size]; // allocate memory for queue
        putloc = getloc = 0;

    }
    // Put a characer into the queue.

    void push(char ch) throws QueueIsFullException {
        try {
            if (putloc == s.length) {

                throw new QueueIsFullException(s.length);

            }
            getloc = putloc;
            s[putloc++] = ch;
        } catch (QueueIsFullException f){
            System.out.println(" -- Queue is full.");
        }
    }

    // Get a character from the queue.
    char pop() throws QueueIsEmptyException {
        try {
            if (putloc == 0) {
                throw new QueueIsEmptyException();
            }
        } catch (QueueIsEmptyException e){
            System.out.println(" -- Queue is empty.");
            return (char) 0;
        }

            return s[getloc--];

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the desired size of the array ");
        int size = input.nextInt();

        Stack test = new Stack(size);
    }


}

