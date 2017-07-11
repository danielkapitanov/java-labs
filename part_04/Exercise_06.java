package part_04;

/**

 Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 it cannot be retrieved again) of integers 0 through 100. Then print out every other
 value in the queue.

 expected output: 0,2,4,6,8.....100

 */

class Queue {
    // these members are now private
    private int q[]; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    Queue(int size) {
        q = new int[size]; // allocate memory for queue
        putloc = getloc = 0;
    }

    // Put a characer into the queue.
    void put(int x) {
        if(putloc==q.length) {
            System.out.println(" -- Queue is full.");
            return;
        }

        q[putloc++] = x;
    }

    // Get a character from the queue.
    int get() {
        if(getloc == putloc) {
            System.out.println(" -- Queue is empty.");
            return (int) 0;
        }

        return q[getloc++];
    }
}

class Exercise_06 {
    public static void main(String[] args) {
        Queue Q = new Queue(101);
        for (int i=0;i<=100;i++){
            Q.put(i);
        }

        for (int i=0;i<=100;i++){
            int x=Q.get();
            if (x%2==0){
                System.out.println(x);
            }
        }


    }
}