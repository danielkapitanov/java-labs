package part_05;

/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01. Within method_01 you ust manipulate several private instance variables within
 * Class_02. Then, from within method_01, pass the instance of Class_02 to a new method, method_02. Within method_02
 * modify the instance variables of Class_02 once again. Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 *
 */

class First {
    public static void main(String[] args) {
        SecondClass example = new SecondClass(); // creating instance
        System.out.println("In the beginning x, w and q are: " + example.getX() + ", " + example.getW() + ", " + example.getQ());

        method_01(example);



    }

       static void method_01(SecondClass ref){
           System.out.println("method1");
            ref.setX(33);
            ref.setW(44);
            ref.setQ(55);
            System.out.println("After method_01 x, w and q are: " + ref.getX() + ", " + ref.getW() + ", " + ref.getQ());
            method_02(ref);
            System.out.println("After method_02 x, w and q are: " + ref.getX() + ", " + ref.getW() + ", " + ref.getQ());

    }


    static void method_02(SecondClass ref){
        System.out.println("Method2");
           ref.setX(88);
           ref.setW(33);
           ref.setQ(123);
    }
}

class SecondClass {

    private int x=10;
    private int w=11;
    private int q=12;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

}