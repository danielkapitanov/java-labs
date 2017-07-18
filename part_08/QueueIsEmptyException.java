package part_08;

/**
 * Created by daniel on 18.07.17.
 */
public class QueueIsEmptyException extends Exception {
    public String toString() {
        return "Queue is empty, please put something in it";
    }
}
