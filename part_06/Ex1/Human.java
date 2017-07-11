package part_06.Ex1;

/**
 * Created by daniel on 11.07.17.
 */
public class Human extends Sup {
    private String eyecolor;
    private double netWorth;

    Human(String hair, int age, String eye, double net){
        super(hair, age);

        eyecolor=eye;
        netWorth=net;

    }

    public double getNetWorth() {
        return netWorth;
    }
}
