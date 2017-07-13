package part_07;

/**
 * Create the following:

 1) Write one super class with at least 3 private instance variables and at least 3 public methods
 2) Write three subclasses (with at least 3 methods each that not getters and setters) that extend the super
 class. Make sure each subclass can manipulate the private variables in the super class. One subclass should
 extend another subclass which extends the super class. Each subclass should only have variables and methods
 that apply to that subclass, ie Animal -> Mammal -> Whale.
 3) Make use of the keyword "super" in at least two constructors.
 4) Write an interface with at least 3 methods. Have the superclass implement this interface.
 */
public class World {
    private long population;
    private int area;
    private double amtWater;

    public World(long population, int area, double amtWater) {
        this.population = population;
        this.area = area;
        this.amtWater = amtWater;
    }

    public double populationDensity(double population,int area){
        return population/area;
    }

    public double waterArea(int area, double water){
        return area*water;
    }


    public double getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}

class Continent extends World {
    private int numOfCountries;

    public Continent(long population, int area, double amtWater, int numOfCountries) {
        super(population, area, amtWater);
        this.numOfCountries = numOfCountries;
    }

    double averageCountrySize(Continent c){
        return c.getArea()/numOfCountries;

    }

    double averageCountryPopulation(Continent c){
        return c.getPopulation()/numOfCountries;
    }
}

class Country extends Continent {
    private int numOfCities;
    private double PGR;

    public Country(long population, int area, double amtWater, int numOfCities, double PGR) {
        super(population, area, amtWater, 1);
        this.numOfCities = numOfCities;
        this.PGR = PGR;
    }

    double popGrowth(Country c, int years){
        return c.PGR*c.getPopulation()*years;
    }

    double avgPopPerCity(Country c){
        return c.getPopulation()/numOfCities;
    }


}

class Ocean extends World {
    int waterVolume;

    public Ocean(int area, int waterVolume) {
        super(0, area, 100);
        this.waterVolume = waterVolume;
    }

    double averageDepth(Ocean o){
        return waterVolume/o.getArea();
    }


}

class Main {
    public static void main(String[] args) {
        World Earth = new World(7517832107L, 510_100_000, 71);
        Continent Africa = new Continent(1247036941, 29661703, 5, 54);
        Continent Europe = new Continent(739218464, 22121228, 6.1,50);
        Country Bulgaria = new Country(7101999,111191,7,113,-0.71);
        Country USA = new Country (350132553,9833520, 10, 900,1.4);




    }
}