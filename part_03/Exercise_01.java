package part_03;

import java.util.Scanner;

/**
  Write 3 classes. These classes can reside in the same file for ease and clarity.
  The first class (the controller) should have at least two methods, one of which being a main method.
  The main method needs to utilize constructors to create at least two separate objects. Each class must
  have at least 3 variables all 3 variables in each class must be used and set. Think about the Vehicle
  objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
  Vehicle object in this exercise :)

  Be creative. Have some fun. Using Java objects you can model just about anything you want. Cars, animals, poker games,
  sports teams, trees, beers, people and so on.

 **/

class Concerts {

    public static void main (String[] args) {
        Band band1 = new Band("Band1", 4, "heavy metal");
        Band band2 = new Band("Band2", 3, "pop");
        Band band3 = new Band("Band3", 1, "rap");
        Band band4 = new Band("Band4", 4, "rock");

        Venue arena1 = new Venue("Arena1",60000, true);
        Venue arena2 = new Venue("Arena2",30000, true);
        Venue arena3 = new Venue("Arena3",50000, false);
        Venue arena4 = new Venue("Arena4",10000, true);

        Scanner input = new Scanner(System.in);
        int b,c,f;
        System.out.println("Enter which band you want to make a concert for (1 to 4): ");

        b = input.nextInt();

        System.out.println("Enter which venue you want the concert to be (1 to 4): ");

        c = input.nextInt();

        System.out.println("Enter the amount of fans that would come: ");

        f = input.nextInt();

        String band="";
        boolean isOK=false;



        switch (b) {
            case 1:
                band = band1.name;
            break;
            case 2:
                band = band2.name;
                break;
            case 3:
                band = band3.name;
                break;
            case 4:
                band = band4.name;
                break;

        }

        switch (c){
            case 1:
                isOK = Venue.venueOK(f, arena1);
                break;
            case 2:
                isOK = Venue.venueOK(f, arena2);
                break;
            case 3:
                isOK = Venue.venueOK(f, arena3);
                break;
            case 4:
                isOK = Venue.venueOK(f, arena4);
                break;
        }

        concertCheck(band, isOK, f);

    }


    static void concertCheck(String bandname, boolean isOK, int cap){
        if (isOK)
            System.out.println(bandname+" can have a concert at the selected venue with "+cap+" fans.");
        else
            System.out.println(bandname+" can not have a concert at the selected venue because " +
                    "it can not hold "+cap+" fans, or the venue is unavailable at the moment");

    }





}

class Band {
    String name;
    int members;
    String genre;

    Band (String name, int members, String genre){
        this.name=name;
        this.members=members;
        this.genre=genre;
    }

}

class Venue {
    String name;
    int capacity;
    boolean isAvailable;

    Venue (String name, int capacity, boolean isAvailable){
        this.name=name;
        this.capacity=capacity;
        this.isAvailable=isAvailable;
    }

    static boolean venueOK(int cap, Venue venue){
        if (cap<venue.capacity && venue.isAvailable)
            return true;
        else
            return false;
    }

}