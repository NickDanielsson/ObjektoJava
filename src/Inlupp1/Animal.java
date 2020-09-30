package Inlupp1;

/**
 * Created by Nick Danielsson
 * Date 2020-09-28
 * Time 10:08
 * Project ObjektoJava
 */
public class Animal implements IAnimalfood {

    // enum
    protected enum Animalfood {
        HUNDFODER("Hundfoder"), KATTFODER("Kattfoder"), ORMPELLETS("Ormpellets");
        final String foodName;

        Animalfood(String name) {
            foodName = name;
        }
    }
    // Inkapsling
    protected int weight;
    protected String name;

    public Animal() {

    }

    public Animal(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    @Override
    public void getFood() {

    }
}
