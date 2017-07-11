package part_05;



/**
 * Write two classes. Class_01 should have the main(). Class_02 must have 3 or more private variables. Class_02 must
 * also have at least 3 overloaded constructors. In Class_01.main() create several instances of Class_02 using each
 * overloaded constructor. Each constructor should do something slightly differently. Class_02 must have at least
 * two private instance variables. Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 *
 */

class Class1 {
    public static void main(String[] args) {

        Class2 obj1 = new Class2(11, 5, 14);
        Class2 obj2 = new Class2(14, 13);
        Class2 obj3 = new Class2(110.0);

        Class2.doubleValues(obj1);
        Class2.doubleValues(obj2);
        Class2.doubleValues(obj3);

        System.out.println("Values of obj 1 are: "+obj1.getX()+" "+obj1.getY()+" "+obj1.getZ());
        System.out.println("Values of obj 2 are: "+obj2.getX()+" "+obj2.getY()+" "+obj2.getZ());
        System.out.println("Values of obj 3 are: "+obj3.getX()+" "+obj3.getY()+" "+obj3.getZ());

    }

}

class Class2 {

    private int x;
    private double y;
    private int z;

    Class2(int x, double y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    Class2(int x, int z){
        this.x=x;
        this.z=z;
        y=x*z;
    }

    Class2 (double y){
        x=0;
        this.y=y;
        z=(int)y;
    }

    static void doubleValues(Class2 class2){
        class2.x*=2;
        class2.y*=2;
        class2.z*=2;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}