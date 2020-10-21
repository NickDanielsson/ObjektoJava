package Lektion2_Polymorfism;

import Lektion3_Interface.Hjulburen;
import Lektion3_Interface.Printable;

/**
 * Created by Nick Danielsson
 * Date 2020-09-22
 * Time 10:39
 * Project ObjektoJava
 */
public abstract class Fordon implements Printable {

    protected int hastighet;
    protected int vikt;

    public Fordon(){

    }

    public Fordon(int hastighet, int vikt) {
        this.hastighet = hastighet;
        this.vikt = vikt;
    }

    public int getHastighet() {
        return hastighet;
    }

    public int getVikt() {
        return vikt;
    }

    public int newSpeed(int newSpeed){

        return this.hastighet = newSpeed;
    }

    abstract void printMe();
    public void printFordon (Fordon fordon){
        fordon.printMe();
    }

}
