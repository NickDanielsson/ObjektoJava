package Lektion4_Listor_Arrayer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nick Danielsson
 * Date 2020-09-25
 * Time 09:58
 * Project ObjektoJava
 */
public class Student extends Person {

    String [] kurser = new String[100];
  //  List<String> kurser1 = new LinkedList<String>();

    public Student (){}

    public Student(String name, String idNr, String[] kurser) {
        super(name, idNr);
        this.kurser = kurser;
    }

    @Override
    public String toString() {
        return "Student " + "\nNamn: " + name  + "\nidNr " + idNr +

                "\nkurser: " + Arrays.toString(kurser);
    }
}
