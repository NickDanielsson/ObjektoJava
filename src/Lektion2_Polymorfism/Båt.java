package Lektion2_Polymorfism;

import Lektion3_Interface.Printable;

/**
 * Created by Nick Danielsson
 * Date 2020-09-22
 * Time 10:44
 * Project ObjektoJava
 */
public class Båt extends Fordon implements Printable {

    protected int dödvikt;

    public Båt() {

    }

    @Override
    void printMe() {
        System.out.println("jag är en Båt med hastighet: " + hastighet + " Vikt: " + vikt + " Dödvikt: " + dödvikt);
    }

    public Båt(int hastighet, int vikt, int dödvikt) {
        super(hastighet, vikt);
        this.dödvikt = dödvikt;
    }

    public  void turnLeft(){

    }

    public void turnRight(){

    }

    @Override
    public void printViaInterface() {
        System.out.println("jag är en Båt med hastighet: " + hastighet + " Vikt: " + vikt + " Dödvikt: " + dödvikt);
    }
}
