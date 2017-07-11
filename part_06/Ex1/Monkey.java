package part_06.Ex1;

/**
 * Created by daniel on 11.07.17.
 */
public class Monkey extends Mammal {
    int tailLength;
    boolean isButtRed;

    Monkey(String h, int a, int num, boolean isHerb, int tailLength, boolean isButtRed){
        super(h,a,num,isHerb);
        this.tailLength=tailLength;
        this.isButtRed=isButtRed;
    }

   void setMonkeyAge(Monkey m, int a){
        m.setAge(a);
   }
//overriding a method
    int multiplyEverything(){
        int x=super.getAge()*super.getNumOfLegs()*tailLength;
        return x;
    }

}
