package Lektion4_Listor_Arrayer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nick Danielsson
 * Date 2020-09-25
 * Time 10:03
 * Project ObjektoJava
 */
public class Lärare extends Person{
    String [] kurs = new String[100];
   // List<String> kurser1 = new LinkedList<String>();

    public Lärare () {}

    public Lärare(String name, String idNr,String[] kurs) {
        super(name, idNr);
        this.kurs = kurs;
    }

    @Override
    public String toString() {
        return "Lärare" +  "\n" + name  +"\nkurs " + Arrays.toString(kurs) + "\nidNr " + idNr;


    }
}
