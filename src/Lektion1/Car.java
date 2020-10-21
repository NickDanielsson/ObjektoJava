package Lektion1;

/**
 * Created by Nick Danielsson
 * Date 2020-09-21
 * Time 14:45
 * Project ObjektoJava
 */
public class Car {
    private String regNr;
    private String modell;
    private String brand;
    private CarOwner carOwner;


    public Car (){

    }

    public Car(String regNr, String modell, String brand, CarOwner carOwner) {
        this.regNr = regNr;
        this.modell = modell;
        this.brand = brand;
        this.carOwner = carOwner;
    }
    public void newCarOwner (CarOwner newCarOwner){
        this.carOwner = newCarOwner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNr='" + regNr + '\'' +
                ", modell='" + modell + '\'' +
                ", brand='" + brand + '\'' +
                ", carOwner=" + carOwner +
                '}';
    }
}
