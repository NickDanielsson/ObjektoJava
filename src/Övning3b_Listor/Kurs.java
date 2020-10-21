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
public class Kurs {

     String kursNamn;
     List<Övning3b_Listor.Student> students;
     Övning3b_Listor.Lärare teacher;

    public Kurs () {}

    public Kurs(String kursNamn, List<Student> students, Lärare teacher) {
        this.kursNamn = kursNamn;
        this.students = students;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "kursnamn: " + kursNamn + "\nStudenter: "  + "\nLärare: " + teacher;


    }
}
