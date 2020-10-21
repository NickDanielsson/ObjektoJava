package Övning3b_Listor;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nick Danielsson
 * Date 2020-09-27
 * Time 10:53
 * Project ObjektoJava
 */
public class Student2 extends Person2{



    public Student2 () {}

    public Student2 (String name, String idNr) {
        super(name, idNr);

    }

    @Override
    public String toString() {
        return "Student " + "\nNamn: " + name  + "\nidNr " + idNr;


    }
}
