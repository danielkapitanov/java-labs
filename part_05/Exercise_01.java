package part_05;

/**
 * Write three classes. The Class_01 should contain the main method. The main method should create an instance
 * of Class_02. Class_02 must have several private instance variables. Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables. Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */


class Class_01 {
    public static void main(String[] args) {

        Class_02 example = new Class_02();

        example.setHp(230);
        example.setMake("Skoda");

        System.out.println("HP is :"+example.getHp()+" and make is: "+example.getMake());

        example.createObj(30.0,11);

        example.printValues();

    }
}


class Class_02 {

    private int hp;
    private String make;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
    Class_03 test= new Class_03();

    void createObj(double smth, int x){

        test.setSmth(smth);
        test.setX(x);
        System.out.println("Object for Class 3 created.");
    }

    void printValues(){
        System.out.println("Values of Obj 3 are: "+test.getSmth()+" and "+test.getX());
    }


}

class Class_03 {

    private double smth;
    private int x;

    public double getSmth() {
        return smth;
    }

    public void setSmth(double smth) {
        this.smth = smth;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }





}