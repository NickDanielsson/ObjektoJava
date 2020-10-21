package Lektion4_Listor_Arrayer;

import java.util.Arrays;

/**
 * Created by Nick Danielsson
 * Date 2020-09-25
 * Time 10:09
 * Project ObjektoJava
 */
public class Kurs {

    protected String kursNamn;
    Student [] Studenter = new Student[10];
    protected Lärare teacher;


    public Kurs(Student[] studenter, Lärare teacher, String  kursNamn) {
        Studenter = studenter;
        this.teacher = teacher;
        this.kursNamn = kursNamn;
    }

    @Override
    public String toString() {
        return "kursnamn: " + kursNamn + "\nStudenter: " + Arrays.toString(Studenter) + "\nLärare: " + teacher;



    }
}
