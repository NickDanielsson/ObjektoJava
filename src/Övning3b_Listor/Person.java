package Övning3b_Listor;

/**
 * Created by Nick Danielsson
 * Date 2020-09-25
 * Time 15:52
 * Project ObjektoJava
 */
public class Person {

     String name;
     String idNr;

    public Person () {

    }

    public Person(String name, String idNr) {
        this.name = name;
        this.idNr = idNr;
    }

    @Override
    public String toString() {
        return name + " " + idNr;

    }
}
