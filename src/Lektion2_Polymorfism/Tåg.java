package Lektion2_Polymorfism;

import Lektion3_Interface.Printable;

/**
 * Created by Nick Danielsson
 * Date 2020-09-22
 * Time 10:46
 * Project ObjektoJava
 */
public class Tåg extends Fordon implements Printable {

    protected int antalVagnar;

    public Tåg () {

    }

    @Override
    void printMe() {
        System.out.println("jag är ett Tåg med hastighet: " + hastighet + " Vikt: " + vikt + " Anta vagnar: " + antalVagnar);
    }

    public Tåg(int hastighet, int vikt, int antalVagnar) {
        super(hastighet, vikt);
        this.antalVagnar = antalVagnar;
    }

    public int kopplaVagn(){

       return this.antalVagnar + 1;

    }

    @Override
    public void printViaInterface() {
        System.out.println("jag är ett Tåg med hastighet: " + hastighet + " Vikt: " + vikt + " Anta vagnar: " + antalVagnar);
    }

}
