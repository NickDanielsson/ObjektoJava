package Övning3b_Listor;

/**
 * Created by Nick Danielsson
 * Date 2020-09-27
 * Time 10:58
 * Project ObjektoJava
 */
public class Deltagande {
    protected Student student;
    protected Kurs2 kurs;

    public Deltagande(Student student, Kurs2 kurs) {
        this.student = student;
        this.kurs = kurs;
    }

    @Override
    public String toString() {
        return "Deltagande{" +
                "student=" + student +
                ", kurs=" + kurs +
                '}';
    }
}
