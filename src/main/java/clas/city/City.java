package clas.city;

import java.util.concurrent.Callable;

public class City {

    String name;
    int population;
    public City(String name, int population) {
        this.name = name;
        this.population = population;

    }

    public static void main(String[] args) {
        City c1 = new City("Yerevan", 1060138);
        City c2 = new City("Moscow", 12641000);
        City c3 = new City("New York", 19680000);
        City c4 = new City("Paris",2220000);
    }




}
