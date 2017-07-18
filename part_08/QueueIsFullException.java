package part_08;

/**
 * Created by daniel on 18.07.17.
 */
public class QueueIsFullException extends Exception {
    int size;
    QueueIsFullException(int s){
        size=s;
    }
    public String toString() {
        return "Queue is full, maximum size is "+size;
    }
}
