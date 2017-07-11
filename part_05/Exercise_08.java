package part_05;

/**
 * Write one class. This class must make use of an inner/nested class. Within the nested class, set the instance variables
 * of the outer class. Also, within the inner class, call at least two methods that have a return type of int. Add these
 * two ints together and set a final instance variable in the outer with this value.
 */

class Lmao {
   static int x;
   static int y;
   static int z;
    public static void main(String[] args) {

        x=y=z=1;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println("-----");

        Rofl test = new Rofl();
        boolean response=test.modifyVars();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println("-----");

    }

    public static void outSideMeth(){
        System.out.println("in outside method");
    }

    static class Rofl {
        boolean modifyVars(){
            x=y=z=2;
            outSideMeth();
            return true;
        }


    }

}