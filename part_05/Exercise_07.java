package part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 should have various instance variables. At least one of
 * must be static. Within class_01 create at least 3 instances of class_02. Set the instance variables of class_02. Then,
 * just once, in one place, set the static instance variable in class_02. Afterwards, print out the value of each instance
 * variable and the static variable for each class.
 */

class Ex1 {
    public static void main(String[] args) {
       Ex2 test1=new Ex2();
       test1.x=17;

       test1.z=13;

        Ex2 test2=new Ex2();
        test2.x=11;

        test2.z=20;

        Ex2 test3=new Ex2();
        test3.x=110;
        test3.y=7;
        test3.z=14;

        System.out.println("test1's y "+test1.y);
        System.out.println("test2's y "+test2.y);
        System.out.println("test3's y "+test3.y);
    }
}

class Ex2 {
    int x;
    static int y;
    int z;
}

