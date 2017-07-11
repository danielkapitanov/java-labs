package part_06.Ex1;

/**
 * Created by daniel on 11.07.17.
 */
public class Sup {

    private String haircolor;
    private int age;

    Sup(String h, int a){
        haircolor=h;
        age=a;
    }

    Sup(){
    }

    Sup(String haircolor){
        this.haircolor=haircolor;
        age=0;
    }

    Sup(int age){
        this.age=age;
        haircolor="";
    }


    public int getAge() {

        return age;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static int multiplyAge (Sup a, Sup b){
        int x=a.age*b.age;
        return x;
    }

}
