package part_05;

/**
 * Write two classes. In Class_01 have a main method that creates on instance of Class_02. In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times. Each method should have a return type that is not
 * void. Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */

class Bam {
    public static void main(String[] args) {
        Bash test = new Bash();

        int one= test.meth(10,20,30);
        System.out.println("method1: "+one);
        int two=test.meth(40,60);
        System.out.println("meth2: "+two);
        String three=test.meth(18);
        System.out.println("meth3: "+three);

    }
}

class Bash {


    int meth (int x, int y, int z){
        int sum;
        sum=x+y+z;
        return sum;
    }

    int meth(int x, int y){
        int multiply;
        multiply=x*y;
        return multiply;
    }

    String meth(int x){
        return "Please enter 2 or more integers";
    }
}