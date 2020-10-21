package Övning3b_Listor;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nick Danielsson
 * Date 2020-09-27
 * Time 10:52
 * Project ObjektoJava
 */
public class Lärare2 extends Person2{


    List<String> kurser = new LinkedList<>();

    public Lärare2 () {}

    public Lärare2(String name, String idNr, List<String> kurser) {
        super(name, idNr);
        this.kurser = kurser;
    }

    @Override
    public String toString() {
        return "Lärare" +  "\n" + name  +"\nkurs " + "\nidNr " + idNr;


    }
}
