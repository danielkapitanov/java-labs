package part_06.Ex1;

/**
 * Created by daniel on 11.07.17.
 */
public class Mammal extends Sup {
    private int numOfLegs;
    private boolean isHerbivore;

    public Mammal(String h, int a, int numOfLegs, boolean isHerbivore) {
        super(h,a);
        this.numOfLegs = numOfLegs;
        this.isHerbivore = isHerbivore;
    }
    Mammal(){}

    int multiplyEverything(){
        int x=super.getAge()*numOfLegs;
        return x;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }
}
