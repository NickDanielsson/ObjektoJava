package Lektion8_Filhantering_TDD;

import java.util.Scanner;

/**
 * Created by Nick Danielsson
 * Date 2020-10-06
 * Time 11:43
 * Project ObjektoJava
 */
public class Car {

    protected double milesNow;
    protected double milesLastYear;
    protected double gasYear;

    public Car () {}

    public Car(double milesNow, double milesLastYear, double gasYear) {
        this.milesNow = milesNow;
        this.milesLastYear = milesLastYear;
        this.gasYear = gasYear;
    }

    public double getMilesNow() {
        return milesNow;
    }

    public void setMilesNow(double milesNow) {
        this.milesNow = milesNow;
    }

    public double getMilesLastYear() {
        return milesLastYear;
    }

    public void setMilesLastYear(double milesLastYear) {
        this.milesLastYear = milesLastYear;
    }

    public double getGasYear() {
        return gasYear;
    }

    public void setGasYear(double gasYear) {
        this.gasYear = gasYear;
    }

    public double milesDriven(){
        return milesNow - milesLastYear;
    }
    public double gasPerMile(){
        return gasYear / milesDriven();
    }

    public static void main (String [] Args){

        Scanner sc = new Scanner(System.in);
        Car c1 = new Car();
        System.out.println("Ange befintligt miltal: ");
        c1.milesNow = sc.nextDouble();
        System.out.println("Ange miltal för ett år sedan: ");
        c1.milesLastYear = sc.nextDouble();
        System.out.println("Ange hur många liter bensin som gick åt förra året:");
        c1.gasYear = sc.nextDouble();

        System.out.println("Antal körda mil: " + c1.milesDriven());
        System.out.println("Antal liter bensin: " + c1.getGasYear());
        System.out.println("Förbrukning per mil: " + c1.gasPerMile());
    }

}