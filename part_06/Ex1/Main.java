package part_06.Ex1;

/**
 * Created by daniel on 11.07.17.
 */
public class Main {
    public static void main(String[] args) {
        Human Tanerd = new Human("ugly",22, "shit-colored", -18000);
        Human Dani = new Human("dark", 22, "green", -27000);
        Mammal Sivcho = new Mammal("grey", 1, 4, false);
        Monkey Buttwipe = new Monkey ("brown",12,2,false,2,true);

        System.out.println("Sivcho's age is: "+Sivcho.getAge());
        System.out.println("Tanerd's net worth is "+Tanerd.getNetWorth());
        Dani.setHaircolor("dark brown");
        System.out.println("Dani's hair color is "+Dani.getHaircolor());
        Buttwipe.setMonkeyAge(Buttwipe,4);
        System.out.println("Buttwipe's age is now "+Buttwipe.getAge());
        System.out.println("Multiplying Dani and Buttwipe's age: "+Sup.multiplyAge(Dani,Buttwipe));

        //Dynamic dispatch:
        Mammal Macey = new Mammal("brown", 2, 4, false);
        Monkey Gorilla = new Monkey ("black",6,2,false,1,true);

        Mammal empty = new Mammal();
        empty=Macey;
        System.out.println("Multiply everything 1: "+empty.multiplyEverything());
        empty=Gorilla;
        System.out.println("Multiply everything 2: "+empty.multiplyEverything());



    }
}
