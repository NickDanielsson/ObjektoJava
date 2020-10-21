package Övning3b_Listor;

/**
 * Created by Nick Danielsson
 * Date 2020-09-27
 * Time 10:52
 * Project ObjektoJava
 */
public class Person2 {

    String name;
    String idNr;

    public Person2 () {

    }

    public Person2(String name, String idNr) {
        this.name = name;
        this.idNr = idNr;
    }

    @Override
    public String toString() {
        return name + " " + idNr;

    }
}
