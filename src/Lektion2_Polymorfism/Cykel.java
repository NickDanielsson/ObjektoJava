package Lektion2_Polymorfism;

import Lektion3_Interface.Hjulburen;
import Lektion3_Interface.Printable;

/**
 * Created by Nick Danielsson
 * Date 2020-09-22
 * Time 10:55
 * Project ObjektoJava
 */
public class Cykel extends Fordon implements Printable, Hjulburen {

    protected int antalVäxlar;
    protected int växelJustNu;
    final int antalHjul = 2;


    public Cykel() {

    }
    public void printFordon (Fordon fordon){
        fordon.printMe();
    }

    @Override
    public void printMe() {
        System.out.println("jag är en Cykel med hastighet: " + hastighet + " Vikt: " + vikt + " Antal växlar: " + antalVäxlar +
                " Min växel just nu är: " + växelJustNu);
    }

    public Cykel(int hastighet, int vikt, int antalVäxlar, int växelJustNu) {
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = växelJustNu;
    }

    public int växla (int växel){
        return this.växelJustNu = växel;
    }

    @Override
    public void printViaInterface() {
        System.out.println("jag är en Cykel med hastighet: " + hastighet + " Vikt: " + vikt + " Antal växlar: " + antalVäxlar +
                " Min växel just nu är: " + växelJustNu);
    }

    @Override
    public int getAntalHjul() {
        return antalHjul;
    }
}
