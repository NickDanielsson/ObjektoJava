package Övning3b_Listor;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nick Danielsson
 * Date 2020-09-25
 * Time 15:54
 * Project ObjektoJava
 */
public class Lärare extends Person{


    List<String> kurser = new LinkedList<>();

    public Lärare () {}

    public Lärare(String name, String idNr, List<String> kurser) {
        super(name, idNr);
        this.kurser = kurser;
    }

    @Override
    public String toString() {
        return "Lärare" +  "\n" + name  +"\nkurs " + "\nidNr " + idNr;


    }
}
