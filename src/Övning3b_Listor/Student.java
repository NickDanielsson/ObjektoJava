package Övning3b_Listor;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nick Danielsson
 * Date 2020-09-25
 * Time 15:53
 * Project ObjektoJava
 */
public class Student extends Person {

    List<String> kurser = new LinkedList<>();

    public Student () {}

    public Student(String name, String idNr, List<String> kurser) {
        super(name, idNr);
        this.kurser = kurser;
    }

    @Override
    public String toString() {
        return "Student " + "\nNamn: " + name  + "\nidNr " + idNr + "\nKursers: " + kurser.toString();


    }
}
