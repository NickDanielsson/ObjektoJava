package Övning3b_Listor;

import java.util.List;

/**
 * Created by Nick Danielsson
 * Date 2020-09-27
 * Time 10:54
 * Project ObjektoJava
 */
public class Kurs2 {

    String kursNamn;

    Övning3b_Listor.Lärare teacher;

    public Kurs2 () {}

    public Kurs2 (String kursNamn, Lärare teacher) {
        this.kursNamn = kursNamn;

        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "kursnamn: " + kursNamn + "\nStudenter: "  + "\nLärare: " + teacher;


    }
}
