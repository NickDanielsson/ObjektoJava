package Lektion4_Listor_Arrayer;

/**
 * Created by Nick Danielsson
 * Date 2020-09-25
 * Time 09:51
 * Project ObjektoJava
 */
public class Person {

    protected String name;
    protected String idNr;

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
